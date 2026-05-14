<%@ page import="rroyo.JUtils.Utils.BBDD.ResultTable" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="rroyo.JUtils.Utils.BBDD.BBDDConnection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="rroyo.JUtils.Utils.WEB.JSP.RequestHolder" %>
<%@ page import="programacion.ra8_pr1_controlpanel.PasswordUtil" %>
<%--
  Created by IntelliJ IDEA.
  User: r.royo
  Date: 12/05/2026
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>

<h1>Login</h1>

<form action="" method="post">
    <label>
        User Name:
        <input type="text" name="username" placeholder="User name">
    </label>
    <label>
        Password:
        <input type="password" name="password" placeholder="password">
    </label>
    <input type="submit" name="btn" value="Enviar">
</form>

<%
    RequestHolder rh = new RequestHolder(request);

    if (rh.has("btn")) {

        try (BBDDConnection con = new BBDDConnection("jdbc:mysql://localhost:3306/controlpanel", "root", "")) {

            ResultSet rs = con.executeQuery("SELECT * FROM administrators");

            while (rs.next()) {
                if (rh.getString("username").equals(rs.getString("username")) &&
                        PasswordUtil.checkPassword(rh.getString("password"), rs.getString("password"))
                ) {
                    response.sendRedirect("tasks.jsp?id=" + rs.getInt("id"));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

%>

</body>
</html>
