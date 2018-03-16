package models.employees;

import models.enums.PersonsType;
import models.has.Employees;

public class Juan extends Employees{
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;
    private PersonsType personsType;

    public Juan(){
        this.setName("Juan Fernandez");
        this.setAge(20);
        this.setBirthDay(1);
        this.setBirthMonth(3);
        this.setBirthYearM(1998);
        this.setPersonsType(PersonsType.WAITER);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthYearM() {
        return birthYearM;
    }

    public void setBirthYearM(Integer birthYearM) {
        this.birthYearM = birthYearM;
    }

    public PersonsType getPersonsType() {
        return personsType;
    }

    public void setPersonsType(PersonsType personsType) {
        this.personsType = personsType;
    }

    public String work() {
        return "Im a waiter In Le calzone, its actually pretty fun and I have really good tips!!";
    }
}
