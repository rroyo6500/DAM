package InterfazesGraficas.Frames.Swing4;

import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {

    public ResultFrame(String msg) {
        setTitle("Resultado");
        setLayout(null);
        setSize(500, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.cyan);
        setResizable(false);

        JLabel message = new JLabel(msg);
        message.setBounds(0, 0, getWidth(), getHeight());
        message.setForeground(Color.BLUE);
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setVerticalAlignment(SwingConstants.CENTER);
        add(message);

        setVisible(true);
    }

}
