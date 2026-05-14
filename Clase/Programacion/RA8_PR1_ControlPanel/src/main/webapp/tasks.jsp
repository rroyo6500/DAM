<%@ page import="rroyo.JUtils.Utils.WEB.JSP.RequestHolder" %>
<%@ page import="rroyo.JUtils.Utils.BBDD.BBDDConnection" %>
<%@ page import="programacion.ra8_pr1_controlpanel.PasswordUtil" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: r.royo
  Date: 14/05/2026
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tasques</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<h1>Tasks</h1>

<div id="adminSection">

</div>

<%

    String id = request.getParameter("id");

    try (BBDDConnection con = new BBDDConnection("jdbc:mysql://localhost:3306/controlpanel", "root", "")) {

        ResultSet rs = (id.equals("1"))
                ? con.executeQuery("""
                SELECT * FROM tasks
                """)
                : con.executeQuery("""
                SELECT * FROM tasks
                WHERE assigned_to = ?
                """, id);

        StringBuilder table = new StringBuilder();
        table.append("""
                <table>
                    <tr>
                        <th>Task description</th>
                        <th>Due Date</th>
                        <th>Priority</th>
                        <th>Status</th>
                    </tr>
                """);
        while (rs.next()) {
            table.append(String.format("""
                    <tr class="%s">
                        <td>%s</td>
                        <td>%s</td>
                        <td>%s</td>
                        <td>%s</td>
                    </tr>
                    """,
                    rs.getString("priority").toLowerCase(),
                    rs.getString("task_description"),
                    rs.getString("due_date"),
                    rs.getString("priority"),
                    rs.getString("status")
                    ));
        }
        table.append("</table>");

        out.println(table);

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

%>

</body>
</html>
