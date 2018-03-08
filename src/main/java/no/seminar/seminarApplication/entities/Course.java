package no.seminar.seminarApplication.entities;


public class Course {

    private String courseName; //Name of the course.
    private String courseInstructor; //Instructor's name.
    private String room; //The room in which the course is held on.
    private String startTime; //Time the course begins.
    private String endTime; //Time the course ends.

    //Register a new course, by specifying the course name, instructor's name, room, start and end time.
    public Course(String courseName, String courseInstructor, String room, String startTime, String endTime) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
