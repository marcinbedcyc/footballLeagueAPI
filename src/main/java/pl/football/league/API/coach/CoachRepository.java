package pl.football.league.API.coach;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoachRepository extends CrudRepository<Coach, Long> {
    List<Coach> getCoachesBySurname(String surname);
    List<Coach> getCoachesByName(String name);
    List<Coach> getCoachesByAge(int age);
    Coach getCoachByNameAndSurname(String name, String surname);
}
