package models;

import models.enums.FraccType;

public class Fraccionamiento {
    private FraccType fraccType;
    private String name;
    private Double squareMeters;
    private Boolean hasMiniParks;
    private Double minPrice;
    private Double maxPrice;

    public Fraccionamiento(){
        this.setFraccType(FraccType.CLOSED);
        this.setName("Villas del Monte");
        this.setSquareMeters(4000d);
        this.setMinPrice(2000.9d);
        this.setMaxPrice(4000.90d);
        this.setHasMiniParks(Boolean.FALSE);
    }

    public Fraccionamiento(FraccType fraccType,String name, Boolean b){
        this();
        this.setFraccType(fraccType);
        this.setName(name);
        this.setHasMiniParks(b);
    }


    public FraccType getFraccType() {
        return fraccType;
    }

    public void setFraccType(FraccType fraccType) {
        this.fraccType = fraccType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Boolean getHasMiniParks() {
        return hasMiniParks;
    }

    public void setHasMiniParks(Boolean hasMiniParks) {
        this.hasMiniParks = hasMiniParks;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
