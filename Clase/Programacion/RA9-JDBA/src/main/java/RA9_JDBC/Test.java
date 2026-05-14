package RA9_JDBC;

import rroyo.JUtils.Utils.BBDD.BBDDConnection;
import rroyo.JUtils.Utils.BBDD.ResultTable;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {

        try (BBDDConnection con = new BBDDConnection(
                "jdbc:mysql://localhost:3306/escola_robert1dam",
                "root",
                ""
        )) {

            ResultTable rt = new ResultTable(con.executeQuery("SELECT * FROM alumnes"));
            System.out.println(rt);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
