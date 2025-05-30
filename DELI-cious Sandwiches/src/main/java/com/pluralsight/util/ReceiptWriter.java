package com.pluralsight.util;

import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class ReceiptWriter {

    public static void saveReceipt(Order order) {
        String folderPath = "src/main/resources/receipts";
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String timestamp = generateTimestamp();
        String fileName = folderPath + "/" + timestamp + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(order.getOrderSummary());
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }

    public static void displayAllReceipts() {
        File folder = new File("src/main/resources/receipts");
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No receipts found.");
            return;
        }

        // Sort by newest first
        Arrays.sort(files, (f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()));

        System.out.println("\n=== Past Receipts (Newest First) ===");
        for (File file : files) {
            System.out.println("\nReceipt: " + file.getName());
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Error reading receipt: " + e.getMessage());
            }
        }
    }

    private static String generateTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return LocalDateTime.now().format(formatter);
    }
}
