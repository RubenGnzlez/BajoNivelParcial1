package models.harvest;

import models.productOrigen.Fields;

import java.awt.*;

public class Tomatoe extends Fields {
    private String startHarvestMonth;
    private  String endHarvestMonth;
    private Integer harvestDays;
    private Color color;
    private Double height;
    private Double weight;

    public Tomatoe(){
        this.setHarvestDays(70);
        this.setStartHarvestMonth("April");
        this.setEndHarvestMonth("August");
        this.setColor(Color.RED);
        this.setWeight(.2d);
        this.setHeight(0.1);
    }

    public String getStartHarvestMonth() {
        return startHarvestMonth;
    }

    public void setStartHarvestMonth(String startHarvestMonth) {
        this.startHarvestMonth = startHarvestMonth;
    }

    public String getEndHarvestMonth() {
        return endHarvestMonth;
    }

    public void setEndHarvestMonth(String endHarvestMonth) {
        this.endHarvestMonth = endHarvestMonth;
    }

    public Integer getHarvestDays() {
        return harvestDays;
    }

    public void setHarvestDays(Integer harvestDays) {
        this.harvestDays = harvestDays;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

