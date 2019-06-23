package pl.football.league.API.coach;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
public class CoachService {

    @Resource
    private CoachRepository coachRepository;

    public List<CoachDTO> getAllCoaches(){
        Iterable<Coach> coaches = coachRepository.findAll();
        List<CoachDTO> coachesDTO = new LinkedList<>();
        for(Coach c : coaches){
            coachesDTO.add(new CoachDTO(c));
        }
        return coachesDTO;
    }

    public List<CoachDTO> findBySurname(String surname){
        Iterable<Coach> coaches = coachRepository.getCoachesBySurname(surname);
        List<CoachDTO> coachesDTO = new LinkedList<>();
        for(Coach c : coaches){
            coachesDTO.add(new CoachDTO(c));
        }
        return coachesDTO;
    }

    public List<CoachDTO> findByName(String name){
        Iterable<Coach> coaches = coachRepository.getCoachesByName(name);
        List<CoachDTO> coachesDTO = new LinkedList<>();
        for(Coach c : coaches){
            coachesDTO.add(new CoachDTO(c));
        }
        return coachesDTO;
    }

    public List<CoachDTO> findByAge(int age){
        Iterable<Coach> coaches = coachRepository.getCoachesByAge(age);
        List<CoachDTO> coachesDTO = new LinkedList<>();
        for(Coach c : coaches){
            coachesDTO.add(new CoachDTO(c));
        }
        return coachesDTO;
    }

    public CoachDTO findCoach(String name, String surname){
        return new CoachDTO(coachRepository.getCoachByNameAndSurname(name, surname));
    }

    public void addCoach(Coach coach){
        coachRepository.save(coach);
    }

    public void updateCoach(Coach coach){
        coachRepository.save(coach);
    }

    public void deleteCoach(Coach coach){
        coachRepository.delete(coach);
    }
}
