package Ejercicio4;

public class Tema {
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
