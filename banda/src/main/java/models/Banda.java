package models;

import models.enums.Genre;

public class Banda {

    private String originCountry;
    private String nombre;
    private Integer albumNums;
    private String manager;
    private Integer songsNumber;
    private Genre genre;

    public Banda(){
        this.setOriginCountry("México");
        this.setNombre("Beyond Horizon");
        this.setAlbumNums(2);
        this.setManager("Rafael Gonzalez");
        this.setSongsNumber(20);
        this.setGenre(Genre.ROCK);
    }

    public Banda(String originCountry, String nombre, Integer albumNums, String manager, Integer songsNumber, Genre genre) {
        this.setOriginCountry(originCountry);
        this.setNombre(nombre);
        this.setAlbumNums(albumNums);
        this.setManager(manager);
        this.setSongsNumber(songsNumber);
        this.setGenre(genre);
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAlbumNums() {
        return albumNums;
    }

    public void setAlbumNums(Integer albumNums) {
        this.albumNums = albumNums;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getSongsNumber() {
        return songsNumber;
    }

    public void setSongsNumber(Integer songsNumber) {
        this.songsNumber = songsNumber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
