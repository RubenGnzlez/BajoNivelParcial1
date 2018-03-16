package models.has;

import models.Restaurant;
import models.enums.FoodType;

public class Food extends Restaurant{
    private FoodType foodType;
    private Double minPrice;
    private Double maxPrice;
    private Double minPreparationMins;
    private Double maxPreparationMins;

    public Food(){
        this.setFoodType(FoodType.ITALIAN);
        this.setMinPrice(180d);
        this.setMaxPrice(250d);
        this.setMinPreparationMins(10d);
        this.setMaxPreparationMins(15d);
    }


    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
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

    public Double getMinPreparationMins() {
        return minPreparationMins;
    }

    public void setMinPreparationMins(Double minPreparationMins) {
        this.minPreparationMins = minPreparationMins;
    }

    public Double getMaxPreparationMins() {
        return maxPreparationMins;
    }

    public void setMaxPreparationMins(Double maxPreparationMins) {
        this.maxPreparationMins = maxPreparationMins;
    }
}
