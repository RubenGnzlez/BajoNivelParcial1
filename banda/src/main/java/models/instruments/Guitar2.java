package models.instruments;

import models.conformedby.Instruments;
import models.enums.GuitarType;

public class Guitar2 extends Instruments {
    private Boolean rythmGuitarr;
    private String model;
    private Integer strings;
    private GuitarType guitarType;
    private String player;

    public Guitar2(){
        this.setRythmGuitarr(Boolean.FALSE);
        this.setModel("Gibson EDS-1275");
        this.setStrings(12);
        this.setGuitarType(GuitarType.ELECTRIC);
        this.setPlayer("Ruben");
    }

    public Boolean getRythmGuitarr() {
        return rythmGuitarr;
    }

    public void setRythmGuitarr(Boolean rythmGuitarr) {
        this.rythmGuitarr = rythmGuitarr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getStrings() {
        return strings;
    }

    public void setStrings(Integer strings) {
        this.strings = strings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String makeNoice() {
        return "I can make a sweet noise but also I can make a very aggresiveOne";
    }

    public String playable() {
        return "Im playable by just rubbing upside-down my strings";
    }
}