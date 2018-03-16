package models.subtypes;

import models.Fraccionamiento;

public class Houses extends Fraccionamiento {
    private Integer idHouse;
    private Boolean Ocuped;
    private Integer externalNuber;
    private Boolean hasPool;

    public Houses(){
        this.setIdHouse(12342452);
        this.setOcuped(Boolean.FALSE);
        this.setExternalNuber(34);
        this.setHasPool(Boolean.TRUE);
    }
    public Houses(Integer externalNuber, Boolean hasPool){
        this();
        this.setExternalNuber(externalNuber);
        this.setHasPool(hasPool);
    }


    public Integer getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Integer idHouse) {
        this.idHouse = idHouse;
    }

    public Boolean getOcuped() {
        return Ocuped;
    }

    public void setOcuped(Boolean ocuped) {
        Ocuped = ocuped;
    }

    public Integer getExternalNuber() {
        return externalNuber;
    }

    public void setExternalNuber(Integer externalNuber) {
        this.externalNuber = externalNuber;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }
}
