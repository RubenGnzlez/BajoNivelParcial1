package models.ambientation.subtypes;

public class Scenary {
    private Boolean built;
    private String description;
    private Boolean outOfSet;

    public Scenary(){
        this.setBuilt(Boolean.FALSE);
        this.setDescription("Este item se añadio para la ambientacion de fondo y se grabó fuera");
        this.setOutOfSet(Boolean.TRUE);
    }

    public Scenary(String description){
        this();
        this.setDescription(description);
    }

    public Boolean getBuilt() {
        return built;
    }

    public void setBuilt(Boolean built) {
        this.built = built;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOutOfSet() {
        return outOfSet;
    }

    public void setOutOfSet(Boolean outOfSet) {
        this.outOfSet = outOfSet;
    }
}
