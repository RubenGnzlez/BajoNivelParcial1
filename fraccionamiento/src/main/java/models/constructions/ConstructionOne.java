package models.constructions;

import models.interfaces.FindingPlace;
import models.subtypes.Houses;

import java.awt.*;

public class ConstructionOne extends Houses implements FindingPlace {
    private Integer stories;
    private Color color;
    private Integer rooms;
    private Integer bathrooms;
    private Integer garageCapacity;

    public  ConstructionOne(){
        this.setStories(3);
        this.setColor(Color.BLUE);
        this.setRooms(5);
        this.setBathrooms(3);
        this.setGarageCapacity(3);
    }


    public Integer getStories() {
        return stories;
    }

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getGarageCapacity() {
        return garageCapacity;
    }

    public void setGarageCapacity(Integer garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    public String ubication(String ubication) {
        return "Im ubicated in the "+ubication + " of the place";
    }
}
