package models.ambientation;

import models.Movie;
import models.interfaces.Aparicion;

public class Ambientation extends Movie implements Aparicion {

    private Integer id;
    private Integer idAlmacen;

    public Ambientation(){
        this.setId(0);
        this.setIdAlmacen(12);
    }

    public Ambientation(Integer id){
        this();
        this.setId(id);
    }

    public String papel(String ap) {
        return "Sirvo para " + ap ;
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

    public String presenciaEnEscena(Integer n) {
        return "Apareci en " + n + "escenas";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }
}
