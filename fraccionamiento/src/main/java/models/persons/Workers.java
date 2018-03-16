package models.persons;

import models.enums.Schedule;
import models.enums.WorkerType;
import models.interfaces.Pay;
import models.subtypes.Persons;

public class Workers extends Persons implements Pay {
    private Integer houseAssigned;
    private Schedule schedule;
    private Integer idWorker;
    private Integer hireDay;
    private Integer hireMonth;
    private Integer hireYear;
    private Integer weekHours;
    private WorkerType workerType;

    public Workers() {
        this.setHireDay(1);
        this.setHireMonth(4);
        this.setHireYear(2015);
        this.setWeekHours(48);
        this.setHouseAssigned(123);
        this.setSchedule(Schedule.MORNING_SHIFT);
        this.setIdWorker(234535643);
        this.setWorkerType(WorkerType.CLEANER);
    }

    public Workers(Integer idWorker, WorkerType w){
        this();
        this.setWorkerType(workerType);
        this.setIdWorker(idWorker);
    }

    public String pay() {
        return "I dont pay for a house,not directly at least, they allowme to live here in exchange of my job";
    }

    public Integer getHouseAssigned() {
        return houseAssigned;
    }

    public void setHouseAssigned(Integer houseAssigned) {
        this.houseAssigned = houseAssigned;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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

    public WorkerType getWorkerType() {
        return workerType;
    }

    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType;
    }
}
