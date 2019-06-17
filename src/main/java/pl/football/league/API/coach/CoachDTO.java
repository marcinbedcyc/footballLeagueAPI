package pl.football.league.API.coach;

public class CoachDTO {
    /**
     * Identyfikatora trenera
     */
    private long coachID;

    /**
     * Imię trenera
     */
    private String name;

    /**
     * Nazwisko trenera
     */
    private String surname;

    /**
     * Wiek trenera
     */
    private Integer age;

    /**
     * Tworzy nowy obiekt trenera i nie inicjalizuje żadnych wartości
     */
    public CoachDTO(){

    }

    /**
     * Tworzy nowy obiekt trenera
     * @param id identyfikator trenera
     * @param name imię trenera
     * @param surname nazwisko trenera
     * @param age wiek trenera
     */
    public CoachDTO(long id, String name, String surname, Integer age){
        coachID = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * Tworzy obiekt Coach DTO
     * @param coach obiekt trener z bazy danych
     */
    public CoachDTO(Coach coach){
        coachID = coach.getCoachID();
        name = coach.getName();
        surname = coach.getSurname();
        age = coach.getAge();
    }

    public long getCoachID() {
        return coachID;
    }

    public void setCoachID(long coachID) {
        this.coachID = coachID;
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
}
