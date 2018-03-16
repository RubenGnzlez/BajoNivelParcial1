package models.enums;

public enum FarmType {
    WON(Boolean.TRUE,Boolean.FALSE),
    AGRICULTURAL(Boolean.FALSE,Boolean.TRUE),
    MIXED(Boolean.TRUE,Boolean.TRUE);

    private Boolean hasAnimals;
    private Boolean hasPlants;

    FarmType(Boolean hasAnimals, Boolean hasPlants) {
        this.hasAnimals = hasAnimals;
        this.hasPlants = hasPlants;
    }
}
