package Swing_Lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu myMenu = new JMenu("myMenu");

        // Create menu items
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");

        // Add menu items to the menu
        myMenu.add(item1);
        myMenu.add(item2);
        myMenu.add(item3);

        // Add an action listener to each menu item
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item 1 clicked!");
            }
        });

        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item 2 clicked!");
            }
        });

        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item 3 clicked!");
            }
        });

        // Add the menu to the menu bar
        menuBar.add(myMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Set frame properties
        frame.setVisible(true);
    }
}
