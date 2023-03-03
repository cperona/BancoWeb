package com.example.bancoweb.db;

import com.example.bancoweb.model.Cliente;
import com.example.bancoweb.model.Cuenta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DaoImpl implements Dao{

    private SessionFactory sesion1;
    public DaoImpl(SessionFactory sesion1){
        this.sesion1 = sesion1;
    }
    public void insertCliente(String nombre_cliente, String id_fiscal, String email_cliente, String pais,
                              String cuenta, String ingreso_inicial) {
        Cliente clienteAPersistir = new Cliente(nombre_cliente, id_fiscal, email_cliente, pais);
        Cuenta cuentaAPersistir = new Cuenta(cuenta, ingreso_inicial, clienteAPersistir);

        Session sesion = sesion1.getCurrentSession();
        sesion.beginTransaction();
        sesion.persist(cuentaAPersistir);
        sesion.getTransaction().commit();
    }
}