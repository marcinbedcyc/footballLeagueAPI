package pl.football.league.API.footballer;

import pl.football.league.API.fan.FanDTO;
import pl.football.league.API.team.TeamDTO;

import java.util.Set;
import java.util.stream.Collectors;

public class FootballerDTO {
    /**
     * Identyfiaktor piłkarza
     */
    private long footballerID;

    /**
     * Imię piłkarza
     */
    private String name;

    /**
     * Nazwisko piłkarza
     */
    private String surname;

    /**
     * Pozycja, na której gra piłkarz
     */
    private String position;

    /**
     * Numer na koszulce piłakrza
     */
    private Integer number;

    /**
     * Drużyna, w której gra piłkarz
     */
    private TeamDTO team;

    /**
     * Zbiór kibiców, którzy wspierają piłkarza reprezentowanego przez obiekt tej klasy
     */
    private Set<FanDTO> fans;

    public FootballerDTO(){

    }

    public FootballerDTO(Footballer footballer){
        name = footballer.getName();
        surname = footballer.getSurname();
        position = footballer.getPosition();
        number = footballer.getNumber();
        footballerID = footballer.getFootballerID();
        team = new TeamDTO(footballer.getTeam());
        fans = footballer.getFans().stream().map(FanDTO::new).collect(Collectors.toSet());
    }

    public long getFootballerID() {
        return footballerID;
    }

    public void setFootballerID(long footballerID) {
        this.footballerID = footballerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public Set<FanDTO> getFans() {
        return fans;
    }

    public void setFans(Set<FanDTO> fans) {
        this.fans = fans;
    }
}
