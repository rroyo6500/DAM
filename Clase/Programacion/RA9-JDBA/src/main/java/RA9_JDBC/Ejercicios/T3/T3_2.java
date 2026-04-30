package RA9_JDBC.Ejercicios.T3;

import Utils.BBDDConection;

import java.sql.*;

public class T3_2 {

    private static String BBDD = "jdbc:mysql://localhost:3306/spotify";
    private static String user = "robert";
    private static String password = "Rroyo4221";
    private static BBDDConection con = new BBDDConection(BBDD, user, password);

    public static void main(String[] args) {

        try (ResultSet r = con.executeQuery("SELECT * FROM canciones WHERE duracio > ?", 200)) {

            while (r.next()) {
                System.out.println(
                        String.format("%s [%s] - %dm",
                                r.getString("titol"),
                                r.getString("artista"),
                                r.getInt("duracio")
                        )
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
