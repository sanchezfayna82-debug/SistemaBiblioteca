package model;

import java.util.ArrayList;
import model.Libro;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<String> listarLibros() {
        ArrayList<String> lista = new ArrayList<>();
        for (Libro libro : libros) {
            lista.add(libro.toString());
        }
        return lista;
    }
}
