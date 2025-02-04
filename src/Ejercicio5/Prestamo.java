package Ejercicio5;

public class Prestamo {
    private int num_p;
    private int cantidad;

    public Prestamo(int num_p, int cantidad) {
        this.num_p = num_p;
        this.cantidad = cantidad;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "num_p=" + num_p +
                ", cantidad=" + cantidad +
                '}';
    }
}
