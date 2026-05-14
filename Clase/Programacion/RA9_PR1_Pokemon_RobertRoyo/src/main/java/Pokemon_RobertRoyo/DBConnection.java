package Pokemon_RobertRoyo;

import rroyo.JUtils.Utils.BBDD.BBDDConnection;

import java.sql.SQLException;

public interface DBConnection {

    BBDDConnection con = new BBDDConnection("jdbc:mysql://localhost:3306/pokedex", "root", "");

}
