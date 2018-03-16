package models.workers.people;

import models.enums.GeneroHumano;
import models.workers.subtypes.Actors;

public class Hermest extends Actors{
    private GeneroHumano generoHumano;
    private String name;
    private String livesIn;
    private String nacionality;
    private Integer age;

    public Hermest() {
        this.setGeneroHumano(GeneroHumano.HOMBRE);
        this.setName("Hermest Gonzalez");
        this.setLivesIn("Chihuahua");
        this.setNacionality("Canadian");
        this.setAge(29);
    }

    public Hermest(GeneroHumano generoHumano){
        this();
        this.setGeneroHumano(generoHumano);
    }

    public Hermest(GeneroHumano generoHumano, Integer age){
        this(generoHumano);
        this.setAge(age);
    }

    public GeneroHumano getGeneroHumano() {
        return generoHumano;
    }

    public void setGeneroHumano(GeneroHumano generoHumano) {
        this.generoHumano = generoHumano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLivesIn() {
        return livesIn;
    }

    public void setLivesIn(String livesIn) {
        this.livesIn = livesIn;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
