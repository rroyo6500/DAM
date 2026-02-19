package InterfazesGraficas.Frames.Swing4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Swing4 extends JFrame {

    public static void main(String[] args) {
        new Swing4();
    }

    public Swing4() {
        setTitle("Swing4");
        setLayout(null);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.cyan);
        setResizable(false);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{
                "Informatica",
                "Comptabilitat",
                "Marqueting"
        });
        comboBox.setBounds(50, 50, 400, 30);
        add(comboBox);

        JButton button = new JButton("Consultar");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(e -> {
            ResultFrame resultFrame = switch (comboBox.getSelectedIndex()) {
                case 0 -> new ResultFrame("Eines: Reiniciar Servidor, Formatejar PC.");
                case 1 -> new ResultFrame(" Eines: Excel, Calcular IRPF.");
                case 2 -> new ResultFrame("Eines: Instagram, Photoshop.");
                default -> null;
            };
            resultFrame.setVisible(true);
        });
        add(button);

        setVisible(true);
    }

}
