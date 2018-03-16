package models.people.people;

import models.people.subtype.Worker;

public class Erick extends Worker {
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;

    public Erick(){
        this.setName("Erick Fernandez");
        this.setAge(29);
        this.setBirthDay(1);
        this.setBirthMonth(4);
        this.setBirthYearM(1997);
    }

    public Erick(String name, Integer age, Integer birthDay, Integer birthMonth, Integer birthYearM) {
        this.setName(name);
        this.setAge(age);
        this.setBirthDay(birthDay);
        this.setBirthMonth(birthMonth);
        this.setBirthYearM(birthYearM);
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
}
