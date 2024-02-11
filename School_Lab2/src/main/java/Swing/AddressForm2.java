package Swing;

import javax.swing.*;
import java.awt.*;

public class AddressForm2 extends JFrame {
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

    public AddressForm2() {
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
        button = new JButton("Submit");
        middlePanel.add(button);
        button.addActionListener(evt -> {
            // Handle button action here
        });
    }

    private void defineTextPanel() {
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(0, 2, 5, 5)); // GridLayout with 2 columns

        nameLabel = new JLabel("Name:");
        nameText = new JTextField(10);
        textPanel.add(nameLabel);
        textPanel.add(nameText);

        streetLabel = new JLabel("Street:");
        streetText = new JTextField(10);
        textPanel.add(streetLabel);
        textPanel.add(streetText);

        cityLabel = new JLabel("City:");
        cityText = new JTextField(10);
        textPanel.add(cityLabel);
        textPanel.add(cityText);

        JLabel stateLabel = new JLabel("State:");
        JTextField stateText = new JTextField(10);
        textPanel.add(stateLabel);
        textPanel.add(stateText);

        JLabel zipLabel = new JLabel("Zip:");
        JTextField zipText = new JTextField(10);
        textPanel.add(zipLabel);
        textPanel.add(zipText);

        button = new JButton("Submit");
        textPanel.add(button);
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
            AddressForm2 af = new AddressForm2();
            af.setVisible(true);
        });
    }
}
