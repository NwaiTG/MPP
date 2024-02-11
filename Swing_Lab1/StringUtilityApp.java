package Swing_Lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtilityApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Utility");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton countButton = new JButton("Count Letters");
        countButton.setBounds(10, 20, 150, 25);
        panel.add(countButton);

        JButton reverseButton = new JButton("Reverse Letters");
        reverseButton.setBounds(10, 50, 150, 25);
        panel.add(reverseButton);

        JButton removeDuplicatesButton = new JButton("Remove Duplicates");
        removeDuplicatesButton.setBounds(10, 80, 150, 25);
        panel.add(removeDuplicatesButton);

        JTextField inputText = new JTextField(20);
        inputText.setBounds(200, 40, 165, 25);
        panel.add(inputText);

        JTextField outputText = new JTextField(20);
        outputText.setBounds(200, 70, 165, 25);
        panel.add(outputText);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                int length = input.length();
                outputText.setText(String.valueOf(length));
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                StringBuilder reversedInput = new StringBuilder(input).reverse();
                outputText.setText(reversedInput.toString());
            }
        });

        removeDuplicatesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                String result = "";
                for (int i = 0; i < input.length(); i++) {
                    if (result.indexOf(input.charAt(i)) == -1) {
                        result += input.charAt(i);
                    }
                }
                outputText.setText(result);
            }
        });
    }
}

