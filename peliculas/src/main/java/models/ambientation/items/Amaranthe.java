package models.ambientation.items;

import models.ambientation.subtypes.Music;

public class Amaranthe extends Music {
    private Integer durationMinutes;
    private String name;
    private String band;
    private Integer yearOfRelease;

    public Amaranthe() {
        this.setBand("Amaranthine");
        this.setDurationMinutes(3);
        this.setName("Amaranthe");
        this.setYearOfRelease(2014);

    }

    public Amaranthe(Integer yearOfRelease, String name){
        this();
        this.setYearOfRelease(yearOfRelease);
        this.setName(name);
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
