package models.subtypes;

import models.Fraccionamiento;
import models.interfaces.Pay;

public class Persons extends Fraccionamiento{
    private String residentialZone;
    private Integer contractSignedDay;
    private Integer contractSignedMonth;
    private Integer contractSignedYear;
    private Integer houseNumber;

    public Persons(){
        this.setResidentialZone("East");
        this.setContractSignedDay(4);
        this.setContractSignedMonth(11);
        this.setContractSignedYear(2017);
        this.setHouseNumber(188);
    }
    public Persons(Integer contractSignedDay,Integer contractSignedMonth,Integer contractSignedYear, Integer houseNumber){
        this.setHouseNumber(houseNumber);
        this.setContractSignedYear(contractSignedYear);
        this.setContractSignedMonth(contractSignedMonth);
        this.setContractSignedDay(contractSignedDay);
    }


    public String getResidentialZone() {
        return residentialZone;
    }

    public void setResidentialZone(String residentialZone) {
        this.residentialZone = residentialZone;
    }

    public Integer getContractSignedDay() {
        return contractSignedDay;
    }

    public void setContractSignedDay(Integer contractSignedDay) {
        this.contractSignedDay = contractSignedDay;
    }

    public Integer getContractSignedMonth() {
        return contractSignedMonth;
    }

    public void setContractSignedMonth(Integer contractSignedMonth) {
        this.contractSignedMonth = contractSignedMonth;
    }

    public Integer getContractSignedYear() {
        return contractSignedYear;
    }

    public void setContractSignedYear(Integer contractSignedYear) {
        this.contractSignedYear = contractSignedYear;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }
}
