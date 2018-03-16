package models.instruments;

import models.conformedby.Instruments;
import models.enums.VoiceType;

public class Voice extends Instruments {
    private VoiceType voiceType;
    private String player;
    private Boolean principalVoice;

    public Voice(){
        this.setVoiceType(VoiceType.SOPRAN);
        this.setPlayer("Elizabeth");
        this.setPrincipalVoice(Boolean.TRUE);
    }

    public Voice(String player,Boolean principal){
        this();
        this.setPlayer(player);
        this.setPrincipalVoice(principal);
    }

    public String makeNoice() {
        return "I'm literally the voice of the songs!!!";
    }

    public String playable() {
        return "Im playable by just talking,but be sure to keep in tone and have rythm!!";
    }

    public VoiceType getVoiceType() {
        return voiceType;
    }

    public void setVoiceType(VoiceType voiceType) {
        this.voiceType = voiceType;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Boolean getPrincipalVoice() {
        return principalVoice;
    }

    public void setPrincipalVoice(Boolean principalVoice) {
        this.principalVoice = principalVoice;
    }
}
