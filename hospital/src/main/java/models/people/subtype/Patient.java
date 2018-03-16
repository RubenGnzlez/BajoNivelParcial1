package models.people.subtype;



import models.enums.Gender;
import models.people.Person;

public class Patient extends Person{
    private Integer patientId;
    private Integer dayLastVisited;
    private Integer monthLastVisited;
    private Integer yearLastVisited;
    private Boolean sick;
    private String sicknessName;
    private String lastDoctor;

    public Patient(){
        this.setPatientId(1000);
        this.setDayLastVisited(2);
        this.setMonthLastVisited(3);
        this.setYearLastVisited(2016);
        this.setSick(Boolean.TRUE);
        this.setSicknessName("Cold");
        this.setLastDoctor("Juan Perez");
    }

    public Patient(String lastDoctor){
        this();
        this.setLastDoctor(lastDoctor);
    }

    public String asist(String a) {
        return "I'm just a "+ a + ",so like a patient, I assist when Im sick";
    }


    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDayLastVisited() {
        return dayLastVisited;
    }

    public void setDayLastVisited(Integer dayLastVisited) {
        this.dayLastVisited = dayLastVisited;
    }

    public Integer getMonthLastVisited() {
        return monthLastVisited;
    }

    public void setMonthLastVisited(Integer monthLastVisited) {
        this.monthLastVisited = monthLastVisited;
    }

    public Integer getYearLastVisited() {
        return yearLastVisited;
    }

    public void setYearLastVisited(Integer yearLastVisited) {
        this.yearLastVisited = yearLastVisited;
    }

    public Boolean getSick() {
        return sick;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public String getSicknessName() {
        return sicknessName;
    }

    public void setSicknessName(String sicknessName) {
        this.sicknessName = sicknessName;
    }

    public String getLastDoctor() {
        return lastDoctor;
    }

    public void setLastDoctor(String lastDoctor) {
        this.lastDoctor = lastDoctor;
    }
}
