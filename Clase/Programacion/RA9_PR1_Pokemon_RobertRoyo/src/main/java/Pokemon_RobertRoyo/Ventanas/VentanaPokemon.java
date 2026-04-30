package Pokemon_RobertRoyo.Ventanas;

import Pokemon_RobertRoyo.DBConnection;
import Utils.CustomFonts;
import rroyo.JF.Enums.MainAxisAlignment;
import rroyo.JF.JFComponents.SimpleComponents.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VentanaPokemon extends JFWindow implements DBConnection {

    private final int idPokemon;
    private final String pokemonName;
    private final String pokemonType;

    public VentanaPokemon(int idPokemon) {
        super(600, 500, "Pokemon", JFrame.DISPOSE_ON_CLOSE);
        setColor(Color.gray);

        this.idPokemon = idPokemon;

        String mysql = """
                SELECT name_pokemon, type_pokemon
                FROM pokemon
                WHERE id = ?
                """;

        try (ResultSet r = con.executeQuery(mysql, idPokemon)) {
            r.next();
            pokemonName = r.getString("name_pokemon");
            pokemonType = r.getString("type_pokemon");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        BufferedImage pokemonImage;
        try {
            URL url = new URL(String.format(
                    "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/%d.png",
                    idPokemon
            ));
            pokemonImage = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        addChild(
                new JFCenter(
                        new JFColumn(
                                new JFSizedBox(600, 200).addChild(
                                        new JFCenter(
                                                new JFText(pokemonName)
                                                        .setFont(CustomFonts.getFont("pk2", 50f).deriveFont(Font.BOLD))
                                                        .setColor(switch (pokemonType) {
                                                            case "Grass" -> Color.GREEN;
                                                            case "Fire" -> Color.RED;
                                                            case "Water" -> Color.BLUE;
                                                            case "Bug" -> Color.decode("#A8B820");
                                                            case "Normal" -> Color.LIGHT_GRAY;
                                                            case "Poison" -> Color.decode("#A040A0");
                                                            case "Electric" -> Color.YELLOW;
                                                            case "Ground" -> Color.decode("#E0C068");
                                                            case "Fairy" -> Color.decode("#EE99AC");
                                                            case "Fighting" -> Color.decode("#C03028");
                                                            case "Psychic" -> Color.decode("#F85888");
                                                            case "Rock" -> Color.decode("#B8A038");
                                                            case "Ghost" -> Color.decode("#705898");
                                                            case "Ice" -> Color.decode("#98D8D8");
                                                            case "Dragon" -> Color.decode("#7038F8");
                                                            case "Dark" -> Color.decode("#705848");
                                                            case "Steel" -> Color.decode("#B8B8D0");
                                                            default -> throw new IllegalArgumentException(pokemonType);
                                                        })
                                        )
                                ),
                                new JFImage(pokemonImage).setSizePercentage(250)
                        ).mainAxisAlignment(MainAxisAlignment.START)
                )
        );

    }

}
