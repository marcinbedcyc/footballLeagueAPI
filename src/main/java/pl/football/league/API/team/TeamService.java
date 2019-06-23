package pl.football.league.API.team;

import pl.football.league.API.coach.Coach;
import org.springframework.stereotype.Service;
import pl.football.league.API.fan.FanDTO;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Resource
    private TeamRepository teamRepository;

    public List<TeamDTO> getAllTeams(){
        Iterable<Team> teams = teamRepository.findAll();
        List<TeamDTO> teamssDTO = new LinkedList<>();
        for(Team t : teams){
            teamssDTO.add(new TeamDTO(t));
        }
        return teamssDTO;
    }

    public TeamDTO getTeamByCoach(Coach coach){
        return  new TeamDTO(teamRepository.findByCoach(coach));
    }

    public void addTeam(Team team){
        teamRepository.save(team);
    }

    public void updateTeam(Team team){
        teamRepository.save(team);
    }

    public void deleteTeam(Team team){
        teamRepository.delete(team);
    }

    public Set<FanDTO> getFans(long id){
        Team team = teamRepository.findById(id).get();
        return team.getTeamFans().stream().map(FanDTO::new).collect(Collectors.toSet());
    }
}
