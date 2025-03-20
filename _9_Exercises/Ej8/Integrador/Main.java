package _9_Exercises.Ej8.Integrador;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Agílmente", "Estanislao Bachrach", 2019);
        Libro libro2 = new Libro("El poder de las palabras", "Mariano Sigman", 2019);
        Libro libro3 = new Libro("Harry Potter 1", "Joanne Rowling", 2019);
        Libro libro4 = new Libro("Autos", "Augusto Rinaldi", 2030);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

        biblioteca.searchLibro(libro4);

        biblioteca.mostrarLibros(biblioteca);

        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.mostrarLibros(biblioteca1);
    }
}