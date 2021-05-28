package se.lexicon.course_manager_assignment.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class Course {

    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private Collection<Student> students;


    public Course(int id, String courseName, LocalDate startDate, int weekDuration, Collection<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = students;
    }


    public int getId() {
        return id;
    }



    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public LocalDate getStartDate(){
        return startDate;
    }
    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }



    public Collection<Student> getStudents() {
        return students;
    }
    public void setStudents(Collection<Student> students){
        this.students = students;
    }



   public boolean enrollStudent(Student student){
        if (student == null || students.contains(student)) {
            return false;
        } else
        students.add(student);
        return true;
   }
   public boolean unEnRollStudent(Student student){
        if (students.remove(student));
        return true;
   }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return getId() == course.getId()
                && weekDuration == course.weekDuration
                && Objects.equals(getCourseName(), course.getCourseName())
                && Objects.equals(getStartDate(), course.getStartDate())
                && Objects.equals(getStudents(), course.getStudents());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getCourseName(),
                getStartDate(),
                weekDuration,
                getStudents());
    }



    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", students=" + students +
                '}';
    }
}
