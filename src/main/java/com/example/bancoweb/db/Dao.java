package com.example.bancoweb.db;

public interface Dao {
    public void insertCliente(String nombre_cliente, String id_fiscal, String email_cliente, String pais,
                              String cuenta, String ingreso_inicial);
}
