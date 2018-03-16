package models.harvest;

import models.productOrigen.Fields;

import java.awt.*;

public class Lettuce extends Fields {
    private String startHarvestMonth;
    private  String endHarvestMonth;
    private Integer harvestDays;
    private Color color;
    private Double height;
    private Double weight;

    public Lettuce(){
        this.setHarvestDays(70);
        this.setStartHarvestMonth("January");
        this.setEndHarvestMonth("March");
        this.setColor(Color.GREEN);
        this.setWeight(1d);
        this.setHeight(0.2);
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
