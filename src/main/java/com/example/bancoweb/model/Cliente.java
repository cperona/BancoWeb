package com.example.bancoweb.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id_cliente;

    @Column(name = "nombre_cliente")
    private String nombre_cliente;
    @Column(name = "id_fiscal")
    private String id_fiscal;
    @Column(name = "email_cliente")
    private String email_cliente;
    @Column(name = "pais")
    private String pais;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<Cuenta> cuentas;

    public Cliente() {
        this.cuentas = new HashSet<>();
    }

    public Cliente(String nombre_cliente, String id_fiscal, String email_cliente, String pais) {
        this.nombre_cliente = nombre_cliente;
        this.id_fiscal = id_fiscal;
        this.email_cliente = email_cliente;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", nombre_cliente='" + nombre_cliente + '\'' +
                ", id_fiscal='" + id_fiscal + '\'' +
                ", email_cliente='" + email_cliente + '\'' +
                ", pais='" + pais + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getId_fiscal() {
        return id_fiscal;
    }

    public void setId_fiscal(String id_fiscal) {
        this.id_fiscal = id_fiscal;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}