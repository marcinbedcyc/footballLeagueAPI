package pl.football.league.API.fan;

import pl.football.league.API.footballer.FootballerDTO;
import pl.football.league.API.team.TeamDTO;

import java.util.Set;
import java.util.stream.Collectors;

public class FanDTO {
    /**
     * Identyfikator kibica
     */
    private long fanID;

    /**
     * Imię kibica
     */
    private String name;

    /**
     * Nazwisko kibica
     */
    private String surname;

    /**
     * Wiek kibica
     */
    private Integer age;

    /**
     * Pseudonim kibica
     */
    private String nickname;

    /**
     * Hasło kibica
     */
    private  String password;

    /**
     * Zbiór wspieranych piłkarzy przez kibica
     */
    private Set<FootballerDTO> supportedFootballers;

    /**
     * Zbiór wspieranych drużyn przez kibica
     */
    private Set<TeamDTO> supportedTeams;

    public FanDTO(){

    }

    public FanDTO(Fan fan){
        fanID = fan.getFanID();
        name = fan.getName();
        surname = fan.getSurname();
        nickname = fan.getNickname();
        password = fan.getPassword();
        if(fan.getSupportedFootballers() != null)
            supportedFootballers = fan.getSupportedFootballers().stream().map(FootballerDTO::new).collect(Collectors.toSet());
        supportedTeams = fan.getSupportedTeams().stream().map(TeamDTO::new).collect(Collectors.toSet());
    }

    public long getFanID() {
        return fanID;
    }

    public void setFanID(long fanID) {
        this.fanID = fanID;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<FootballerDTO> getSupportedFootballers() {
        return supportedFootballers;
    }

    public void setSupportedFootballers(Set<FootballerDTO> supportedFootballers) {
        this.supportedFootballers = supportedFootballers;
    }

    public Set<TeamDTO> getSupportedTeams() {
        return supportedTeams;
    }

    public void setSupportedTeams(Set<TeamDTO> supportedTeams) {
        this.supportedTeams = supportedTeams;
    }
}
