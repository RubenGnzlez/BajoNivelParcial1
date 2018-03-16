package models.people;

import models.conformedby.Persons;

public class Emerald extends Persons {
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;

    public Emerald(){
        this.setName("Emerald Gonzalez");
        this.setAge(20);
        this.setBirthDay(10);
        this.setBirthMonth(3);
        this.setBirthYearM(1998);
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

    public String sing() {
        return "I'm the secondary voice of the band, I can sign only melodical and sweet rithms";
    }

    public String play() {
        return "I can play guitar and quite a bit of drums";
    }

}
