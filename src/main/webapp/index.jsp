<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Banco</title>
</head>
<body>
<h1><%= "Banco" %>
</h1>
<br/>
<form action="CrearCliente" method="post">
    <ul>
        <li>
            <label for="nombre_cliente">Nombre cliente:</label>
            <input type="text" id="nombre_cliente" name="nombre_cliente">
        </li>
        <li>
            <label for="id_fiscal">ID Fiscal (DNI, NIE):</label>
            <input type="text" id="id_fiscal" name="id_fiscal">
        </li>
        <li>
            <label for="email_cliente">Email cliente:</label>
            <input type="email" id="email_cliente" name="email_cliente">
        </li>
        <li>
            <label for="pais">Pais:</label>
            <input type="text" id="pais" name="pais">
        </li>
        <li>
            <label for="cuenta">Cuenta:</label>
            <input type="text" id="cuenta" name="cuenta">
        </li>
        <li>
            <label for="ingreso_inicial">Ingreso inicial (€):</label>
            <input type="text" id="ingreso_inicial" name="ingreso_inicial">
        </li>
        <li class="button">
            <button type="submit">Crear cliente</button>
        </li>
    </ul>
</form>
</body>
</html>