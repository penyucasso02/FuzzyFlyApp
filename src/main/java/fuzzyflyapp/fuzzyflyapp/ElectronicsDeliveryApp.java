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
import java.util.ArrayList;

public class ElectronicsDeliveryApp {
    public static void start(Scanner scanner) {
        // Example array of ElectronicDetail
        ElectronicDetail[] parcels = new ElectronicDetail[2];

        // Input parcel details
        for (int i = 0; i < parcels.length; i++) {
            System.out.println("Enter details for Parcel " + (i + 1));

            System.out.print("Parcel ID: ");
            String parcelID = scanner.nextLine();

            System.out.print("Sender Name: ");
            String senderName = scanner.nextLine();

            System.out.print("Sender Address: ");
            String senderAddress = scanner.nextLine();

            System.out.print("Sender Contact: ");
            String senderContact = scanner.nextLine();

            System.out.print("Receiver Name: ");
            String receiverName = scanner.nextLine();

            System.out.print("Receiver Address: ");
            String receiverAddress = scanner.nextLine();

            System.out.print("Receiver Contact: ");
            String receiverContact = scanner.nextLine();

            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Dimensions: ");
            String dimensions = scanner.nextLine();

            System.out.print("Content Description: ");
            String contentDescription = scanner.nextLine();

            System.out.print("Value: ");
            double value = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Delivery Type (Domestic/International): ");
            String deliveryType = scanner.nextLine();

            parcels[i] = new ElectronicDetail(parcelID, senderName, senderAddress, senderContact, receiverName, receiverAddress,
                                              receiverContact, weight, dimensions, contentDescription, value, deliveryType);
        }

        // Sort parcels
        ElectronicSort sorter = new ElectronicSort(parcels);
        ArrayList<ElectronicDetail> sortedParcels = sorter.sortParcels();

        // Assign delivery
        ElectronicAssign assigner = new ElectronicAssign(sortedParcels);
        assigner.assignDelivery();

        // Track parcels
        ElectronicTrack[] trackers = new ElectronicTrack[parcels.length];
        for (int i = 0; i < parcels.length; i++) {
            trackers[i] = new ElectronicTrack(parcels[i].parcelID);
            trackers[i].trackParcel();
            trackers[i].updateTrackingInfo("In Transit");
            trackers[i].trackParcel();
        }
    }
}