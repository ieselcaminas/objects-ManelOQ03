package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal{
    private Banco id;
    private Integer n_suc;
    private String localizacion;
    private List<Prestamo>prestamos;

    public Sucursal(Integer n_suc, String localizacion, Banco id, List<Prestamo> prestamos) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.id = id;
        this.prestamos = new ArrayList<>();
    }

    public Banco getId() {
        return id;
    }

    public void setId(Banco id) {
        this.id = id;
    }

    public Integer getN_suc() {
        return n_suc;
    }

    public void setN_suc(Integer n_suc) {
        this.n_suc = n_suc;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public List<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    public void addPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", n_suc=" + n_suc +
                ", localizacion='" + localizacion + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
