// package com.billing;

import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {
    CardLayout cardLayout;
    JPanel cardPanel;

    public MainApp() {
        super("Electricity Billing System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Panels
        CustomerPanel customerPanel = new CustomerPanel();
        BillingPanel billingPanel = new BillingPanel();
        ViewBillsPanel viewBillsPanel = new ViewBillsPanel();

        cardPanel.add(customerPanel, "Customer");
        cardPanel.add(billingPanel, "Billing");
        cardPanel.add(viewBillsPanel, "ViewBills");

        // Navigation
        JPanel navPanel = new JPanel();
        JButton btnCustomer = new JButton("Customer Panel");
        JButton btnBilling = new JButton("Billing Panel");
        JButton btnView = new JButton("View Bills Panel");

        btnCustomer.addActionListener(e -> cardLayout.show(cardPanel, "Customer"));
        btnBilling.addActionListener(e -> cardLayout.show(cardPanel, "Billing"));
        btnView.addActionListener(e -> cardLayout.show(cardPanel, "ViewBills"));

        navPanel.add(btnCustomer);
        navPanel.add(btnBilling);
        navPanel.add(btnView);

        add(navPanel, BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}