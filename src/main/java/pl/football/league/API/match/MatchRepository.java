package pl.football.league.API.match;

import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, MatchID> {
}
