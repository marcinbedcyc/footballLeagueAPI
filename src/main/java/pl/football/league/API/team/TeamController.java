package pl.football.league.API.team;

import org.springframework.web.bind.annotation.*;
import pl.football.league.API.fan.FanDTO;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
public class TeamController {
    /*
       - wypisanie druzyn
       - wyszukanie po naziwe
       - wyszukanie po trenerze
       - edycja druzyny
       - usuniecie druzyny
     */

    @Resource
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<TeamDTO> getTeams() {
        return teamService.getAllTeams();
    }

    @DeleteMapping("/teams/{id}/delete")
    public void deleteTeam(@RequestBody Team team, @PathVariable long id){
        if(team.getTeamID() == id)
            teamService.deleteTeam(team);
    }

    @PostMapping("/teams/add")
    public void addTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }

    @PutMapping("/teams/{id}/update")
    public void updateTeam(@RequestBody Team team, @PathVariable long id){
        if(team.getTeamID() == id)
            teamService.updateTeam(team);
    }

    @RequestMapping("/teams/{id}/fans")
    public Set<FanDTO> getFans(@PathVariable long id){
        return teamService.getFans(id);
    }

}
