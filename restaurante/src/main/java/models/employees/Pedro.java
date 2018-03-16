package models.employees;

import models.enums.PersonsType;
import models.has.Employees;

public class Pedro extends Employees {
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;
    private PersonsType personsType;

    public Pedro(){
        this.setName("Lucas Pérez");
        this.setAge(18);
        this.setBirthDay(12);
        this.setBirthMonth(10);
        this.setBirthYearM(2000);
        this.setPersonsType(PersonsType.DISH_WASHER);
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
        return "Im a dish washer In Le calzone, I get good pay, its an awfull job though, to much to wash!!";
    }
}
