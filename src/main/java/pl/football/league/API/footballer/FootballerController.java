package pl.football.league.API.footballer;

import org.springframework.web.bind.annotation.*;
import pl.football.league.API.fan.FanDTO;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
public class FootballerController {
    @Resource
    private FootballerService footballerService;

    @RequestMapping("/footballers")
    public List<FootballerDTO> getFootballers(){
        return footballerService.getAllFootballers();
    }

    @PostMapping("/footballers/add")
    public void addFootballer(@RequestBody Footballer footballer){
        footballerService.addFootballer(footballer);
    }

    @PutMapping("/footballers/{id}/update")
    public void updateFootballer(@RequestBody Footballer footballer, @PathVariable long id){
        if(footballer.getFootballerID() == id)
            footballerService.addFootballer(footballer);
    }

    @DeleteMapping("/footballers/{id}/delete")
    public void deleteFootballer(@RequestBody Footballer footballer, @PathVariable long id){
        if(footballer.getFootballerID() == id)
            footballerService.deleteFootballer(footballer);
    }

    @RequestMapping("/footballers/{id}/fans")
    public Set<FanDTO> getFans(@PathVariable long id){
        return footballerService.getFans(id);
    }

}
