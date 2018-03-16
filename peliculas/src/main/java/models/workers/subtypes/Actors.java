package models.workers.subtypes;

import models.enums.TipoActor;
import models.workers.Workers;

public class Actors extends Workers {
    private TipoActor type;
    private Integer moviesPerformed;
    private Integer castedDay;
    private Integer castedMonth;
    private Integer castedYear;
    private Integer firstMovieParticipationDay;
    private Integer firstMovieParticipationMonth;
    private Integer firstMovieParticipationYear;

    public Actors(){
        this.setCastedDay(1);
        this.setCastedMonth(2);
        this.setCastedYear(2015);
        this.setFirstMovieParticipationDay(5);
        this.setFirstMovieParticipationMonth(4);
        this.setFirstMovieParticipationYear(2015);
        this.setMoviesPerformed(6);
        this.setType(TipoActor.REPARTO);
    }

    public Actors(TipoActor type){
        this();
        this.setType(type);
    }

    public Actors(TipoActor type,Integer castedDay, Integer castedMonth, Integer castedYear){
        this(type);
        this.setCastedYear(castedYear);
        this.setCastedDay(castedDay);
        this.setCastedMonth(castedMonth);
    }

    public String papel(String ap) {
        return "Yo interpreté a " + ap + "en la película";
    }

    public String presenciaEnEscena(Integer n) {
        return "Yo estuve en " + n + "escenas";
    }

    public TipoActor getType() {
        return type;
    }

    public void setType(TipoActor type) {
        this.type = type;
    }

    public Integer getMoviesPerformed() {
        return moviesPerformed;
    }

    public void setMoviesPerformed(Integer moviesPerformed) {
        this.moviesPerformed = moviesPerformed;
    }

    public Integer getCastedDay() {
        return castedDay;
    }

    public void setCastedDay(Integer castedDay) {
        this.castedDay = castedDay;
    }

    public Integer getCastedMonth() {
        return castedMonth;
    }

    public void setCastedMonth(Integer castedMonth) {
        this.castedMonth = castedMonth;
    }

    public Integer getCastedYear() {
        return castedYear;
    }

    public void setCastedYear(Integer castedYear) {
        this.castedYear = castedYear;
    }

    public Integer getFirstMovieParticipationDay() {
        return firstMovieParticipationDay;
    }

    public void setFirstMovieParticipationDay(Integer firstMovieParticipationDay) {
        this.firstMovieParticipationDay = firstMovieParticipationDay;
    }

    public Integer getFirstMovieParticipationMonth() {
        return firstMovieParticipationMonth;
    }

    public void setFirstMovieParticipationMonth(Integer firstMovieParticipationMonth) {
        this.firstMovieParticipationMonth = firstMovieParticipationMonth;
    }

    public Integer getFirstMovieParticipationYear() {
        return firstMovieParticipationYear;
    }

    public void setFirstMovieParticipationYear(Integer firstMovieParticipationYear) {
        this.firstMovieParticipationYear = firstMovieParticipationYear;
    }
}
