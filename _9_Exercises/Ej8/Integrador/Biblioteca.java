package _9_Exercises.Ej8.Integrador;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libroList = new ArrayList<>();

    public void addLibro(Libro libro) {
        libroList.add(libro);
    }

    public void searchLibro(Libro libro) {
        Libro wantedlibro = null;
        for (Libro libro1 : libroList) {
            if (libro1.equals(libro)) {
                wantedlibro = libro1;
            }
        }
        if (wantedlibro != null) {
            System.out.println("Libro encontrado...");
            System.out.println(wantedlibro);
        } else System.out.println("No se puedo encontrar el libro ingresado..");
    }

    public void mostrarLibros(Biblioteca biblioteca) {
        if (biblioteca != null) {
            System.out.println("Libros agregados en biblioteca: ");
            for (Libro libro : libroList) {
                System.out.println(libro);
            }
        }else System.out.println("La biblioteca no contiene libros cargados...");
    }
}
