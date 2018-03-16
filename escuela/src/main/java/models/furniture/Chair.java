package models.furniture;

import models.subtypes.Furniture;

public class Chair extends Furniture{

    private String material;
    private Integer price;
    private String statusConditions;

    public Chair(){
        this.setMaterial("Wood");
        this.setPrice(100);
        this.setStatusConditions("Everything is cool");
    }

    public String workFor() {
        return "Normally I'm used as for sitting on";

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStatusConditions() {
        return statusConditions;
    }

    public void setStatusConditions(String statusConditions) {
        this.statusConditions = statusConditions;
    }
}
