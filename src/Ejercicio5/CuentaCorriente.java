package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {
    private String num_cc;
    private double saldo;
    private List<Cliente> clientes;
    private List<Domiciliacion>domiciliaciones;

    public CuentaCorriente(String num_cc, double saldo, List<Cliente> clientes, List<Domiciliacion> domiciliaciones) {
        this.num_cc = num_cc;
        this.saldo = saldo;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public String getN_cc() {
        return num_cc;
    }

    public void setN_cc(String num_cc) {
        this.num_cc = num_cc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add (cliente);
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliaciones(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "num_cc='" + num_cc + '\'' +
                ", saldo=" + saldo +
                ", clientes=" + clientes +
                ", domiciliaciones=" + domiciliaciones +
                '}';
    }
}
