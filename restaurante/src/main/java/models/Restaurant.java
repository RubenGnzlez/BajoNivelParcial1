package models;

import models.enums.RestaurantType;

public class Restaurant {
    private String name;
    private String City;
    private String State;
    private String Country;
    private RestaurantType restaurantType;
    private Integer openHour;
    private Integer closeHour;

    public Restaurant(){
        this.setName("Le calzone");
        this.setCity("Chihuahua");
        this.setState("Chihuahua");
        this.setCountry("México");
        this.setRestaurantType(RestaurantType.GOURMET);
        this.setOpenHour(16);
        this.setCloseHour(23);
    }
    public Restaurant(String city, Integer openHour, Integer closeHour) {
        this();
        this.setCity(city);
        this.setOpenHour(openHour);
        this.setCloseHour(closeHour);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public RestaurantType getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(RestaurantType restaurantType) {
        this.restaurantType = restaurantType;
    }

    public Integer getOpenHour() {
        return openHour;
    }

    public void setOpenHour(Integer openHour) {
        this.openHour = openHour;
    }

    public Integer getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(Integer closeHour) {
        this.closeHour = closeHour;
    }
}
