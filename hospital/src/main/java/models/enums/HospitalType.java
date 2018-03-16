package models.enums;

public enum HospitalType {
    PUBLIC(Boolean.TRUE),
    PRIVATE(Boolean.FALSE);

    private Boolean freeChekUp;

    HospitalType(Boolean freeChekUp) {
        this.freeChekUp = freeChekUp;
    }

    public Boolean getFreeChekUp() {
        return freeChekUp;
    }
}
