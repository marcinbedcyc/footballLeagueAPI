package pl.football.league.API.fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FanController {

    @Autowired
    private FanService fanService;

    @RequestMapping("/fans")
    public List<FanDTO> getFans(){
        return fanService.getAllFans();
    }

    @RequestMapping(value =  "/fans/add", method = RequestMethod.POST)
    public void addFan(@RequestBody Fan fan){
        fanService.addFan(fan);
    }

    @RequestMapping(value = "/fans/update", method = RequestMethod.PUT)
    public void updateFan(@RequestBody Fan fan){
        fanService.updateFan(fan);
    }

    @RequestMapping(value = "/fans/delete", method = RequestMethod.DELETE)
    public void deleteFan(@RequestBody Fan fan){
        fanService.deleteFan(fan);
    }
}
