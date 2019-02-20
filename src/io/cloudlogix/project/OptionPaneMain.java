package io.cloudlogix.project;

import javax.swing.*;

public class OptionPaneMain {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
        String name = JOptionPane.showInputDialog("What is your name?");

        String input = JOptionPane.showInputDialog("How Old are You?");
        int age=Integer.parseInt(input);

        JLabel jLabel = new JLabel();
        JLabel jLabel1 = new JLabel();
        JFrame jFrame = new JFrame();

        jLabel.setText("Hello, "+name+".");
        jLabel1.setText("Next Year, you'll be "+(age+1));


        jLabel.getText();
        jLabel1.getText();

        jFrame.add(jLabel);
        jFrame.add(jLabel1);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
//
//        System.out.println("Hello, "+name+".");
//        System.out.println("Next Year, you'll be "+(age+1));
//
//        JFrame jFrame = new JFrame();
//
//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jFrame.setSize(300, 300);
//        jFrame.setVisible(true);
//
//        jFrame.
    }
}
