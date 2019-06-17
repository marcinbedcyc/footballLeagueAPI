package pl.football.league.API.footballer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FootballerService {

    @Autowired
    private FootballerRepository footballerRespository;

    public List<FootballerDTO> getAllFootballers(){
        Iterable<Footballer> footballers = footballerRespository.findAll();
        List<FootballerDTO> footballersDTO = new LinkedList<>();
        for(Footballer f : footballers){
            footballersDTO.add(new FootballerDTO(f));
        }
        return footballersDTO;
    }

    public void addFootballer(Footballer footballer){
        footballerRespository.save(footballer);
    }

    public void updateFootballer(Footballer footballer){
        footballerRespository.save(footballer);
    }

    public void deleteFootballer(Footballer footballer){
        footballerRespository.delete(footballer);
    }
}
