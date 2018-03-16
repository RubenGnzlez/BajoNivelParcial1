package models.subtypes;

import models.interfaces.Usability;

public abstract class Furniture implements Usability{
    private Boolean heavyObj;
    private Double metersLong;
    private Double metersTall;
    private Integer quantity;

    public Furniture(){
        this.setHeavyObj(Boolean.FALSE);
        this.setMetersLong(1.4d);
        this.setMetersTall(1d);
        this.setQuantity(1);

    }

    public Furniture(Integer quantity, Boolean heavyObj, Double metersLong,Double metersTall){
        this.setQuantity(quantity);
        this.setMetersTall(metersTall);
        this.setMetersLong(metersLong);
        this.setHeavyObj(heavyObj);
    }



    public Boolean getHeavyObj() {
        return heavyObj;
    }

    public void setHeavyObj(Boolean heavyObj) {
        this.heavyObj = heavyObj;
    }

    public Double getMetersLong() {
        return metersLong;
    }

    public void setMetersLong(Double metersLong) {
        this.metersLong = metersLong;
    }

    public Double getMetersTall() {
        return metersTall;
    }

    public void setMetersTall(Double metersTall) {
        this.metersTall = metersTall;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
