package Herencias;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("guau");
    }

    public void traerZapatillas() {
        System.out.println("Toma tus zapatillas, amo");
    }
}
