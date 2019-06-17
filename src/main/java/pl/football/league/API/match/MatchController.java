package pl.football.league.API.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    private MatchService matchService;

    @RequestMapping("/matches")
    public List<Match> getMatches(){
        return matchService.getAllMatches();
    }

    @RequestMapping(value = "/matches/add", method = RequestMethod.POST)
    public void addMatch(@RequestBody Match match){
        matchService.addMatch(match);
    }

    @RequestMapping(value = "/matches/update", method = RequestMethod.PUT)
    public void updateMatch(@RequestBody Match match){
        matchService.updateMatch(match);
    }

    @RequestMapping(value = "/matches/delete", method = RequestMethod.DELETE)
    public void deleteMatch(@RequestBody Match match){
        matchService.deleteMatch(match);
    }
}
