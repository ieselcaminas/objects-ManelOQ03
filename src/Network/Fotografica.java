package Network;

public class Fotografica extends Publicacion {
    String titulo;
    String imagen;

    public Fotografica(String nombreA,String titulo, String imagen) {
        super(nombreA);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Autor: " + super.getNombreA()
                + "\nTitulo: " + titulo
                + "\nImagen: " + imagen
                + "\nFecha: " + super.getFecha()
                + "\nLikes: " + super.getnLikes();
    }
}
