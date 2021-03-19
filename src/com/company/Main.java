package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu ("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e)-> System.exit(0));

        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        frame.setJMenuBar(menuBar);




        String [] nums = {"first", "second", "third"};
        JComboBox<String> comboBox = new JComboBox<>(nums);
        comboBox.setBounds(40,40,90,20);
        frame.add(comboBox);



        comboBox.addActionListener((ActionEvent e ) -> {Object selection = comboBox.getSelectedItem(); System.out.println(selection);});





    }
}
