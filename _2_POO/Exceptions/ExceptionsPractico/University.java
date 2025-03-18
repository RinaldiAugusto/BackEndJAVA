package _2_POO.Exceptions.ExceptionsPractico;

import _2_POO.Colecciones.MAPAS.Students;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class University {
    private String name;
    private Set<Course> courseSet;
    private Set<Student> studentSet;

    public University(String name) {
        this.name = name;
        courseSet = new HashSet<>();
        studentSet = new HashSet<>();
    }

    public void generateCourse(Integer id, String subjet) {
        Course course = new Course(id, subjet);
        courseSet.add(course);
    }

    public void generateStudent(Integer id, String name) {
        Student student = new Student(id, name);
        studentSet.add(student);
    }

    public void suscribeStudent(Integer courseId, Integer studentId) throws Exception {
        Course course = findCourse(courseId);
        Student student = findStudent(studentId);
        if (courseId == null){
            throw new CourseException("Id de curso no valido");
        }
        if (studentId == null){
            throw new StudentException("Id alumno no valido");
        }
        course.addStudents(student);
        System.out.println(student.getName() + " Se inscribio correctamente a " + course.getSubjet());

    }

    private Course findCourse(Integer courseId){
        Course wantedCourse = null;

        for (Course course : courseSet){
            if (course.getId().equals(courseId)){
                wantedCourse = course;
            }
        }
        return wantedCourse;
    }

    private Student findStudent(Integer studentId){
        Student studentWanted = null;
        for (Student student:studentSet){
            if (student.getId().equals(studentId)){
                studentWanted = student;
            }
        }
        return studentWanted;
    }



}
