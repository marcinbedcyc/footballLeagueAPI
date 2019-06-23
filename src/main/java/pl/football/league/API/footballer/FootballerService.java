package pl.football.league.API.footballer;

import org.springframework.stereotype.Service;
import pl.football.league.API.fan.Fan;
import pl.football.league.API.fan.FanDTO;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FootballerService {

    @Resource
    private FootballerRepository footballerRepository;

    public List<FootballerDTO> getAllFootballers(){
        Iterable<Footballer> footballers = footballerRepository.findAll();
        List<FootballerDTO> footballersDTO = new LinkedList<>();
        for(Footballer f : footballers){
            footballersDTO.add(new FootballerDTO(f));
        }
        return footballersDTO;
    }

    public void addFootballer(Footballer footballer){
        footballerRepository.save(footballer);
    }

    public void updateFootballer(Footballer footballer){
        footballerRepository.save(footballer);
    }

    public void deleteFootballer(Footballer footballer){
        footballerRepository.delete(footballer);
    }

    public Set<FanDTO> getFans(long id){
        Footballer footballer = footballerRepository.findById(id).get();
        return footballer.getFans().stream().map(FanDTO::new).collect(Collectors.toSet());
    }
}
