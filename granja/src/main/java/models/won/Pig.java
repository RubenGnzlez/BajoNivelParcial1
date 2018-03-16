package models.won;

import models.productOrigen.Won;

import java.awt.*;

public class Pig extends Won {
    private Integer legs;
    private Color color;
    private Boolean hasTail;
    private Integer years;
    private Double height;

    public Pig(){
        this.setLegs(4);
        this.setColor(Color.BLACK);
        this.setHasTail(Boolean.TRUE);
        this.setYears(2);
        this.setHeight(1.6);
    }

    public String iProduce() {
        return "I produce meat when dead";
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
