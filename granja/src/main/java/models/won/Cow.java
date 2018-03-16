package models.won;

import models.productOrigen.Won;

import java.awt.*;

public class Cow extends Won {
    private Integer legs;
    private Color color;
    private Boolean hasTail;
    private Boolean horns;
    private Integer years;
    private Double height;

    public Cow(){
        this.setLegs(4);
        this.setColor(Color.BLACK);
        this.setHasTail(Boolean.TRUE);
        this.setHorns(Boolean.TRUE);
        this.setYears(2);
        this.setHeight(1.6);
    }

    public String iProduce() {
        return "I produce milk and Meat when dead";
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getHasTail() {
        return hasTail;
    }

    public void setHasTail(Boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Boolean getHorns() {
        return horns;
    }

    public void setHorns(Boolean horns) {
        this.horns = horns;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
