package Network;

import java.util.Date;

public class Publicacion {
    private String nombreA;
    private Date fecha;
    private Integer nLikes;
    //private String[] comentariosU;

    public Publicacion(String nombreA) {
        this.nombreA = nombreA;
        this.fecha = new Date();
        this.nLikes = 0;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getnLikes() {
        return nLikes;
    }

    public void setnLikes(Integer nLikes) {
        this.nLikes = nLikes;
    }
}
