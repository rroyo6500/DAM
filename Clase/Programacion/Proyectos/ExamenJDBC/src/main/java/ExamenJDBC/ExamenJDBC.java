package ExamenJDBC;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import rroyo.JUtils.Utils.ScannerAux;

/**
 *
 * @author r.royo
 */
public class ExamenJDBC implements DBConection {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n****************************************************************");
        System.out.println("Llistat de departaments");
        System.out.println("****************************************************************");

        try (ResultSet r = con.executeQuery("SELECT * FROM departments")) {
            while (r.next()) {
                System.out.println(
                        String.format("ID: %d\tName: %s",
                                r.getInt("id"),
                                r.getString("name")
                        )
                );
            }
        } catch (SQLException ex) {
            System.getLogger(ExamenJDBC.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        System.out.println("\n****************************************************************");
        System.out.println("Llistat d'estudiants");
        System.out.println("****************************************************************");

        try (ResultSet r = con.executeQuery("SELECT * FROM universitymembers")) {

            while (r.next()) {
                System.out.println(
                        String.format("%s %s, %s",
                                r.getString("name"),
                                r.getString("lastname1"),
                                (r.getString("phonenumber") == null) 
                                        ? "No hi ha telèfon registrat"
                                        : r.getString("phonenumber")
                        )
                );
            }

        } catch (SQLException ex) {
            System.getLogger(ExamenJDBC.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        System.out.println("\n****************************************************************");
        String dep_name = ScannerAux.readString("Escriu el nom d'un departament");
        System.out.println("****************************************************************");

        try (
                ResultSet r = con.executeQuery("""
                                            SELECT *
                                            FROM universitymembers m
                                            JOIN departments d
                                            ON m.department_id = d.id
                                            WHERE d.name = ?
                                            """, dep_name)) {

            while (r.next()) {
                System.out.println(
                        String.format("%s %s, %s",
                                r.getString("lastname1"),
                                r.getString("lastname2"),
                                r.getString("name")
                        )
                );
            }

        } catch (SQLException ex) {
            System.getLogger(ExamenJDBC.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        System.out.println("\n****************************************************************");
        System.out.println("Llistat de departaments i numero de membres");
        System.out.println("****************************************************************");

        try (
                ResultSet r = con.executeQuery("""
                                               SELECT d.id, d.name, count(m.dni) AS 'membres'
                                               FROM departments d
                                               JOIN universitymembers m
                                               ON d.id = m.department_id
                                               GROUP BY d.id
                                               """)) {

            while (r.next()) {
                System.out.println(
                        String.format("%d %s %d",
                                r.getInt("id"),
                                r.getString("name"),
                                r.getInt("membres")
                        )
                );
            }
            
        } catch (SQLException ex) {
            System.getLogger(ExamenJDBC.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
