package RA9_JDBC.Ejercicios.T3;

import Utils.BBDDConection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class T3_3 {

    private static String BBDD = "jdbc:mysql://localhost:3306/escola_robert1dam";
    private static String user = "robert";
    private static String password = "Rroyo4221";
    private static BBDDConection con = new BBDDConection(BBDD, user, password);

    public static void main(String[] args) {

        a();
        System.out.println("==========================");
        b();
        System.out.println("==========================");
        c();
        System.out.println("==========================");
        d();
        System.out.println("==========================");
        e();
        System.out.println("==========================");
        f();

    }

    public static void a(){
        try (ResultSet r = con.executeQuery("SELECT * FROM alumnes")) {

            while (r.next()) {
                System.out.println(r.getString("nom") + " " + r.getString("cognom"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(){
        try (ResultSet r = con.executeQuery("SELECT * FROM alumnes WHERE grup_id = ?", 2)) {

            while (r.next()) {
                System.out.println(r.getString("nom") + " " + r.getString("cognom"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(){
        try (ResultSet r = con.executeQuery("SELECT * FROM grups")) {

            while (r.next()) {
                System.out.println(r.getString("nom"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void d(){
        try (ResultSet r = con.executeQuery("SELECT * FROM alumnes")) {

            while (r.next()) {

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void e(){
        try (ResultSet r = con.executeQuery("SELECT * FROM alumnes")) {

            while (r.next()) {

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void f(){
        try (ResultSet r = con.executeQuery("SELECT * FROM alumnes")) {

            while (r.next()) {

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
