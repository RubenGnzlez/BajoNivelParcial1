package models.enums;

public enum Role {
    SURGEON(Boolean.FALSE,Boolean.FALSE,Boolean.TRUE),
    GENERAL_DOCTOR(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE),
    NURSE(Boolean.FALSE,Boolean.TRUE,Boolean.FALSE),
    PHARMACIST(Boolean.FALSE,Boolean.FALSE,Boolean.TRUE);

    private Boolean ownConsultingRoom;
    private Boolean isAnAssistant;
    private Boolean hasAnAssistant;

    Role(Boolean ownConsultingRoom, Boolean isAnAssistant, Boolean hasAnAssistant) {
        this.ownConsultingRoom = ownConsultingRoom;
        this.isAnAssistant = isAnAssistant;
        this.hasAnAssistant = hasAnAssistant;
    }

    public Boolean getOwnConsultingRoom() {
        return ownConsultingRoom;
    }

    public Boolean getAnAssistant() {
        return isAnAssistant;
    }

    public Boolean getHasAnAssistant() {
        return hasAnAssistant;
    }
}
