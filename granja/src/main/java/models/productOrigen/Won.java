package models.productOrigen;

import models.Farm;
import models.enums.WonType;
import models.intefaces.Produces;

public abstract class Won extends Farm implements Produces{
    private Boolean raisedForSell;
    private Boolean raisedToEat;
    private Boolean raisedForCloth;
    private Boolean raisedForMilk;
    private WonType wonType;

    public Won(){
        this.setWonType(WonType.VACUNO);
        this.setRaisedForSell(Boolean.FALSE);
        this.setRaisedToEat(Boolean.TRUE);
        this.setRaisedForCloth(Boolean.FALSE);
        this.setRaisedForMilk(Boolean.TRUE);
    }

    public Won(Boolean raisedForSell, Boolean raisedToEat, Boolean raisedForCloth, Boolean raisedForMilk, WonType wonType) {
        this.setWonType(wonType);
        this.setRaisedForSell(raisedForSell);
        this.setRaisedToEat(raisedToEat);
        this.setRaisedForCloth(raisedForCloth);
        this.setRaisedForMilk(raisedForMilk);
    }

    public Boolean getRaisedForSell() {
        return raisedForSell;
    }

    public void setRaisedForSell(Boolean raisedForSell) {
        this.raisedForSell = raisedForSell;
    }

    public Boolean getRaisedToEat() {
        return raisedToEat;
    }

    public void setRaisedToEat(Boolean raisedToEat) {
        this.raisedToEat = raisedToEat;
    }

    public Boolean getRaisedForCloth() {
        return raisedForCloth;
    }

    public void setRaisedForCloth(Boolean raisedForCloth) {
        this.raisedForCloth = raisedForCloth;
    }

    public WonType getWonType() {
        return wonType;
    }

    public void setWonType(WonType wonType) {
        this.wonType = wonType;
    }
    public Boolean getRaisedForMilk() {
        return raisedForMilk;
    }

    public void setRaisedForMilk(Boolean raisedForMilk) {
        this.raisedForMilk = raisedForMilk;
    }
}
