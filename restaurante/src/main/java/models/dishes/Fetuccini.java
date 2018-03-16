package models.dishes;

import models.has.Food;

public class Fetuccini extends Food {
    private Integer carrot;
    private Integer calabacita;
    private Integer cambrayOnions;
    private Boolean perejil;
    private Boolean oliveOil;
    private Integer tomatoes;
    private Integer pastaPounds;
    private String species;


     public Fetuccini(){
        this.setCarrot(1);
        this.setCalabacita(1);
        this.setCambrayOnions(3);
        this.setPerejil(Boolean.TRUE);
        this.setOliveOil(Boolean.TRUE);
        this.setTomatoes(2);
        this.setPastaPounds(1);
        this.setSpecies("Pepper");

     }


    public Integer getCarrot() {
        return carrot;
    }

    public void setCarrot(Integer carrot) {
        this.carrot = carrot;
    }

    public Integer getCalabacita() {
        return calabacita;
    }

    public void setCalabacita(Integer calabacita) {
        this.calabacita = calabacita;
    }

    public Integer getCambrayOnions() {
        return cambrayOnions;
    }

    public void setCambrayOnions(Integer cambrayOnions) {
        this.cambrayOnions = cambrayOnions;
    }

    public Boolean getPerejil() {
        return perejil;
    }

    public void setPerejil(Boolean perejil) {
        this.perejil = perejil;
    }

    public Integer getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Integer tomatoes) {
        this.tomatoes = tomatoes;
    }

    public Integer getPastaPounds() {
        return pastaPounds;
    }

    public void setPastaPounds(Integer pastaPounds) {
        this.pastaPounds = pastaPounds;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Boolean getOliveOil() {
        return oliveOil;
    }

    public void setOliveOil(Boolean oliveOil) {
        this.oliveOil = oliveOil;
    }
}
