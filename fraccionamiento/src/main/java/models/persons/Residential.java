package models.persons;

import models.interfaces.Pay;
import models.subtypes.Persons;

public class Residential extends Persons implements Pay {

    private Integer idHouse;
    private Boolean problematic;
    private Integer idResidential;
    private Boolean hasCar;

    public Residential(){
        this.setHasCar(Boolean.TRUE);
        this.setIdHouse(2343);
        this.setIdResidential(234244675);
        this.setProblematic(Boolean.FALSE);
    }

    public Residential(Integer idResidential){
        this();
        this.setIdResidential(idResidential);
    }

    public String pay() {
        return "Im payin a lot to live her but its completly worth it!!!";
    }


    public Integer getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Integer idHouse) {
        this.idHouse = idHouse;
    }

    public Boolean getProblematic() {
        return problematic;
    }

    public void setProblematic(Boolean problematic) {
        this.problematic = problematic;
    }

    public Integer getIdResidential() {
        return idResidential;
    }

    public void setIdResidential(Integer idResidential) {
        this.idResidential = idResidential;
    }

    public Boolean getHasCar() {
        return hasCar;
    }

    public void setHasCar(Boolean hasCar) {
        this.hasCar = hasCar;
    }
}
