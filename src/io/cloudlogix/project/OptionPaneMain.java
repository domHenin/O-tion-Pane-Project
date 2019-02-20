package io.cloudlogix.project;

import javax.swing.*;

public class OptionPaneMain {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
        String name = JOptionPane.showInputDialog("What is your name?");

        String input = JOptionPane.showInputDialog("How Old are You?");
        int age=Integer.parseInt(input);

        System.out.println("Hello, "+name+".");
        System.out.println("Next Year, you'll be "+(age+1));
    }
}
