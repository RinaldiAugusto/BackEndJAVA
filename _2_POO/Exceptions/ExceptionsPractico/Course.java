package _2_POO.Exceptions.ExceptionsPractico;

import _2_POO.Colecciones.MAPAS.Students;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
    private Integer id;
    private String subjet;
    private Set<Student> studentSet;

    public Course(Integer id, String subjet) {
        this.id = id;
        this.subjet = subjet;
        studentSet = new HashSet<>();
    }

    public void addStudents(Student student){
        if (student != null){
            studentSet.add(student);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getSubjet() {
        return subjet;
    }
}
