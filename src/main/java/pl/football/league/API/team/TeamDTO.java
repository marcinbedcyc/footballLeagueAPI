package pl.football.league.API.team;

import pl.football.league.API.coach.CoachDTO;

import java.sql.Date;

public class TeamDTO {
     /**
      * Identyfikator drużyny
      */
     private long teamID;

     /**
      * Nazwa drużyny
      */
     private String name;

     /**
      * Data założenia druzyny
      */
     private Date creationDate;

     /**
      * Ilość punktów zdobytych przez drużynę w lidze
      */
     private int points;

     /**
      * Ilość meczów wygranych przez drużynę
      */
     private int wins;

     /**
      * Ilość meczów zremisowanych przez drużynę
      */
     private int draws;

     /**
      * Ilość meczów przegranych przez drużynę
      */
     private int loses;

     /**
      * Trener drużyny
      */
     private CoachDTO coach;

     public TeamDTO(Team team){
          name = team.getName();
          teamID = team.getTeamID();
          points = team.getPoints();
          wins = team.getWins();
          draws = team.getDraws();
          loses = team.getLoses();
          creationDate = team.getCreationDate();
          coach = new CoachDTO(team.getCoach());
     }

     public long getTeamID() {
          return teamID;
     }

     public void setTeamID(long teamID) {
          this.teamID = teamID;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Date getCreationDate() {
          return creationDate;
     }

     public void setCreationDate(Date creationDate) {
          this.creationDate = creationDate;
     }

     public int getPoints() {
          return points;
     }

     public void setPoints(int points) {
          this.points = points;
     }

     public int getWins() {
          return wins;
     }

     public void setWins(int wins) {
          this.wins = wins;
     }

     public int getDraws() {
          return draws;
     }

     public void setDraws(int draws) {
          this.draws = draws;
     }

     public int getLoses() {
          return loses;
     }

     public void setLoses(int loses) {
          this.loses = loses;
     }

     public CoachDTO getCoach() {
          return coach;
     }

     public void setCoach(CoachDTO coach) {
          this.coach = coach;
     }
}
