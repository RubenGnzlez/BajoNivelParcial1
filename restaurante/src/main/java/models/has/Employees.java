package models.has;

import models.Restaurant;

import models.interfaces.Job;
import models.interfaces.Pay;

public abstract class Employees extends Restaurant implements Job,Pay{

    private Integer weeklyHours;
    private Boolean worksInWeekDays;
    private Boolean worksInWeekend;

    public Employees(){

        this.setWeeklyHours(35);
        this.setWorksInWeekDays(Boolean.TRUE);
        this.setWorksInWeekend(Boolean.TRUE);
    }

    public Employees(Integer weeklyHours, Boolean worksInWeekDays, Boolean worksInWeekend) {
        this.setWeeklyHours(weeklyHours);
        this.setWorksInWeekDays(worksInWeekDays);
        this.setWorksInWeekend(worksInWeekend);
    }


    public Integer getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(Integer weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public Boolean getWorksInWeekDays() {
        return worksInWeekDays;
    }

    public void setWorksInWeekDays(Boolean worksInWeekDays) {
        this.worksInWeekDays = worksInWeekDays;
    }

    public Boolean getWorksInWeekend() {
        return worksInWeekend;
    }

    public void setWorksInWeekend(Boolean worksInWeekend) {
        this.worksInWeekend = worksInWeekend;
    }

    public String getsPaid() {
        return "I get pay every other thursday and its a really good pay";
    }
}
