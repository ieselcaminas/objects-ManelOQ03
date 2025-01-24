package Network;

public class Escrita extends Publicacion {
    private String ID;
    private String texto;

    public Escrita(String nombreA, String ID, String texto) {
        super(nombreA);
        this.ID = ID;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Autor: " + super.getNombreA()
                + "\nID: " + ID
                + "\ntexto: " + texto
                + "\nFecha: " + super.getFecha()
                + "\nLikes: " + super.getnLikes();
    }
}
