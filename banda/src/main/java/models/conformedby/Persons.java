package models.conformedby;

import models.Banda;
import models.interfaces.Talent;

public abstract class Persons extends Banda implements Talent {
    private Integer memberSinceMonth;
    private Integer memberSinceYear;
    //Implica ser por ejemplo la guitarra o voz principal
    private Boolean primaryInRole;
    private Integer participatedInSongs;
    private Boolean availableForTour;

    public Persons(){
        this.setMemberSinceMonth(5);
        this.setMemberSinceYear(2015);
        this.setPrimaryInRole(Boolean.TRUE);
        this.setParticipatedInSongs(10);
        this.setAvailableForTour(Boolean.FALSE);
    }

    public Persons(Integer memberSinceMonth, Integer memberSinceYear, Boolean primaryInRole, Integer participatedInSongs, Boolean availableForTour) {
        this.setMemberSinceMonth(memberSinceMonth);
        this.setMemberSinceYear(memberSinceYear);
        this.setPrimaryInRole(primaryInRole);
        this.setParticipatedInSongs(participatedInSongs);
        this.setAvailableForTour(getAvailableForTour());
    }

    public Integer getMemberSinceMonth() {
        return memberSinceMonth;
    }

    public void setMemberSinceMonth(Integer memberSinceMonth) {
        this.memberSinceMonth = memberSinceMonth;
    }

    public Integer getMemberSinceYear() {
        return memberSinceYear;
    }

    public void setMemberSinceYear(Integer memberSinceYear) {
        this.memberSinceYear = memberSinceYear;
    }

    public Boolean getPrimaryInRole() {
        return primaryInRole;
    }

    public void setPrimaryInRole(Boolean primaryInRole) {
        this.primaryInRole = primaryInRole;
    }

    public Integer getParticipatedInSongs() {
        return participatedInSongs;
    }

    public void setParticipatedInSongs(Integer participatedInSongs) {
        this.participatedInSongs = participatedInSongs;
    }

    public Boolean getAvailableForTour() {
        return availableForTour;
    }

    public void setAvailableForTour(Boolean availableForTour) {
        this.availableForTour = availableForTour;
    }
}
