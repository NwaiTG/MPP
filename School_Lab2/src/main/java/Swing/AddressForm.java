package Swing;

import javax.swing.*;
import java.awt.*;

public class AddressForm extends JFrame {
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel textPanel;
    private JTextField nameText;
    private JTextField streetText;
    private JTextField cityText;
    private JLabel nameLabel;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JButton button;

    public AddressForm() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineTopPanel();
        defineMiddlePanel();
        defineTextPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(textPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
    }

    private void defineTopPanel() {
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    private void defineMiddlePanel() {
        middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    }


    private void defineTextPanel() {
        textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());

        // Panel for Name and Street
        JPanel nameStreetPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        nameLabel = new JLabel("Name:");
        nameText = new JTextField(10);
        nameStreetPanel.add(nameLabel);
        nameStreetPanel.add(nameText);

        streetLabel = new JLabel("Street:");
        streetText = new JTextField(10);
        nameStreetPanel.add(streetLabel);
        nameStreetPanel.add(streetText);

        // Panel for City
        JPanel cityPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        cityLabel = new JLabel("City:");
        cityText = new JTextField(10);
        cityPanel.add(cityLabel);
        cityPanel.add(cityText);

        // Panel for State and Zip
        JPanel stateZipPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel stateLabel = new JLabel("State:");
        JTextField stateText = new JTextField(10);
        stateZipPanel.add(stateLabel);
        stateZipPanel.add(stateText);

        JLabel zipLabel = new JLabel("Zip:");
        JTextField zipText = new JTextField(10);
        stateZipPanel.add(zipLabel);
        stateZipPanel.add(zipText);

        // Add components to the textPanel using FlowLayout
        textPanel.add(nameStreetPanel, BorderLayout.NORTH);
        textPanel.add(cityPanel, BorderLayout.CENTER);
        textPanel.add(stateZipPanel, BorderLayout.SOUTH);

        // Add Submit button
        button = new JButton("Submit");
        textPanel.add(button, BorderLayout.SOUTH);
    }





    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(320, 240);
        centerFrameOnDesktop(this);
    }

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AddressForm af = new AddressForm();
            af.setVisible(true);
        });
    }
}
