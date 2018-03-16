package models.enums;

public enum MusicUse {
    SUSPENSO(Boolean.TRUE,Boolean.TRUE,Boolean.TRUE,Boolean.TRUE),
    HAPPY(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE),
    SAD(Boolean.FALSE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE);

    private Boolean happyMelody;
    private Boolean sadMelody;
    private Boolean HorrorMelody;
    private Boolean suspenseMelody;

    MusicUse(Boolean happyMelody, Boolean sadMelody, Boolean horrorMelody, Boolean suspenseMelody) {
        this.happyMelody = happyMelody;
        this.sadMelody = sadMelody;
        HorrorMelody = horrorMelody;
        this.suspenseMelody = suspenseMelody;
    }

    public Boolean getHappyMelody() {
        return happyMelody;
    }

    public void setHappyMelody(Boolean happyMelody) {
        this.happyMelody = happyMelody;
    }

    public Boolean getSadMelody() {
        return sadMelody;
    }

    public void setSadMelody(Boolean sadMelody) {
        this.sadMelody = sadMelody;
    }

    public Boolean getHorrorMelody() {
        return HorrorMelody;
    }

    public void setHorrorMelody(Boolean horrorMelody) {
        HorrorMelody = horrorMelody;
    }

    public Boolean getSuspenseMelody() {
        return suspenseMelody;
    }

    public void setSuspenseMelody(Boolean suspenseMelody) {
        this.suspenseMelody = suspenseMelody;
    }
}
