package pl.football.league.API.coach;

import pl.football.league.API.team.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoachController {

    @Autowired
    private CoachService coachService;
    @Autowired
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

    @RequestMapping(method =  RequestMethod.POST, value="/coaches/add")
    public void addCoach(@RequestBody Coach coach){
        coachService.addCoach(coach);
    }

    @RequestMapping(method =  RequestMethod.PUT, value="/coaches/update")
    public void updateCoach(@RequestBody Coach coach){
        coachService.updateCoach(coach);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/coaches/delete")
    public void deleteCoach(@RequestBody Coach coach){
        if(teamService.getTeamByCoach(coach) == null)
            coachService.deleteCoach(coach);
    }
}
