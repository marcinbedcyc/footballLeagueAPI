package pl.football.league.API.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    /*
       - wypisanie druzyn
       - wyszukanie po naziwe
       - wyszukanie po trenerze
       - edycja druzyny
       - usuniecie druzyny
     */

    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<TeamDTO> getTeams() {
        return teamService.getAllTeams();
    }

    @RequestMapping(value = "/teams/delete", method = RequestMethod.DELETE)
    public void deleteTeam(@RequestBody Team team){
        teamService.deleteTeam(team);
    }

    @RequestMapping(value = "/teams/add", method = RequestMethod.POST)
    public void addTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }

    @RequestMapping(value = "/teams/delete", method = RequestMethod.PUT)
    public void updateTeam(@RequestBody Team team){
        teamService.updateTeam(team);
    }

}
