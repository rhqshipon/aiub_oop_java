// package com.billing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ViewBillsPanel extends JPanel {
    public JTextField txtCustomerId;
    public JButton btnView;
    public JTextArea txtResults;

    public ViewBillsPanel() {
        setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        txtCustomerId = new JTextField();
        btnView = new JButton("View Bills");

        searchPanel.add(new JLabel("Customer ID:"));
        searchPanel.add(txtCustomerId);
        searchPanel.add(btnView);

        txtResults = new JTextArea();
        txtResults.setEditable(false);
        txtResults.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtResults);

        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnView.addActionListener(e -> {
            String customerId = txtCustomerId.getText().trim();
            if (customerId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Customer ID");
                return;
            }
            displayBills(customerId);
        });
    }

    private void displayBills(String customerId) {
    File billFile = new File("bills.txt");
    if (!billFile.exists()) {
        txtResults.setText("No bills found (bills.txt missing).");
        return;
    }

    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-12s %-15s %-15s %-12s%n", "Cust ID", "Prev Reading", "Curr Reading", "Total"));

    boolean found = false;

    try (BufferedReader br = new BufferedReader(new FileReader(billFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String fileCustId = parts[0].trim();
                if (fileCustId.equalsIgnoreCase(customerId.trim())) {
                    found = true;
                    sb.append(String.format("%-12s %-15s %-15s ₹%-10s%n",
                            fileCustId, parts[1].trim(), parts[2].trim(), parts[3].trim()));
                }
            } else {
                System.out.println("Skipping invalid line: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        txtResults.setText("Error reading bills file.");
        return;
    }

    if (!found) {
        txtResults.setText("No bills found for Customer ID: " + customerId);
    } else {
        txtResults.setText(sb.toString());
    }
}

}
