package models.workers.subtypes;

import models.workers.Workers;

public class Staff extends Workers {
    private Integer yearsExperience;
    private String function;

    public Staff() {
        this.setFunction("StuntMan");
        this.setYearsExperience(5);
    }

    public Staff(String function){
        this();
        this.setFunction(function);
    }

    public String papel(String ap) {
        return "Yo fui " + ap + "Durante la filmacion de la pelicula";
    }

    public String presenciaEnEscena(Integer n) {
        return "Estuve " + n + " en escena";
    }

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}