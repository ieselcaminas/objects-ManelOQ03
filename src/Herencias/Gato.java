package Herencias;

public class Gato extends Animal {
    public Gato(String nombre){
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Miau");
    }

    public void jugarConOvillo() {
        System.out.println("Me gusta jugar con ovillos");
    }
}
