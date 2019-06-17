package pl.football.league.API.fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FanService {
    @Autowired
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
}
