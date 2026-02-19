package InterfazesGraficas.InterficiesRobertRoyo.Temperatures;

import javax.swing.*;
import java.awt.*;

public class ConversorTemperatures extends JFrame {

    public static void main(String[] args) {
        new ConversorTemperatures();
    }

    JLabel tKelvin, tFahrenheit, tCelsius;
    JLabel tempKelvin, tempFahrenheit;
    JTextField tempCelsius;
    JButton convertButton, clearButton;
    JPanel resultPanel;

    public ConversorTemperatures() {
        setLayout(null);
        setTitle("Conversor de Temperaturas");
        setResizable(false);
        setBounds(0, 0, 500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#EBDEF0"));

        tCelsius = new JLabel("Temperatura en Celsius");
        tCelsius.setBounds(50, 25, 150, 25);
        add(tCelsius);

        tempCelsius = new JTextField();
        tempCelsius.setBounds(200, 25, 250, 25);
        add(tempCelsius);

        convertButton = new JButton("Convertir");
        convertButton.setBounds(350, 75, 100, 25);
        convertButton.addActionListener(_ -> {
            if (tempCelsius.getText().isBlank() || tempCelsius.getText().matches(".*[a-zA-Z]+.*")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debes introducir un numero valido",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            double celsius = Double.parseDouble(tempCelsius.getText());
            double kelvin = celsius + 273.15;
            double fahrenheit = (celsius * 1.8) + 32;

            tempKelvin.setText(String.valueOf(kelvin));
            tempFahrenheit.setText(String.valueOf(fahrenheit));
            resultPanel.setVisible(true);
        });
        convertButton.setBackground(Color.cyan);
        add(convertButton);

        resultPanel = new JPanel();
        resultPanel.setLayout(null);
        resultPanel.setBounds(0, 100, 500, 150);
        resultPanel.setBackground(Color.decode("#EBDEF0"));

        tKelvin = new JLabel("Temperatura en Kelvin");
        tKelvin.setBounds(50, 10, 150, 25);
        resultPanel.add(tKelvin);

        tempKelvin = new JLabel();
        tempKelvin.setBounds(225, 10, 250, 25);
        resultPanel.add(tempKelvin);

        tFahrenheit = new JLabel("Temperatura en Fahrenheit");
        tFahrenheit.setBounds(50, 50, 200, 25);
        resultPanel.add(tFahrenheit);

        tempFahrenheit = new JLabel();
        tempFahrenheit.setBounds(225, 50, 250, 25);
        resultPanel.add(tempFahrenheit);

        clearButton = new JButton("Limpiar");
        clearButton.setBounds(350, 75, 100, 25);
        clearButton.addActionListener(_ -> resultPanel.setVisible(false));
        clearButton.setBackground(Color.cyan);
        resultPanel.add(clearButton);

        resultPanel.setVisible(false);
        add(resultPanel);

        setVisible(true);
    }

}
