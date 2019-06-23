package pl.football.league.API.fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.football.league.API.footballer.Footballer;
import pl.football.league.API.footballer.FootballerDTO;
import pl.football.league.API.team.Team;
import pl.football.league.API.team.TeamDTO;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FanService {
    @Resource
    private FanRepository fanRepository;

    public List<FanDTO> getAllFans(){
        Iterable<Fan> fans = fanRepository.findAll();
        List<FanDTO> fansDTO = new LinkedList<>();
        for(Fan f : fans){
            fansDTO.add(new FanDTO(f));
        }
        return fansDTO;
    }

    public void addFan(Fan fan){
        fanRepository.save(fan);
    }

    public void updateFan(Fan fan){
        fanRepository.save(fan);
    }

    public void deleteFan(Fan fan){
        fanRepository.delete(fan);
    }

    public Set<TeamDTO> getSupportedTeams(long id){
        Fan fan = fanRepository.findById(id).get();
        return fan.getSupportedTeams().stream().map(TeamDTO::new).collect(Collectors.toSet());
    }

    public Set<FootballerDTO> getSupportedFootballers(long id){
        Fan fan = fanRepository.findById(id).get();
        return fan.getSupportedFootballers().stream().map(FootballerDTO::new).collect(Collectors.toSet());
    }
}
