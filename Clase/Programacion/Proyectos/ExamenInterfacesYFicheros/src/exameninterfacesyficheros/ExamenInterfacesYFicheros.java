package exameninterfacesyficheros;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author r.royo
 */
public class ExamenInterfacesYFicheros extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ExamenInterfacesYFicheros();
    }

    public double mitjana = 0;

    public Font font = new Font("MV Boli", Font.BOLD, 24);

    public ExamenInterfacesYFicheros() {
        setLayout(null);
        setBounds(0, 0, 500, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Calculadora de notes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#DAF7A6"));

        JLabel title = new JLabel("Calculadora de notes");
        title.setBounds(0, 0, 500, 100);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(font);
        title.setForeground(Color.decode("#33CC00"));
        add(title);

        JLabel[] notesLabels = new JLabel[5];
        JTextField[] notesField = new JTextField[5];

        int y = 100;
        for (int i = 0; i < 5; i++) {
            notesLabels[i] = new JLabel("Nota " + (i + 1) + ":");
            notesLabels[i].setBounds(20, y, 50, 25);
            notesLabels[i].setForeground(Color.decode("#33CC00"));

            notesField[i] = new JTextField();
            notesField[i].setBounds(80, y, 375, 25);

            add(notesLabels[i]);
            add(notesField[i]);

            y += 50;
        }

        JButton boton = new JButton("Calcular");
        boton.setBounds(350, y, 100, 25);
        boton.addActionListener(_ -> {

            for (int i = 0; i < notesField.length; i++) {
                if (notesField[i].getText().isBlank()) {
                    JOptionPane.showMessageDialog(rootPane, "No poden haber camps buits", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try {
                    if (Double.parseDouble(notesField[i].getText()) > 10 || Double.parseDouble(notesField[i].getText()) < 0) {
                        JOptionPane.showMessageDialog(rootPane, "La nota " + (i + 1) + " esta fora de rang", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane, "Les notes han de ser numeros enters o decimals", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                mitjana += Double.parseDouble(notesField[i].getText());
            }
            mitjana = mitjana / notesField.length;

            new Mitjana(mitjana);
            ExamenInterfacesYFicheros.this.setVisible(false);
            
        });
        add(boton);

        setVisible(true);
    }

}
