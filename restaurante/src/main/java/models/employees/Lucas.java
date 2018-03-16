package models.employees;

import models.enums.PersonsType;
import models.has.Employees;

public class Lucas extends Employees {
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;
    private PersonsType personsType;

    public Lucas(){
        this.setName("Lucas Pérez");
        this.setAge(25);
        this.setBirthDay(16);
        this.setBirthMonth(4);
        this.setBirthYearM(1993);
        this.setPersonsType(PersonsType.CHEF);
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
        return "Im a Chef In Le calzone, its really rough cause ther is always tons of people eating there!!!";
    }
}
