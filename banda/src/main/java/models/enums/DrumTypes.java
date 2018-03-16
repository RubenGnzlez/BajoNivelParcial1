package models.enums;

public enum DrumTypes {
    CONGA_DRUMS(Boolean.FALSE,Boolean.FALSE,Boolean.TRUE),
    TALKING_DRUMS(Boolean.FALSE,Boolean.TRUE,Boolean.FALSE),
    DRUM_KIT(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE);

    private Boolean twoStickPlayed;
    private Boolean oneStickPlayed;
    private Boolean handPlayed;

    DrumTypes(Boolean twoStickPlayed, Boolean oneStickPlayed, Boolean handPlayed) {
        this.twoStickPlayed = twoStickPlayed;
        this.oneStickPlayed = oneStickPlayed;
        this.handPlayed = handPlayed;
    }
}
