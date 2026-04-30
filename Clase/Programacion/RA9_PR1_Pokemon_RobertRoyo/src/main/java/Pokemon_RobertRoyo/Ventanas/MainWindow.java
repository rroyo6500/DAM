package Pokemon_RobertRoyo.Ventanas;

import Pokemon_RobertRoyo.DBConnection;
import Utils.BBDDConnection;
import Utils.CustomFonts;
import rroyo.JF.Enums.ActionEventTypes;
import rroyo.JF.Enums.Alignment;
import rroyo.JF.Enums.MainAxisAlignment;
import rroyo.JF.JFComponents.ComplexComponents.JFButton;
import rroyo.JF.JFComponents.ComplexComponents.JFComboBox;
import rroyo.JF.JFComponents.ComplexComponents.JFSizedStack;
import rroyo.JF.JFComponents.SimpleComponents.*;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainWindow extends JFWindow implements DBConnection {

    public MainWindow() {
        super(600, 300, "Llistat de Pokemon");

        setColor(Color.decode("#F8BD12"));

        JFComboBox comboBox = new JFComboBox(550, 25);

        String mysql = """
                SELECT * FROM pokemon
                """;

        try (ResultSet r = con.executeQuery(mysql)) {

            while (r.next()) {
                comboBox.addOption(
                        String.format(
                                "%s (%d) [%s]",
                                r.getString("name_pokemon"),
                                r.getInt("id"),
                                r.getString("type_pokemon")
                        )
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        addChild(
                new JFCenter(
                        new JFColumn(
                                new JFSizedBox(600, 200).addChild(
                                        new JFCenter(
                                                new JFText("Pokemon")
                                                        .setFont(CustomFonts.getFont("pk1", 50f))
                                                        .setColor(Color.BLUE)
                                        )
                                ),
                                comboBox,
                                new JFSizedStack(Alignment.RIGHT, 550, 50).addChild(
                                        new JFButton(100, 25, "Veure Imatge")
                                                .addActionListener(e -> {
                                                    if (e.getAction() == ActionEventTypes.CLICK){
                                                        new VentanaPokemon(comboBox.getSelectedIndex() + 1).setVisible(true);
                                                    }
                                                })
                                                .redesign((self, content) -> {
                                                    JFContainer container = (JFContainer) content;
                                                    container.getDecoration()
                                                            .setColor(Color.WHITE)
                                                            .setRadius(10);
                                                    return container;
                                                })
                                )
                        ).mainAxisAlignment(MainAxisAlignment.START)
                )
        );



    }

}
