package models;

import models.enums.GeneroPelicula;

public class Movie {
    private String nombre;
    private Integer duracionHoras;
    private Integer duracionMinutos;
    private Integer duracionSegundos;
    private GeneroPelicula genero;

    public Movie() {
        this.setNombre("Jurassic World");
        this.setDuracionHoras(2);
        this.setDuracionMinutos(4);
        this.setDuracionSegundos(0);
        this.setGenero(GeneroPelicula.TERROR);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(Integer duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Integer getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(Integer duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }
}
