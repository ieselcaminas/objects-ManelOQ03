package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Integer n_ent;
    private String nombre;
    private List<Sucursal>sucursales;

    public Banco(Integer n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public Integer getN_ent() {
        return n_ent;
    }

    public void setN_ent(Integer n_ent) {
        this.n_ent = n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursales(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "n_ent='" + n_ent + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
