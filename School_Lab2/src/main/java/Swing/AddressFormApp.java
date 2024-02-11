package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressFormApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Address Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Increased height to accommodate the additional fields

        JPanel panel = new JPanel(new FlowLayout());

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField(10);

        JLabel streetLabel = new JLabel("Street");
        JTextField streetField = new JTextField(10);

        JLabel cityLabel = new JLabel("City");
        JTextField cityField = new JTextField(10);

        JLabel stateLabel = new JLabel("State");
        JTextField stateField = new JTextField(10);

        JLabel zipLabel = new JLabel("Zip");
        JTextField zipField = new JTextField(10);

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(streetLabel);
        panel.add(streetField);

        panel.add(cityLabel);
        panel.add(cityField);

        panel.add(stateLabel);
        panel.add(stateField);

        panel.add(zipLabel);
        panel.add(zipField);

        // Create a separate panel for the submit button
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        buttonPanel.add(submitButton);

        // Add both panels to the frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH); // Place button below

        // Set frame properties
        frame.setVisible(true);

        // Event handler for the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String state = stateField.getText();
                String zip = zipField.getText();

                // Display the data in the console
                System.out.println(name);
                System.out.println(street);
                System.out.println(city + ", " + state + " " + zip);
            }
        });
    }
}
