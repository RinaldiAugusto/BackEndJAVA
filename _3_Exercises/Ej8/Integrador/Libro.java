package _3_Exercises.Ej8.Integrador;

public class Libro {
    private String titulo;
    private String autor;
    private Integer anoPublicacion;

    public Libro(String titulo, String autor, Integer anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(Integer anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " |Autor: " + autor + " |Publicacion: " + anoPublicacion;
    }
}
