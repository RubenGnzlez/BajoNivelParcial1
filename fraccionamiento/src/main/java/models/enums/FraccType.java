package models.enums;

public enum FraccType {
    OPEN(Boolean.TRUE,Boolean.TRUE),
    CLOSED(Boolean.FALSE,Boolean.FALSE);

    private Boolean anyOneCanEnter;
    private Boolean hasSecurity;

    FraccType(Boolean anyOneCanEnter, Boolean hasSecurity) {
        this.anyOneCanEnter = anyOneCanEnter;
        this.hasSecurity = hasSecurity;
    }

    public Boolean getAnyOneCanEnter() {
        return anyOneCanEnter;
    }

    public void setAnyOneCanEnter(Boolean anyOneCanEnter) {
        this.anyOneCanEnter = anyOneCanEnter;
    }

    public Boolean getHasSecurity() {
        return hasSecurity;
    }

    public void setHasSecurity(Boolean hasSecurity) {
        this.hasSecurity = hasSecurity;
    }
}
