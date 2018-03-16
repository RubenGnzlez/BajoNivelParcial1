package models.subtypes;

import models.Escuela;
import models.enums.Gender;
import models.enums.Schedule;
import models.interfaces.Attendance;
import models.interfaces.Pay;

public abstract class Persons extends Escuela implements Attendance,Pay {
    private Gender gender;
    private Integer weekDays;
    private Schedule schedule;

    public Persons(){
        this.setGender(Gender.FEMALE);
        this.setSchedule(Schedule.MORNING_SHIFT);
        this.setWeekDays(5);
    }
    public Persons(Gender gender, Schedule schedule){
        this();
        this.setGender(gender);
        this.setSchedule(schedule);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(Integer weekDays) {
        this.weekDays = weekDays;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
