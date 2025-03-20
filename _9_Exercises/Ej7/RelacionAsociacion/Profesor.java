package _9_Exercises.Ej7.RelacionAsociacion;

public class Profesor {
    private String name;
    private String speciality;

    public Profesor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
