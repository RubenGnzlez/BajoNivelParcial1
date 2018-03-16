package models.conformedby;

import models.Banda;
import models.enums.InstrumentType;
import models.enums.Use;
import models.interfaces.Noicy;

public abstract class Instruments extends Banda  implements Noicy{
    private InstrumentType instrumentType;
    private Use use;
    private Boolean unicUser;

    public Instruments(){
        this.setInstrumentType(InstrumentType.STRING);
        this.setUse(Use.ALWAYS);
        this.setUnicUser(Boolean.TRUE);
    }
    public Instruments(InstrumentType ins, Use use, Boolean unic){
        this();
        this.setInstrumentType(ins);
        this.setUnicUser(unic);
        this.setUse(use);
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public Boolean getUnicUser() {
        return unicUser;
    }

    public void setUnicUser(Boolean unicUser) {
        this.unicUser = unicUser;
    }
}
