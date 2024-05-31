/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
import java.util.Scanner;

public class FuzzyFlyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the FuzzyFly Shipping and Delivery System");
        System.out.println("Please select the subsystem you want to access:");
        System.out.println("1: Shipping and delivery of clothes");
        System.out.println("2: Shipping and delivery of electric and electronic devices");
        System.out.println("3: Shipping and delivery of furniture");
        System.out.println("4: Shipping and delivery of medical supplies");
        System.out.print("Enter your choice: ");
        int subsystemChoice = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline character

        switch (subsystemChoice) {
            case 1:
                ClothesDeliveryApp.start(scanner);
                break;
            case 2:
                ElectronicsDeliveryApp.start(scanner);
                break;
            case 3:
                FurnitureDeliveryApp.start(scanner);
                break;
            case 4:
                MedicalSuppliesDeliveryApp.start(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
        }
    }
}