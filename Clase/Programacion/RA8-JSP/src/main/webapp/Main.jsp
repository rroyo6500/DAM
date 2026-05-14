<%@ page import="rroyo.JUtils.Utils.BBDD.BBDDConnection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="rroyo.JUtils.Utils.BBDD.ResultTable" %>
<%--
  Created by IntelliJ IDEA.
  User: r.royo
  Date: 07/05/2026
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>

<!--
<form action="" method="post">

    <label for="id">ID</label>
    <input type="number" name="id" id="id">

    <label for="grupo">Nombre Grupo</label>
    <input type="text" name="grupo" id="grupo">

    <input type="submit" name="btn" value="Añadir Grupo">

</form>
-->

<%
    /*
    String btn = request.getParameter("btn");
    String id = request.getParameter("id");
    String grupName = request.getParameter("grupo");

    if (btn != null) {

        try {
            BBDDConnection con = new BBDDConnection(
                    "jdbc:mysql://localhost:3306/escola_robert1dam",
                    "root",
                    ""
            );

            con.executeUpdate("""
                    INSERT INTO grups (nom)
                    VALUES (?)
                    """, grupName);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    */


    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

    try (BBDDConnection con = new BBDDConnection(
            "jdbc:mysql://localhost:3306/escola_robert1dam",
            "root",
            ""
    )) {

        ResultTable rt = new ResultTable(con.executeQuery("SELECT * FROM alumnes"));
        out.println(rt);

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

%>
</body>
</html>
