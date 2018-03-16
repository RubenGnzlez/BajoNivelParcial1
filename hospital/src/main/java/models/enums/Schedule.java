package models.enums;

public enum Schedule {
    MORNING_SHIFT(Boolean.TRUE,Boolean.TRUE,Boolean.FALSE,Boolean.FALSE),
    AFTERNOON_SHIFT(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE,Boolean.FALSE),
    BROKEN(Boolean.TRUE,Boolean.TRUE,Boolean.TRUE,Boolean.TRUE),
    NIGH_SHIFT(Boolean.FALSE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE);

    private Boolean over8Hours;
    private Boolean worksTill4pm;
    private Boolean worksTill9pm;
    private Boolean worksTill4am;


    Schedule(Boolean over8Hours, Boolean worksTill4pm, Boolean worksTill9pm, Boolean worksTill4am) {
        this.over8Hours = over8Hours;
        this.worksTill4pm = worksTill4pm;
        this.worksTill9pm = worksTill9pm;
        this.worksTill4am = worksTill4am;
    }

    public Boolean getOver8Hours() {
        return over8Hours;
    }

    public Boolean getWorksTill4pm() {
        return worksTill4pm;
    }

    public Boolean getWorksTill9pm() {
        return worksTill9pm;
    }

    public Boolean getWorksTill4am() {
        return worksTill4am;
    }
}
