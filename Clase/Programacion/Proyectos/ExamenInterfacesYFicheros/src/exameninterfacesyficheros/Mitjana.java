/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameninterfacesyficheros;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.*;
import rroyo.JUtils.Utils.FileUtilHandler;

/**
 *
 * @author r.royo
 */
public class Mitjana extends JFrame {
    
    public Font font = new Font("Gill Sans MT", Font.BOLD, 18);
    
    public Mitjana(double notaMitjana) {
        setLayout(null);
        setBounds(0, 0, 800, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Mitjana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#DAF7A6"));
        
        JLabel title = new JLabel("La teva mitjana és:");
        title.setBounds(0, 0, 300, 150);
        title.setFont(font);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        add(title);
        
        JLabel nota = new JLabel(String.valueOf(notaMitjana));
        nota.setBounds(300, 0, 100, 150);
        nota.setFont(font);
        nota.setHorizontalAlignment(JLabel.CENTER);
        nota.setVerticalAlignment(JLabel.CENTER);
        add(nota);
        
        ImageIcon iconoNota = null;
        String msgFile = null;
        if (notaMitjana < 5.0) {
            iconoNota = new ImageIcon(getClass().getResource("/RecursosExamen/qualificacions/suspes.png"));
            msgFile = FileUtilHandler.readFile("src/RecursosExamen/txtNotes/suspes.txt");
        } else if (notaMitjana >= 5 && notaMitjana < 7) {
            iconoNota = new ImageIcon(getClass().getResource("/RecursosExamen/qualificacions/aprovat.png"));
            msgFile = FileUtilHandler.readFile("src/RecursosExamen/txtNotes/aprovat.txt");
        } else if (notaMitjana >= 7 && notaMitjana < 9) {
             iconoNota = new ImageIcon(getClass().getResource("/RecursosExamen/qualificacions/notable.png"));
             msgFile = FileUtilHandler.readFile("src/RecursosExamen/txtNotes/notable.txt");
        } else if (notaMitjana >= 9) {
            iconoNota = new ImageIcon(getClass().getResource("/RecursosExamen/qualificacions/excelent.png"));
            msgFile = FileUtilHandler.readFile("src/RecursosExamen/txtNotes/excelent.txt");
        }
        
        JLabel icon = new JLabel();
        icon.setBounds(0, 150, 300, 50);
        icon.setHorizontalAlignment(JLabel.CENTER);
        icon.setIcon(iconoNota);
        add(icon);
        
        JTextArea mensaje = new JTextArea(msgFile);
        mensaje.setBounds(425, 50, 300, 175);
        mensaje.setEditable(false);
        mensaje.setFocusable(false);
        mensaje.setLineWrap(true);
        mensaje.setWrapStyleWord(true);
        add(mensaje);
        
        setVisible(true);
    }
    
}
