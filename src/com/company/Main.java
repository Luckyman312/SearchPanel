package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.gray);

        JLabel label = new JLabel("SEARCH");
        panel.add(label);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        JButton button = new JButton("GO");
        panel.add(button);

        window.add(panel);
        window.setSize(400,400);
        window.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q="+textField.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }
}
