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

public class DeliveryApp {
    public static void run(Scanner scanner, String subsystemName) {
        System.out.println("\nWelcome to the " + subsystemName);

        // Arrays to store multiple deliveries
        Customer[] customers = new Customer[3];
        Receiver[] receivers = new Receiver[3];
        Parcel[] parcels = new Parcel[3];
        Courier[] couriers = new Courier[3];

        // Loop to handle multiple deliveries
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDelivery " + (i + 1) + ":");
            
           
            
            // Input Handling - Customer Information
            customers[i] = new Customer();
            System.out.print("Enter your Name: ");
            customers[i].setName(scanner.nextLine());
            System.out.print("Enter your phone number: ");
            customers[i].setPhoneNumber(scanner.nextLine());

            // Input Handling - Receiver Information
            receivers[i] = new Receiver();
            System.out.print("Enter receiver's name: ");
            receivers[i].setName(scanner.nextLine());
            System.out.print("Enter receiver's phone number: ");
            receivers[i].setPhoneNumber(scanner.nextLine());

            // Input Handling - Address Category Selection
            System.out.println("Select the receiver's address category:");
            System.out.println("1: Peninsular");
            System.out.println("2: East Malaysia");
            System.out.println("3: Overseas");
            System.out.print("Enter your choice: ");
            int addressCategoryChoice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline character
            String addressCategory = categorizeAddress(addressCategoryChoice);
            receivers[i].setAddressCategory(addressCategory);

            // Input Handling - Parcel Information
            parcels[i] = new Parcel();
            System.out.print("Enter the item weight (in kg): ");
            parcels[i].setWeight(scanner.nextDouble());
            scanner.nextLine(); // consume the leftover newline character

            // Input Handling - Courier Selection
            Courier[] availableCouriers = CourierFactory.getCouriers();
            System.out.println("Select your courier:");
            for (int j = 0; j < availableCouriers.length; j++) {
                System.out.println((j + 1) + ": " + availableCouriers[j].getName());
            }
            System.out.print("Enter your choice: ");
            int courierSelection = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline character
            couriers[i] = availableCouriers[courierSelection - 1];

            // Backend Logic
            double baseCost = calculateBaseCost(receivers[i].getAddressCategory());
            double weightCost = calculateWeightCost(parcels[i].getWeight());
            double courierRate = couriers[i].getFixedRate();

            // Cost Calculation
            double totalCost = baseCost + weightCost + courierRate;

            // Display Total Cost
            Display.showDeliveryDetails(customers[i], receivers[i], parcels[i], couriers[i], totalCost);
        }
    }

    // ii. Applying Control & Repetition statement
    // Categorize the address based on user input
    private static String categorizeAddress(int choice) {
        switch (choice) {
            case 1:
                return "Peninsular";
            case 2:
                return "East Malaysia";
            case 3:
                return "Overseas";
            default:
                throw new IllegalArgumentException("Invalid address category choice");
        }
    }

    // iii. Encapsulation
    // Calculate the base cost based on the address category
    private static double calculateBaseCost(String addressCategory) {
        switch (addressCategory) {
            case "Peninsular":
                return 5.0;
            case "East Malaysia":
                return 10.0;
            case "Overseas":
                return 25.0;
            default:
                throw new IllegalArgumentException("Invalid address category");
        }
    }

    // iii. Encapsulation
    // Calculate the additional cost based on weight
    private static double calculateWeightCost(double weight) {
        if (weight < 5) {
            return 3.0;
        } else if (weight <= 10) {
            return 5.0;
        } else {
            return 10.0;
        }
    }
}
