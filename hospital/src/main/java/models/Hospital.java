package models;

import models.enums.HospitalType;

public class Hospital {
    private String pais;
    private Integer diaCreacion;
    private Integer mesCreacion;
    private Integer añoCreacion;
    private HospitalType hospitalType;
    private String nombre;
    private Integer numSucursales;

    public Hospital() {
        this.setNombre("Los Aneles");
        this.setNumSucursales(4);
        this.setPais("Mexico");
        this.setDiaCreacion(2);
        this.setMesCreacion(4);
        this.setAñoCreacion(1990);
        this.setHospitalType(HospitalType.PUBLIC);
    }

    public Hospital(Integer numSucursales){
        this();
        this.setNumSucursales(numSucursales);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getDiaCreacion() {
        return diaCreacion;
    }

    public void setDiaCreacion(Integer diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public Integer getMesCreacion() {
        return mesCreacion;
    }

    public void setMesCreacion(Integer mesCreacion) {
        this.mesCreacion = mesCreacion;
    }

    public Integer getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(Integer añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public HospitalType getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(HospitalType hospitalType) {
        this.hospitalType = hospitalType;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumSucursales() {
        return numSucursales;
    }

    public void setNumSucursales(Integer numSucursales) {
        this.numSucursales = numSucursales;
    }




}
