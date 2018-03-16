package models.productOrigen;

import models.enums.FieldType;

public class Fields {
    private Integer maxPlantsHarvest;
    private String location;
    private Integer squareMeters;
    private FieldType fieldType;

    public Fields(){
        this.setMaxPlantsHarvest(3000);
        this.setLocation("North side of farm");
        this.setSquareMeters(1000);
        this.setFieldType(FieldType.TIERRA_LIMOSA);
    }

    public Fields(Integer maxPlantsHarvest, String location, Integer squareMeters, FieldType fieldType){
        this.setFieldType(fieldType);
        this.setLocation(location);
        this.setMaxPlantsHarvest(maxPlantsHarvest);
        this.setSquareMeters(squareMeters);
    }

    public Integer getMaxPlantsHarvest() {
        return maxPlantsHarvest;
    }

    public void setMaxPlantsHarvest(Integer maxPlantsHarvest) {
        this.maxPlantsHarvest = maxPlantsHarvest;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }
}
