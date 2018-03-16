package models.persons.subtypes;

import models.enums.Topic;
import models.subtypes.Persons;

public class Teachers extends Persons {
    private Topic topic;
    private Integer weeklyHours;
    private Integer roomAssigned;
    private Integer gradeAssigned;

    public Teachers(){
        this.setGradeAssigned(3);
        this.setRoomAssigned(6);
        this.setWeeklyHours(48);
        this.setTopic(Topic.ENGLISH);
    }

    public Teachers(Topic topic, Integer roomAssigned, Integer gradeAssigned){
        this();
        this.setTopic(topic);
        this.setRoomAssigned(roomAssigned);
        this.setGradeAssigned(gradeAssigned);
    }

    public String goToSchool() {
        return "I go to school for teachig purpose";
    }

    public String getPaid() {
        return "I get paid once every other week with my normal salary";
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Integer getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(Integer weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public Integer getRoomAssigned() {
        return roomAssigned;
    }

    public void setRoomAssigned(Integer roomAssigned) {
        this.roomAssigned = roomAssigned;
    }

    public Integer getGradeAssigned() {
        return gradeAssigned;
    }

    public void setGradeAssigned(Integer gradeAssigned) {
        this.gradeAssigned = gradeAssigned;
    }
}
