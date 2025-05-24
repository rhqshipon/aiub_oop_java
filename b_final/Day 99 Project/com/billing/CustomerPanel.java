// package com.billing;

import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JPanel {
    public JTextField txtName, txtId, txtMeter;
    public JButton btnSave;

    public CustomerPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        txtName = new JTextField();
        txtId = new JTextField();
        txtMeter = new JTextField();
        btnSave = new JButton("Save Customer");

        add(new JLabel("Customer Name:"));
        add(txtName);
        add(new JLabel("Customer ID:"));
        add(txtId);
        add(new JLabel("Meter Number:"));
        add(txtMeter);
        add(new JLabel(""));
        add(btnSave);
		
		btnSave.addActionListener(e -> {
    String id = txtId.getText().trim();
    String name = txtName.getText().trim();
    String meter = txtMeter.getText().trim();

    if (id.isEmpty() || name.isEmpty() || meter.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    FileHandler.saveCustomer(id, name, meter);
    JOptionPane.showMessageDialog(this, "Customer saved!");
    
    // Clear fields
    txtId.setText("");
    txtName.setText("");
    txtMeter.setText("");
});
    }
}
