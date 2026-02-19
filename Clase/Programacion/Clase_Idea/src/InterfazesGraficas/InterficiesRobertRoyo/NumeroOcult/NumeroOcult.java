package InterfazesGraficas.InterficiesRobertRoyo.NumeroOcult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NumeroOcult extends JFrame {

    public static void main(String[] args) {
        new NumeroOcult();
    }

    public int randomNumber = new Random().nextInt(25) + 1;

    JLabel numberLabel, resultLabel;
    JTextField numberField;
    JButton checkButton;

    public NumeroOcult() {
        setLayout(null);
        setTitle("JOC - Numero Ocult");
        setResizable(false);
        setBounds(0, 0, 500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#FFF98A"));

        numberLabel = new JLabel("Endevina el numero (1 - 25)");
        numberLabel.setBounds(50, 25, 200, 25);
        add(numberLabel);

        numberField = new JTextField();
        numberField.setBounds(50, 50, 400, 25);
        numberField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) checkNumber();
            }
        });
        add(numberField);

        resultLabel = new JLabel();
        resultLabel.setBounds(50, 150, 400, 25);
        add(resultLabel);

        checkButton = new JButton("Comprobar");
        checkButton.setBounds(50, 80, 100, 25);
        checkButton.addActionListener(_ -> checkNumber());
        add(checkButton);

        setVisible(true);
    }

    public void checkNumber() {
        if (numberField.getText().isBlank() || numberField.getText().matches(".*[a-zA-Z.]+.*")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Debes introducir un numero valido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        int number = Integer.parseInt(numberField.getText().trim());
        numberField.setText("");

        if (number < 1 || number > 25) {
            JOptionPane.showMessageDialog(
                    null,
                    "El numero debe estar entre 1 y 25",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        if (number == randomNumber) {
            resultLabel.setForeground(Color.BLACK);
            resultLabel.setText("Has encertat el numero! " + randomNumber);
        } else {
            resultLabel.setForeground(Color.RED);
            if (randomNumber > number) resultLabel.setText("El numero es mayor que " + number);
            else resultLabel.setText("El numero es menor que " + number);
        }
    }

}
