package POO.Practicas.HogwartsRobertRoyo.Java.Ventanas;

import POO.Practicas.HogwartsRobertRoyo.Java.Alumno;
import POO.Practicas.HogwartsRobertRoyo.Java.Casa;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.Enums.ActionEventTypes;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.Enums.Alignment;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.ComplexComponents.*;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.SimpleComponents.*;
import POO.Practicas.HogwartsRobertRoyo.Java.Main;
import POO.Practicas.HogwartsRobertRoyo.Utils.CustomFonts;

import java.awt.*;

public class MainWindow extends JFWindow {

    private final JFComboBox comboBox;

    /**
     * Creates a top-level window with a fixed content size.
     * <p>
     * The constructor configures the underlying Swing frame, installs the framework event
     * bridges, makes the panel focusable so it can receive keyboard input, and finally shows
     * the window on screen.
     *
     * @param width  width of the window content area in pixels
     * @param height height of the window content area in pixels
     */
    public MainWindow(int width, int height) {
        super(width, height, "Hogwarts");
        setColor(Color.decode("#CA9E5C"));
        comboBox = new JFComboBox((int) (width * 0.75), 50);
        addChild(
                new JFCenter(
                        new JFColumn(
                                new JFText("Hogwarts")
                                        .setFont(CustomFonts.getFont("HP"))
                                        .setColor(Color.decode("#726255")),
                                new JFSizedBox(1, 15),
                                comboBox,
                                new JFSizedBox(1, 15),
                                new JFSizedStack(Alignment.RIGHT, (int) (width * 0.75), 50).addChild(
                                        new JFButton(100, 50, new JFText("Get House"))
                                                .addActionListener(e -> {
                                                    if (e.getAction() == ActionEventTypes.CLICK) {
                                                        String alumnoSeleccionado = comboBox.getSelectedItem();

                                                        for (Casa casa : Main.casas) {

                                                            for (Alumno alumno : casa.getAlumnos()) {

                                                                if (alumnoSeleccionado.equalsIgnoreCase(alumno.toString())) {
                                                                    new InformacionCasas(500, 400, casa, alumno);
                                                                }

                                                            }

                                                        }

                                                    }
                                                })
                                                .redesign((self, content) -> {
                                                    JFContainer container = (JFContainer) content;
                                                    JFButton button = (JFButton) self;

                                                    container.getDecoration()
                                                            .setColor(Color.decode("#998A7E"))
                                                            .setBorderRadius(15);
                                                    button.getText().setColor(Color.WHITE);

                                                    return container;
                                                })
                                )
                        )
                )
        );
    }

    public JFComboBox getComboBox() {
        return comboBox;
    }

    @Override
    public MainWindow setVisible(boolean visible) {
        super.setVisible(visible);
        return this;
    }
}
