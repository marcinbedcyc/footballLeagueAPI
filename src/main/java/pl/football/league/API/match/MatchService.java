package pl.football.league.API.match;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
public class MatchService {

    @Resource
    private MatchRepository matchRepository;

    public List<Match> getAllMatches(){
        List matches = new LinkedList();
        matchRepository.findAll().forEach(matches::add);
        return matches;
    }

    public void addMatch(Match match){
        matchRepository.save(match);
    }

    public void updateMatch(Match match){
        matchRepository.save(match);
    }

    public void deleteMatch(Match match){
        matchRepository.delete(match);
    }
}
