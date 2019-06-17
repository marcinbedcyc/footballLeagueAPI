package pl.football.league.API.team;

import pl.football.league.API.coach.Coach;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByCoach(Coach coach);
}
