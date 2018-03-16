package models.subtypes;

import models.enums.ClassRoomType;
import models.enums.Topic;
import models.interfaces.Usability;

public class Classrooms implements Usability{

    private ClassRoomType classRoomType;
    private Topic topic;
    private Integer numClassRoom;
    private Integer capacity;
    private String Teacher;

    public Classrooms(){
        this.setClassRoomType(ClassRoomType.AUDIENCE);
        this.setTeacher("Erick Amezcua");
        this.setNumClassRoom(6);
        this.setCapacity(40);
        this.setTopic(Topic.GEOGRAPHY);
    }

    public String workFor() {
        return "I'm used for " + Classrooms.this.getTopic()+ "purposes";
    }

    public ClassRoomType getClassRoomType() {
        return classRoomType;
    }

    public void setClassRoomType(ClassRoomType classRoomType) {
        this.classRoomType = classRoomType;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Integer getNumClassRoom() {
        return numClassRoom;
    }

    public void setNumClassRoom(Integer numClassRoom) {
        this.numClassRoom = numClassRoom;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }


}
