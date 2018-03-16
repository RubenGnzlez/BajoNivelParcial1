package models.persons.people;

import models.persons.Workers;

public class Ernest  extends Workers{
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;
    private Boolean hasCar;
    private Boolean titular;

    public Ernest(){
        this.setName("Erick Fernandez");
        this.setAge(29);
        this.setBirthDay(1);
        this.setBirthMonth(4);
        this.setBirthYearM(1997);
        this.setHasCar(Boolean.TRUE);
        this.setTitular(Boolean.FALSE);
    }

    public Ernest(String name, Integer age, Integer birthDay, Integer birthMonth, Integer birthYearM,Boolean titular) {
        this.setName(name);
        this.setAge(age);
        this.setBirthDay(birthDay);
        this.setBirthMonth(birthMonth);
        this.setBirthYearM(birthYearM);
        this.setTitular(titular);
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

    public Boolean getHasCar() {
        return hasCar;
    }

    public void setHasCar(Boolean hasCar) {
        this.hasCar = hasCar;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }
}
