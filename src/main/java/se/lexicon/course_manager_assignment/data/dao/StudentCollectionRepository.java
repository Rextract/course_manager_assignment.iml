package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import javax.validation.constraints.Email;
import java.util.Collection;
import java.util.HashSet;


public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;

    public StudentCollectionRepository(Collection<Student> students) {
        this.students = students;
    }



    @Override
    public Student createStudent(String name, String email, String address) {
        return new Student(StudentSequencer.nextStudentId(), name, email, address);
    }

    @Override
    public Student findByEmailIgnoreCase(String email) {
        return findByEmailIgnoreCase(email);

    }

    @Override
    public Collection<Student> findByNameContains(String name) {
        return findByNameContains(name);
    }

    @Override
    public Student findById(int id) {
        return findById(id);
    }

    @Override
    public Collection<Student> findAll() {
        return findAll();
    }

    @Override
    public boolean removeStudent(Student student) {
        return false;
    }

    @Override
    public void clear() {
        this.students = new HashSet<>();
    }
}
