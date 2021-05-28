package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.data.service.student.StudentService;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class CourseCollectionRepository implements CourseDao{

    private Collection<Course> courses;
    private Collection<Student> students;


    public CourseCollectionRepository(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        return new Course(CourseSequencer.nextCourseId(), courseName, startDate, weekDuration,students);

    }

    @Override
    public Course findById(int id) {
        return findById(id);
    }

    @Override
    public Collection<Course> findByNameContains(String name) {
        return findByNameContains(name);
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        return findByDateBefore(end);
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        return findByDateAfter(start);
    }

    @Override
    public Collection<Course> findAll() {
        return findAll();
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {
        return findByStudentId(studentId);
    }

    @Override
    public boolean removeCourse(Course course) {
        return false;
    }

    @Override
    public void clear() {
        this.courses = new HashSet<>();
    }
}
