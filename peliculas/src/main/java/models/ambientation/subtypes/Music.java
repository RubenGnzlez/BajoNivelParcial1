package models.ambientation.subtypes;

import models.ambientation.Ambientation;
import models.enums.MusicUse;

public class Music extends Ambientation {
    private Integer minutosEnEscena;
    private Integer segundosEnEscena;
    private Integer escenaDondeSeEscucha;
    private MusicUse musicUse;

    public Music(){
        this.setEscenaDondeSeEscucha(4);
        this.setMinutosEnEscena(1);
        this.setSegundosEnEscena(0);
        this.setMusicUse(MusicUse.HAPPY);
    }

    public Music(MusicUse musicUse){
        this();
        this.setMusicUse(musicUse);
    }
    public Music(MusicUse musicUse, Integer escenaDondeSeEscucha){
        this(musicUse);
        this.setEscenaDondeSeEscucha(escenaDondeSeEscucha);
    }


    public Integer getMinutosEnEscena() {
        return minutosEnEscena;
    }

    public void setMinutosEnEscena(Integer minutosEnEscena) {
        this.minutosEnEscena = minutosEnEscena;
    }

    public Integer getSegundosEnEscena() {
        return segundosEnEscena;
    }

    public void setSegundosEnEscena(Integer segundosEnEscena) {
        this.segundosEnEscena = segundosEnEscena;
    }

    public Integer getEscenaDondeSeEscucha() {
        return escenaDondeSeEscucha;
    }

    public void setEscenaDondeSeEscucha(Integer escenaDondeSeEscucha) {
        this.escenaDondeSeEscucha = escenaDondeSeEscucha;
    }

    public MusicUse getMusicUse() {
        return musicUse;
    }

    public void setMusicUse(MusicUse musicUse) {
        this.musicUse = musicUse;
    }
}
