package models.enums;

public enum GeneroPelicula {
    COMEDIA(Boolean.TRUE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE),
    ROMANCE(Boolean.TRUE,Boolean.FALSE,Boolean.TRUE,Boolean.TRUE,Boolean.FALSE),
    DRAMA(Boolean.FALSE,Boolean.FALSE,Boolean.TRUE,Boolean.TRUE,Boolean.TRUE),
    TERROR(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE),
    SUSPENSO(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE,Boolean.TRUE);

    private Boolean popular;
    private Boolean divierte;
    private Boolean provocaTristeza;
    private Boolean finalFeliz;
    private Boolean finalTriste;

    GeneroPelicula(Boolean popular, Boolean divierte, Boolean provocaTristeza, Boolean finalFeliz, Boolean finalTriste) {
        this.popular = popular;
        this.divierte = divierte;
        this.provocaTristeza = provocaTristeza;
        this.finalFeliz = finalFeliz;
        this.finalTriste = finalTriste;
    }

    public Boolean getPopular() {
        return popular;
    }

    public Boolean getDivierte() {
        return divierte;
    }

    public Boolean getProvocaTristeza() {
        return provocaTristeza;
    }

    public Boolean getFinalFeliz() {
        return finalFeliz;
    }

    public Boolean getFinalTriste() {
        return finalTriste;
    }
}
