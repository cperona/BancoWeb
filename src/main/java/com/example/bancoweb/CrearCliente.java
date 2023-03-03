package com.example.bancoweb;

import com.example.bancoweb.db.DaoImpl;
import com.example.bancoweb.db.HibernateUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CrearCliente", value = "/CrearCliente")
public class CrearCliente extends HttpServlet {

    public void init(){ String message = "Hello world";
        System.out.println(message); }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre_cliente = request.getParameter("nombre_cliente");
        String id_fiscal = request.getParameter("id_fiscal");
        String email_cliente = request.getParameter("email_cliente");
        String pais = request.getParameter("pais");
        String cuenta = request.getParameter("cuenta");
        String ingreso_inicial = request.getParameter("ingreso_inicial");

        SessionFactory sf = HibernateUtil.getSessionFactory();

        DaoImpl dao = new DaoImpl(sf);
        dao.insertCliente(nombre_cliente, id_fiscal, email_cliente, pais, cuenta, ingreso_inicial);

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println ("<HTML>");
        printWriter.println ("<BODY>");
        printWriter.println ("<h1>" + nombre_cliente + "</h1>");
        printWriter.println ("<h1>" + id_fiscal + "</h1>");
        printWriter.println ("<h1>" + email_cliente + "</h1>");
        printWriter.println ("<h1>" + pais + "</h1>");
        printWriter.println ("<h1>" + cuenta + "</h1>");
        printWriter.println ("<h1>" + ingreso_inicial + "</h1>");
        printWriter.println ("</BODY>");
        printWriter.println ("</HTML>");
    }

    public void destroy(){}

}
