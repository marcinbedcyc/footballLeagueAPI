package pl.football.league.API.footballer;

import pl.football.league.API.team.TeamDTO;

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

    public FootballerDTO(){

    }

    public FootballerDTO(Footballer footballer){
        name = footballer.getName();
        surname = footballer.getSurname();
        position = footballer.getPosition();
        number = footballer.getNumber();
        footballerID = footballer.getFootballerID();
        team = new TeamDTO(footballer.getTeam());
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
}
