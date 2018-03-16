package models.enums;

public enum Schedule {
    MORNING_SHIFT(Boolean.TRUE,Boolean.TRUE,Boolean.FALSE),
    AFTERNOON_SHIFT(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE),
    BROKEN(Boolean.TRUE,Boolean.TRUE,Boolean.TRUE);


    private Boolean over6Hours;
    private Boolean goesTill1pm;
    private Boolean goesTill7pm;



    Schedule(Boolean over8Hours, Boolean worksTill4pm, Boolean worksTill9pm) {
        this.over6Hours = over8Hours;
        this.goesTill1pm = worksTill4pm;
        this.goesTill7pm = worksTill9pm;
    }

    public Boolean getOver6Hours() {
        return over6Hours;
    }

    public Boolean getWorksTill1pm() {
        return goesTill1pm;
    }

    public Boolean getWorksTill7pm() {
        return goesTill7pm;
    }


}
