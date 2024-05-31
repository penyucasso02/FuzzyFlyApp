/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
public class Display {
    public static void showDeliveryDetails(Customer customer, Receiver receiver, Parcel parcel, Courier courier, double totalCost) {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone Number: " + customer.getPhoneNumber());

        System.out.println("\nReceiver Details:");
        System.out.println("Name: " + receiver.getName());
        System.out.println("Phone Number: " + receiver.getPhoneNumber());
        System.out.println("Address Category: " + receiver.getAddressCategory());

        System.out.println("\nParcel Details:");
        System.out.println("Weight: " + parcel.getWeight() + " kg");

        System.out.println("\nCourier Details:");
        System.out.println("Selected Courier: " + courier.getName());

        System.out.println("\nThe total cost, including shipping, is: RM " + totalCost);
    }
}
