package Trabajadores;

public class Main {
    public static void main(String[] args) {
        Tecnico t = new Tecnico("Juan");
        System.out.println(t);
        Operario o = new Operario("Luan");
        System.out.println(o);
        Empleado emp = new Empleado("Jose");
        System.out.println(emp);
        Directivo d = new Directivo("Pepe");
        System.out.println(d);
        Oficial of = new Oficial("Pablo");
        System.out.println(of);

    }
}