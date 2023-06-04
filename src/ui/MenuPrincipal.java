package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPanel jpanel;

    public JPanel getJpanel() {
        return jpanel;
    }

    public MenuPrincipal() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre;
                nombre = textField1.getText();
                System.out.println("Hola " + nombre);
            }
        });
    }
}
