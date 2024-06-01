/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
import java.util.Scanner;

public class ElectronicsDeliveryApp {
    public static void start(Scanner scanner) {
        ElectronicSort sorter = new ElectronicSort();

        OUTER:
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Parcel");
            System.out.println("2. Admin Panel");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    // Ask for parcel details first
                    System.out.print("Enter parcel weight (kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Enter parcel width (m): ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter parcel height (m): ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter parcel length (m): ");
                    double length = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter delivery type (domestic/international): ");
                    String deliveryType = scanner.nextLine();
                    // Create sender details
                    ElectronicSender sender = new ElectronicSender(weight, width, height, length, deliveryType);
                    sender.inputDetails();
                    // Create receiver details
                    ElectronicReceiver receiver = new ElectronicReceiver(weight, width, height, length, deliveryType);
                    receiver.inputDetails();
                    // Add parcels to sorter
                    sorter.addParcel(sender);
                    sorter.addParcel(receiver);
                    // Sort parcels
                    sorter.execute();
                }
                case 2 -> {
                    // Assign delivery
                    ElectronicAssign assigner = new ElectronicAssign(sorter.getParcels());
                    assigner.execute();
                    // Track parcels
                    ElectronicTrack tracker = new ElectronicTrack(sorter.getParcels());
                    tracker.execute();
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    break OUTER;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
