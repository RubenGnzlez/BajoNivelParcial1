package models.dishes;

import models.has.Food;

public class Lasagna extends Food {
    private Boolean tomatoeSauce;
    private String herbs;
    private String cheese;
    private Integer lasagnaNoodlePounds;
    private String species;

    public Lasagna(){
        this.setTomatoeSauce(Boolean.TRUE);
        this.setHerbs("Oregano");
        this.setCheese("Riccota");
        this.setLasagnaNoodlePounds(1);
        this.setSpecies("Garlic and Oregano");
    }

    public Boolean getTomatoeSauce() {
        return tomatoeSauce;
    }

    public void setTomatoeSauce(Boolean tomatoeSauce) {
        this.tomatoeSauce = tomatoeSauce;
    }

    public String getHerbs() {
        return herbs;
    }

    public void setHerbs(String herbs) {
        this.herbs = herbs;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public Integer getLasagnaNoodlePounds() {
        return lasagnaNoodlePounds;
    }

    public void setLasagnaNoodlePounds(Integer lasagnaNoodlePounds) {
        this.lasagnaNoodlePounds = lasagnaNoodlePounds;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
