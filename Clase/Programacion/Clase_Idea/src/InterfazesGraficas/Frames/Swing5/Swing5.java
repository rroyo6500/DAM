package InterfazesGraficas.Frames.Swing5;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Swing5 extends JFrame {

    public static void main(String[] args) {
        new Swing5();
    }

    public Font customFont;

    public Swing5() {
        setTitle("Swing5");
        setLayout(null);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);
        setResizable(false);

        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("src\\InterfazesGraficas\\Frames\\Swing5\\Fonts\\BitcountGridDouble.ttf"))
                    .deriveFont(40f);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }

        JLabel title = new JLabel("Horoscop Xines");
        title.setBounds(0, 0, 800, 100);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setFont(customFont);
        add(title);

        JLabel lAnyNaixement = new JLabel("Any de naixement");
        lAnyNaixement.setBounds(100, 150, 200, 25);
        add(lAnyNaixement);

        JTextField anyNaixement = new JTextField();
        anyNaixement.setBounds(300, 150, 200, 25);
        add(anyNaixement);

        JLabel lHoroscop = new JLabel("El teu horoscop es:");
        lHoroscop.setBounds(100, 200, 200, 25);
        add(lHoroscop);

        JLabel horoscop = new JLabel();
        horoscop.setBounds(0, 250, 400, 300);
        horoscop.setHorizontalAlignment(SwingConstants.CENTER);
        horoscop.setVerticalAlignment(SwingConstants.CENTER);
        horoscop.setFont(customFont);
        add(horoscop);

        JLabel image = new JLabel();
        image.setBounds(400, 250, 400, 300);
        image.setHorizontalAlignment(SwingConstants.CENTER);
        image.setVerticalAlignment(SwingConstants.CENTER);
        add(image);

        JButton calcular = new JButton("Calcular Horoscop");
        calcular.setBounds(525, 150, 200, 25);
        calcular.setBackground(Color.red);
        calcular.setForeground(Color.WHITE);
        calcular.addActionListener(e -> {
            String any = anyNaixement.getText().trim();
            if (any.isBlank() || !any.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(rootPane, "Introdueix un any");
                return;
            }

            switch (Integer.parseInt(any) % 12) {
                case 0 -> {
                    horoscop.setText("Mico");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/mono.png")));
                }
                case 1 -> {
                    horoscop.setText("Gall");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/gallo.png")));
                }
                case 2 -> {
                    horoscop.setText("Gos");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/perro.png")));
                }
                case 3 -> {
                    horoscop.setText("Porc");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/cerdo.png")));
                }
                case 4 -> {
                    horoscop.setText("Rata");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/Rata.png")));
                }
                case 5 -> {
                    horoscop.setText("Bou");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/buey.png")));
                }
                case 6 -> {
                    horoscop.setText("Tigre");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/tigre.png")));
                }
                case 7 -> {
                    horoscop.setText("Conill");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/conejo.png")));
                }
                case 8 -> {
                    horoscop.setText("Drac");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/dragon.png")));
                }
                case 9 -> {
                    horoscop.setText("serp");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/serpiente.png")));
                }
                case 10 -> {
                    horoscop.setText("Cavall");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/caballo.png")));
                }
                case 11 -> {
                    horoscop.setText("Cabra");
                    image.setIcon(new ImageIcon(getClass().getResource("/InterfazesGraficas/Frames/Swing5/Images/cabra.png")));
                }
                default -> {
                    horoscop.setText("Error");
                }
            }

        });
        add(calcular);

        setVisible(true);
    }

}
