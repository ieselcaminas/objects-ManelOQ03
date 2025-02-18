package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int isbn;
    private String nombre;
    private List<Autor> autores;
    private List<Ejemplar> ejemplares;

    public Libro(int isbn, String nombre) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autores = new ArrayList<>();
        this.ejemplares = new ArrayList<>();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add (ejemplar);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", nombre='" + nombre + '\'' +
                ", autores=" + autores +
                ", ejemplares=" + ejemplares +
                '}';
    }
}
