package models.persons.people;

import models.persons.subtypes.Students;

public class Petra extends Students{
    private String name;
    private Integer age;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYearM;
    private String street;
    private Integer externalNumber;

    public Petra (){
        this.setName("George Enriquez");
        this.setAge(10);
        this.setBirthDay(1);
        this.setBirthMonth(4);
        this.setBirthYearM(1908);
        this.setStreet("Evergarden");
        this.setExternalNumber(450);
    }

    public Petra (String name, Integer age, Integer birthDay, Integer birthMonth, Integer birthYearM,Integer externalNumber, String street) {
        this.setName(name);
        this.setAge(age);
        this.setBirthDay(birthDay);
        this.setBirthMonth(birthMonth);
        this.setBirthYearM(birthYearM);
        this.setStreet(street);
        this.setExternalNumber(externalNumber);
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(Integer externalNumber) {
        this.externalNumber = externalNumber;
    }
}
