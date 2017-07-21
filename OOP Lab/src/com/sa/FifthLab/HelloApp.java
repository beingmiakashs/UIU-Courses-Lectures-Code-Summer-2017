package com.sa.FifthLab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 7/2/17.
 */
public class HelloApp extends JFrame {

    JTextField textField;
    JButton button;
    JTextArea textArea;

    public HelloApp(){

        textField = new JTextField();
        button = new JButton();
        textArea = new JTextArea("Result: ");


        button.setText("Click");
        textField.setColumns(20);

        setSize(300,300);
        setLayout(new FlowLayout());

        add(textField);
        add(button);
        add(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                text = text.toUpperCase();
                textArea.append(text);

            }
        });


    }

    public static void main(String[] args) {
        HelloApp app = new HelloApp();
        app.setVisible(true);
    }
}









