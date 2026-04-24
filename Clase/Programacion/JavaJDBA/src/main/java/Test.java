import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.*;

public class Test {

    public static void main(String[] args) {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/escola_robert1dam", "Robert", "Rroyo4221");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Statement st;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            ResultSet rs = st.executeQuery("SELECT * FROM alumnes");
            rs.next();

            while (rs.next()) {
                System.out.println(rs.getString("nom"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
