package InterfazesGraficas.CreacionDeInterfazes;

import javax.swing.*;
import java.awt.*;

public class PrimeraInterfaz {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Act - 1");
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana.setSize(300, 300);

        JLabel etiqueta = new JLabel("Hola Mundo 1");
        ventana.add(etiqueta);

        JLabel etiqueta2 = new JLabel("Hola Mundo 2");
        ventana.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("Hola Mundo 3");
        ventana.add(etiqueta3);

        ventana.setVisible(true);

    }

}
