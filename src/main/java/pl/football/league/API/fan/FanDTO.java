package pl.football.league.API.fan;

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

    public FanDTO(){

    }

    public FanDTO(Fan fan){
        fanID = fan.getFanID();
        name = fan.getName();
        surname = fan.getSurname();
        nickname = fan.getNickname();
        password = fan.getPassword();
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
}
