package models.sucursales;

import models.Hospital;

public class Sucursal extends Hospital {
    private Integer idSucursal;
    private Integer numWorkers;
    private String state;
    private String city;
    private String street;
    private Integer checkupStart;
    private Integer checkupEnd;
    private Integer checkupDuration;

    public Sucursal(){
        this.setIdSucursal(001);
        this.setNumWorkers(100);
        this.setState("Chihuahua");
        this.setCity("Chihuahua");
        this.setStreet("Margaritas");
        this.setCheckupStart(8);
        this.setCheckupEnd(22);
        this.setCheckupDuration(12);
    }

    public Sucursal(String st){
        this();
        this.setStreet(st);
    }

    public Sucursal(Integer idSucursal, Integer numWorkers, String state, String city, String street, Integer checkupStart, Integer checkupEnd, Integer checkupDuration) {
        this.setIdSucursal(idSucursal);
        this.setNumWorkers(numWorkers);
        this.setState(state);
        this.setCity(city);
        this.setStreet(street);
        this.setCheckupStart(checkupStart);
        this.setCheckupEnd(checkupEnd);
        this.setCheckupDuration(checkupDuration);
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(Integer numWorkers) {
        this.numWorkers = numWorkers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCheckupStart() {
        return checkupStart;
    }

    public void setCheckupStart(Integer checkupStart) {
        this.checkupStart = checkupStart;
    }

    public Integer getCheckupEnd() {
        return checkupEnd;
    }

    public void setCheckupEnd(Integer checkupEnd) {
        this.checkupEnd = checkupEnd;
    }

    public Integer getCheckupDuration() {
        return checkupDuration;
    }

    public void setCheckupDuration(Integer checkupDuration) {
        this.checkupDuration = checkupDuration;
    }
}
