package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentSemesterAverage extends JFrame
        implements ActionListener {

    private JTextField nameField;
    private JTextField grade1Field;
    private JTextField grade2Field;
    private JTextField grade3Field;
    private JLabel resultLabel;
    private JButton calculateButton;

    public StudentSemesterAverage() {
        setTitle("Student Semester Average");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(6, 2));

        add(new JLabel("Student name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Grade 1:"));
        grade1Field = new JTextField();
        add(grade1Field);

        add(new JLabel("Grade 2:"));
        grade2Field = new JTextField();
        add(grade2Field);

        add(new JLabel("Grade 3:"));
        grade3Field = new JTextField();
        add(grade3Field);

        calculateButton = new JButton("Calculate Average");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel("Enter the name and grades.");
        add(resultLabel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String name = nameField.getText();

        double grade1 = Double.parseDouble(grade1Field.getText());
        double grade2 = Double.parseDouble(grade2Field.getText());
        double grade3 = Double.parseDouble(grade3Field.getText());

        double average = (grade1 + grade2 + grade3) / 3;

        resultLabel.setText(name + "'s average: " + average);
    }

    public static void main(String[] args) {
        new StudentSemesterAverage();
    }
}