package Pokemon_RobertRoyo;

import Utils.BBDDConnection;

public interface DBConnection {

    BBDDConnection con = new BBDDConnection("jdbc:mysql://localhost:3306/pokedex", "root", "");

}
