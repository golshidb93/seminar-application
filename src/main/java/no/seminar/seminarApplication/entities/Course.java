package no.seminar.seminarApplication.entities;

import com.sun.org.glassfish.gmbal.NameValue;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String courseName; //Name of the course.
    private String startTime; //Time the course begins.
    private String endTime; //Time the course ends.
    private Room room; //The room in which the course is held on.
    private CourseInstructor courseInstructor; //Instructor's name.

    /**
     * Register a new course, by specifying the course name, instructor's name, room, start and end time.
     */
    public Course(String courseName, String instructorName, String roomName, String startTime, String endTime) {
        this.courseName = courseName;
        this.courseInstructor = new CourseInstructor(instructorName);
        this.room = new Room(roomName);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Default constructor.
     */
    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public CourseInstructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(CourseInstructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
