package pl.football.league.API.team;

import pl.football.league.API.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.football.league.API.coach.CoachDTO;

import java.util.LinkedList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
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
}
