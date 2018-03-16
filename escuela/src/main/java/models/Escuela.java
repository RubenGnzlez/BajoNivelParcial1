package models;

import models.enums.SchoolType;

public class Escuela {
    private String name;
    private Boolean publicSchool;
    private Integer fundationDay;
    private Integer fundationMonth;
    private Integer fundationYear;
    private SchoolType schoolType;

    public Escuela(){
        this.setName("Francisco El Master");
        this.setPublicSchool(Boolean.FALSE);
        this.setSchoolType(SchoolType.BOTH);
        this.setFundationDay(15);
        this.setFundationMonth(2);
        this.setFundationYear(2010);
    }

    public Escuela(String name, SchoolType schoolType, Boolean publicSchool, Integer foundationDay, Integer foundationMonth, Integer foundationYear){
        this.setName(name);
        this.setSchoolType(schoolType);
        this.setPublicSchool(publicSchool);
        this.setFundationDay(foundationDay);
        this.setFundationMonth(foundationMonth);
        this.setFundationYear(foundationYear);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPublicSchool() {
        return publicSchool;
    }

    public void setPublicSchool(Boolean publicSchool) {
        this.publicSchool = publicSchool;
    }

    public Integer getFundationDay() {
        return fundationDay;
    }

    public void setFundationDay(Integer fundationDay) {
        this.fundationDay = fundationDay;
    }

    public Integer getFundationMonth() {
        return fundationMonth;
    }

    public void setFundationMonth(Integer fundationMonth) {
        this.fundationMonth = fundationMonth;
    }

    public Integer getFundationYear() {
        return fundationYear;
    }

    public void setFundationYear(Integer fundationYear) {
        this.fundationYear = fundationYear;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }
}
