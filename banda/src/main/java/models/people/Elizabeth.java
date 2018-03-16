package models.people;

import models.conformedby.Persons;

public class Elizabeth extends Persons{
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;

    public Elizabeth(){
        this.setName("Elizabeth Normand");
        this.setAge(22);
        this.setBirthDay(22);
        this.setBirthMonth(6);
        this.setBirthYearM(1997);
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
        return "I'm the principal voice of the band, I can sign almost any type of music except Screamings";
    }
    public String play() {
        return "I cant play play any instrument though";
    }
}
