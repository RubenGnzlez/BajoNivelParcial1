package models.people;


import models.enums.Gender;
import models.interfaces.Asistance;
import models.sucursales.Sucursal;

public abstract class Person extends Sucursal implements Asistance{

    private Gender gender;

    public Person(){
        this.setGender(Gender.FEMALE);
    }

    public String frequencyAsisting(Integer f) {
        if(f>=16){
            return "I assist "+ f + " times per month because I work in there";
        }
        else {
            return "I only asist when Im sick or I've been scheduled";
        }

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
