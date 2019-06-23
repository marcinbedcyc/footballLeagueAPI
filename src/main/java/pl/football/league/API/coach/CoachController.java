package pl.football.league.API.coach;

import pl.football.league.API.team.TeamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CoachController {

    @Resource
    private CoachService coachService;
    @Resource
    private TeamService teamService;

    @RequestMapping("/coaches")
    public List<CoachDTO> getCoaches(){
        return coachService.getAllCoaches();
    }

    @RequestMapping("/coaches/{surname}")
    public List<CoachDTO> getCoachesBySurname(@PathVariable String surname){
        return coachService.findBySurname(surname);
    }

    @RequestMapping("/coaches/{name}/{surname}")
    public CoachDTO getCoach(@PathVariable String name, @PathVariable String surname){
        return coachService.findCoach(name, surname);
    }

    @PostMapping("/coaches/add")
    public void addCoach(@RequestBody Coach coach){
        coachService.addCoach(coach);
    }

    @PutMapping("/coaches/{id}/update")
    public void updateCoach(@RequestBody Coach coach,@PathVariable long id){
        if(coach.getCoachID() == id)
            coachService.updateCoach(coach);
    }

    @DeleteMapping("/coaches/{id}/delete")
    public void deleteCoach(@RequestBody Coach coach, @PathVariable long id){
        if(coach.getCoachID() == id)
            if(teamService.getTeamByCoach(coach) == null)
                coachService.deleteCoach(coach);
    }
}
