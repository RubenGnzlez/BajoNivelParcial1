package models.people.subtype;

import models.enums.Role;
import models.enums.Schedule;
import models.people.Person;

public class Worker extends Person {
    private Schedule schedule;
    private Role role;
    private Integer idWorker;
    private Integer hireDay;
    private Integer hireMonth;
    private Integer hireYear;
    private Integer weekHours;

    public Worker() {
        this.setHireDay(1);
        this.setHireMonth(4);
        this.setHireYear(2015);
        this.setWeekHours(48);
        this.setRole(Role.NURSE);
        this.setSchedule(Schedule.BROKEN);
    }

    public Worker(Integer weekHours){
        this();
        this.setWeekHours(weekHours);
    }
    public Worker(Schedule schedule, Role role, Integer hireDay, Integer hireMonth){
        this();
        this.setHireDay(hireDay);
        this.setHireMonth(hireMonth);
        this.setRole(role);
        this.setSchedule(schedule);
    }

    public String asist(String a) {
        return "I'm a " + a + "So I have to go to work everyday";
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(Integer idWorker) {
        this.idWorker = idWorker;
    }

    public Integer getHireDay() {
        return hireDay;
    }

    public void setHireDay(Integer hireDay) {
        this.hireDay = hireDay;
    }

    public Integer getHireMonth() {
        return hireMonth;
    }

    public void setHireMonth(Integer hireMonth) {
        this.hireMonth = hireMonth;
    }

    public Integer getHireYear() {
        return hireYear;
    }

    public void setHireYear(Integer hireYear) {
        this.hireYear = hireYear;
    }

    public Integer getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(Integer weekHours) {
        this.weekHours = weekHours;
    }
}
