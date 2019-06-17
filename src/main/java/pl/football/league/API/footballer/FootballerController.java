package pl.football.league.API.footballer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FootballerController {
    /*
    - dodawanie pilkarza
    - edycja pilkarza
    - wyszukiwanie po druzynie
    - wypisanie jego druzyny
    - wypisanie pilkarza
    - wypisanie pilkarzy
    - wypisanie jego fanów
     */

    @Autowired
    private FootballerService footballerService;

    @RequestMapping("/footballers")
    public List<FootballerDTO> getFootballers(){
        return footballerService.getAllFootballers();
    }

    @RequestMapping(value =  "/footballers/add", method = RequestMethod.POST)
    public void addFootballer(@RequestBody Footballer footballer){
        footballerService.addFootballer(footballer);
    }

    @RequestMapping(value = "/footballers/update", method = RequestMethod.PUT)
    public void updateFootballer(@RequestBody Footballer footballer){
        footballerService.addFootballer(footballer);
    }

    @RequestMapping(value =  "/footballers/delete", method = RequestMethod.DELETE)
    public void deleteFootballer(@RequestBody Footballer footballer){
        footballerService.deleteFootballer(footballer);
    }

}
