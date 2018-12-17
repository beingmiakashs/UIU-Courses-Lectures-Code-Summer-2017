package com.sa.SectionNB.LectureThirteen;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 7/26/17.
 */
public class MainScreen extends JFrame {

    JTextField textField1;
    JTextField textField2;
    JLabel resultLable;

    public MainScreen() {
        setSize(400,400);
        setTitle("First Application");

        JPanel panel = new JPanel();
        textField1 = new JTextField(15);
        textField2 = new JTextField();
        textField2.setColumns(15);
        JButton button = new JButton("Compare");
        resultLable = new JLabel();

        panel.setLayout(new FlowLayout());
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);
        panel.add(resultLable);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = textField1.getText();
                String s2 = textField2.getText();

                if(s1.length() > s2.length()){
                    resultLable.setText(s1);
                }
                else{
                    resultLable.setText(s2);
                }
            }
        });

        setContentPane(panel);
    }

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setVisible(true);
    }
}













