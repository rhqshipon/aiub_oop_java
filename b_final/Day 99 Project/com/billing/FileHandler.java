// package com.billing;

import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String CUSTOMER_FILE = "customers.txt";
    private static final String BILL_FILE = "bills.txt";

    // Save customer in format: id,name,meterNo
    public static void saveCustomer(String id, String name, String meterNo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CUSTOMER_FILE, true))) {
            bw.write(id + "," + name + "," + meterNo);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read customer by ID, return as array of strings or null if not found
    public static String[] getCustomer(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[0].equals(id)) {
                    return parts; // [id, name, meterNo]
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Save bill in format: customerId,prevReading,currReading,totalAmount
    public static void saveBill(String customerId, int prevReading, int currReading, double totalAmount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(BILL_FILE, true))) {
            bw.write(customerId + "," + prevReading + "," + currReading + "," + totalAmount);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
