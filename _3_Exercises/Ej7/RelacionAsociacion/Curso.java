package _3_Exercises.Ej7.RelacionAsociacion;

public class Curso {
    private String name;
    private Profesor profesor;

    public Curso(String name, Profesor profesor) {
        this.name = name;
        this.profesor = profesor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Course: " + name +" |Subjet: " + profesor.getSpeciality() + " |Teacher: " + profesor.getName();
    }
}
