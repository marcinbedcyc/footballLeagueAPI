package pl.football.league.API.fan;

import org.springframework.web.bind.annotation.*;
import pl.football.league.API.footballer.FootballerDTO;
import pl.football.league.API.team.TeamDTO;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
public class FanController {

    @Resource
    private FanService fanService;

    @RequestMapping("/fans")
    public List<FanDTO> getFans(){
        return fanService.getAllFans();
    }

    @PostMapping("/fans/add")
    public void addFan(@RequestBody Fan fan){
        fanService.addFan(fan);
    }

    @PutMapping("/fans/{id}/update")
    public void updateFan(@RequestBody Fan fan, @PathVariable long id){
        if(fan.getFanID() == id)
            fanService.updateFan(fan);
    }

    @DeleteMapping("/fans/{id}/delete")
    public void deleteFan(@RequestBody Fan fan, @PathVariable long id){
        if(fan.getFanID() == id)
            fanService.deleteFan(fan);
    }

    @RequestMapping("/fans/{id}/supportedTeams")
    public Set<TeamDTO> getSupportedTeams(@PathVariable long id){
        return fanService.getSupportedTeams(id);
    }

    @RequestMapping("/fans/{id}/supportedFootballers")
    public Set<FootballerDTO> getSupportedFootballers(@PathVariable long id){
        return  fanService.getSupportedFootballers(id);
    }

}
