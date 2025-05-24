// package com.billing;

import javax.swing.*;
import java.awt.*;

public class BillingPanel extends JPanel {
    public JTextField txtCustomerId, txtPrevReading, txtCurrReading;
    public JButton btnCalculate;
    public JTextArea txtOutput;

    public BillingPanel() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        txtCustomerId = new JTextField();
        txtPrevReading = new JTextField();
        txtCurrReading = new JTextField();
        btnCalculate = new JButton("Generate Bill");

        inputPanel.add(new JLabel("Customer ID:"));
        inputPanel.add(txtCustomerId);
        inputPanel.add(new JLabel("Previous Reading:"));
        inputPanel.add(txtPrevReading);
        inputPanel.add(new JLabel("Current Reading:"));
        inputPanel.add(txtCurrReading);
        inputPanel.add(new JLabel(""));
        inputPanel.add(btnCalculate);

        txtOutput = new JTextArea(5, 30);
        txtOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtOutput);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
		
		btnCalculate.addActionListener(e -> {
    try {
        String customerId = txtCustomerId.getText().trim();
        int prev = Integer.parseInt(txtPrevReading.getText().trim());
        int curr = Integer.parseInt(txtCurrReading.getText().trim());

        if (customerId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Customer ID");
            return;
        }

        if (curr < prev) {
            JOptionPane.showMessageDialog(this, "Current reading must be >= previous reading");
            return;
        }

        int units = curr - prev;
        double rate;
        if (units <= 100) rate = 3;
        else if (units <= 300) rate = 5;
        else rate = 8;

        double total = units * rate + 50; // fixed charge

        // Save bill
        FileHandler.saveBill(customerId, prev, curr, total);

        txtOutput.setText("Units consumed: " + units + "\n" +
                          "Rate per unit: ₹" + rate + "\n" +
                          "Fixed charge: ₹50\n" +
                          "Total Bill: ₹" + total);

        // Clear inputs if needed
        txtCustomerId.setText("");
        txtPrevReading.setText("");
        txtCurrReading.setText("");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric readings");
    }
});

    }
}
