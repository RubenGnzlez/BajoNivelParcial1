package models;

import models.enums.FarmType;

public class Farm {
    private String name;
    private Boolean collaboratesWithCompanies;
    private String County;
    private String State;
    private FarmType farmType;

    public  Farm(){
        this.setName("Grandpasss");
        this.setCollaboratesWithCompanies(Boolean.TRUE);
        this.setCounty("México");
        this.setState("Chihuahua");
        this.setFarmType(FarmType.MIXED);
    }
    public Farm(FarmType farmType, String state){
        this();
        this.setState(state);
        this.setFarmType(farmType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCollaboratesWithCompanies() {
        return collaboratesWithCompanies;
    }

    public void setCollaboratesWithCompanies(Boolean collaboratesWithCompanies) {
        this.collaboratesWithCompanies = collaboratesWithCompanies;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public FarmType getFarmType() {
        return farmType;
    }

    public void setFarmType(FarmType farmType) {
        this.farmType = farmType;
    }
}
