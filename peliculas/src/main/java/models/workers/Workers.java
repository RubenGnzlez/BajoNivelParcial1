package models.workers;

import models.Movie;
import models.enums.GeneroHumano;
import models.interfaces.Aparicion;

public abstract class Workers extends Movie implements Aparicion{

    private Integer mesContratacion;
    private Integer diaContratacion;
    private Integer añoContratacion;

    public Workers() {

        this.setDiaContratacion(3);
        this.setMesContratacion(4);
        this.setAñoContratacion(2015);
    }


    public Workers(Integer mesContratacion, Integer diaContratacion, Integer añoContratacion){
        this();
        this.setDiaContratacion(diaContratacion);
        this.setMesContratacion(mesContratacion);
        this.setAñoContratacion(añoContratacion);
    }




    public String aparezco(Boolean b) {
        String mensaje;
        if(b){
            mensaje = "Si aparezco en la pelicula!";
        }
        else{
            mensaje = "No aparezco en la película,pero contribuí en su filmación";
        }
        return mensaje;
    }


    public Integer getMesContratacion() {
        return mesContratacion;
    }

    public void setMesContratacion(Integer mesContratacion) {
        this.mesContratacion = mesContratacion;
    }

    public Integer getDiaContratacion() {
        return diaContratacion;
    }

    public void setDiaContratacion(Integer diaContratacion) {
        this.diaContratacion = diaContratacion;
    }

    public Integer getAñoContratacion() {
        return añoContratacion;
    }

    public void setAñoContratacion(Integer añoContratacion) {
        this.añoContratacion = añoContratacion;
    }
}

