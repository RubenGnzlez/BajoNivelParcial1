package models.instruments;

import models.conformedby.Instruments;
import models.enums.DrumTypes;

public class Drums extends Instruments {
    private DrumTypes drumTypes;
    private Boolean haCymbals;
    private Boolean electric;
    private String model;

    public Drums(){
        this.setDrumTypes(DrumTypes.DRUM_KIT);
        this.setHaCymbals(Boolean.TRUE);
        this.setElectric(Boolean.FALSE);
        this.setModel("Custom Collection");
    }

    public String makeNoice() {
        return "I make noises like if hitting a wall,be carefull when you play me, I'm the entire rithm of the song";
    }

    public String playable() {
        return "I can be playable by hitting  my drums and cymbals but you need two specific shape-wood stics ";
    }

    public DrumTypes getDrumTypes() {
        return drumTypes;
    }

    public void setDrumTypes(DrumTypes drumTypes) {
        this.drumTypes = drumTypes;
    }

    public Boolean getHaCymbals() {
        return haCymbals;
    }

    public void setHaCymbals(Boolean haCymbals) {
        this.haCymbals = haCymbals;
    }

    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
