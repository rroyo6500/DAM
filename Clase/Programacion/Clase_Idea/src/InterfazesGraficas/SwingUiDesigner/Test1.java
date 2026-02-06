package InterfazesGraficas.SwingUiDesigner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Test1 extends JFrame {

    private JPanel panel;
    private JLabel texto;

    public Test1 () {
        setContentPane(panel);
        setBounds( 0, 0, 100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test1();
    }

}
