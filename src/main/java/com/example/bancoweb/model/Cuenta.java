package com.example.bancoweb.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Cuenta")
public class Cuenta implements Serializable {
    @Id
    @Column(name = "cuenta")
    private String cuenta;

    @Column(name = "ingreso_inicial")
    private String ingreso_inicial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(String cuenta, String ingreso_inicial, Cliente cliente) {
        this.cuenta = cuenta;
        this.ingreso_inicial = ingreso_inicial;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuenta='" + cuenta + '\'' +
                ", ingreso_inicial='" + ingreso_inicial + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getIngreso_inicial() {
        return ingreso_inicial;
    }

    public void setIngreso_inicial(String ingreso_inicial) {
        this.ingreso_inicial = ingreso_inicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
