package models.persons.subtypes;

import models.subtypes.Persons;

public class Students extends Persons{
    private Integer grade;
    private String clubParticipant;
    private Boolean problematic;

    public Students(){
        this.setGrade(3);
        this.setClubParticipant("Basketball");
        this.setProblematic(Boolean.FALSE);
    }

    public Students(Boolean problematic){
        this();
        this.setProblematic(problematic);
    }

    public Students(String clubParticipant){
        this();
        this.setClubParticipant(clubParticipant);
    }


    public String goToSchool() {
        return "I go to school for learning and recreative purposes";
    }

    public String getPaid() {
        return "I can get sort of pay by gettng a Scolarship every period";
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getClubParticipant() {
        return clubParticipant;
    }

    public void setClubParticipant(String clubParticipant) {
        this.clubParticipant = clubParticipant;
    }

    public Boolean getProblematic() {
        return problematic;
    }

    public void setProblematic(Boolean problematic) {
        this.problematic = problematic;
    }
}
