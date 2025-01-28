package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta a12006 = new Cuenta("Carlos");
        Cuenta b31456 = new Cuenta("Armando", 12);

        a12006.ingresar(-132);
        b31456.retirar(-132);
        System.out.println(a12006);
        System.out.println(b31456);
    }
}
