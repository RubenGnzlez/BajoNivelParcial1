package models.enums;

public enum TipoActor {
    PROTAGONISTA(Boolean.TRUE,Boolean.TRUE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE),
    ANTAGONISTA(Boolean.TRUE,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE),
    SECUNDARIO(Boolean.TRUE,Boolean.TRUE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE),
    REPARTO(Boolean.FALSE,Boolean.FALSE,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE);

    private Boolean importante;
    private Boolean aparicionTotal;
    private Boolean aparicionParcial;
    private Boolean aparicionCorta;
    private Boolean requiereCast;

    TipoActor(Boolean importante, Boolean aparicionTotal, Boolean aparicionParcial, Boolean aparicionCorta, Boolean requiereCast) {
        this.importante = importante;
        this.aparicionTotal = aparicionTotal;
        this.aparicionParcial = aparicionParcial;
        this.aparicionCorta = aparicionCorta;
        this.requiereCast = requiereCast;
    }

    public Boolean getImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }

    public Boolean getAparicionTotal() {
        return aparicionTotal;
    }

    public void setAparicionTotal(Boolean aparicionTotal) {
        this.aparicionTotal = aparicionTotal;
    }

    public Boolean getAparicionParcial() {
        return aparicionParcial;
    }

    public void setAparicionParcial(Boolean aparicionParcial) {
        this.aparicionParcial = aparicionParcial;
    }

    public Boolean getAparicionCorta() {
        return aparicionCorta;
    }

    public void setAparicionCorta(Boolean aparicionCorta) {
        this.aparicionCorta = aparicionCorta;
    }

    public Boolean getRequiereCast() {
        return requiereCast;
    }

    public void setRequiereCast(Boolean requiereCast) {
        this.requiereCast = requiereCast;
    }
}
