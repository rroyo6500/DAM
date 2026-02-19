package InterfazesGraficas.InterficiesRobertRoyo.XatLocal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class XatLocal extends JFrame {

    public static void main(String[] args) {
        new XatLocal();
    }

    JTextArea chat;
    JTextField messageArea;
    JButton sendButton;

    public XatLocal() {
        setLayout(null);
        setTitle("Xat");
        setResizable(false);
        setBounds(0, 0, 650, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#cdf1fb"));

        chat = new JTextArea();
        chat.setBounds(10, 10, 600, 400);
        chat.setEditable(false);
        add(chat);

        messageArea = new JTextField();
        messageArea.setBounds(10, 420, 500, 30);
        messageArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });
        add(messageArea);

        sendButton = new JButton("Enviar");
        sendButton.setBounds(520, 420, 90, 30);
        sendButton.setBackground(Color.decode("#007bff"));
        sendButton.setForeground(Color.WHITE);
        sendButton.addActionListener(_ -> sendMessage());
        add(sendButton);

        setVisible(true);
    }

    public void sendMessage() {
        if (messageArea.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Debes introducir un mensaje",
                    "INFO",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        String message = messageArea.getText();
        chat.append(message + "\n");
        messageArea.setText("");
    }

}
