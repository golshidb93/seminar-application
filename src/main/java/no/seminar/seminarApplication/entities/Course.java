package no.seminar.seminarApplication.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "course_id")
    private Long id;
    private String name; //Name of the course.
    private String startTime; //Time the course begins.
    private String endTime; //Time the course ends.

    @OneToOne
    private Room room; //The room in which the course is held on.

    @OneToOne
    private CourseInstructor courseInstructor; //Instructor's name.

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "course_participant_courses",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "participant_id")}
    )
    private List<CourseParticipant> courseParticipants;

    /**
     * Register a new course, by specifying the course name, instructor's name, room, start and end time.
     */
    public Course(String name, String instructorName, String roomName, String startTime, String endTime) {
        this.name = name;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void addCourseParticipant(CourseParticipant courseParticipant) {
        this.courseParticipants.add(courseParticipant);
    }

    public List<CourseParticipant> getCourseParticipants() {
        return this.courseParticipants;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public CourseInstructor getCourseInstructor() {
        return this.courseInstructor;
    }

    public void setCourseInstructor(CourseInstructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
