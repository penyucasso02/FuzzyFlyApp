/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
import java.util.List;

public class ElectronicTrack implements ElectronicParcel {
    private List<ElectronicParcelID> parcels;

    public ElectronicTrack(List<ElectronicParcelID> parcels) {
        this.parcels = parcels;
    }

    public void trackParcels() {
        for (ElectronicParcelID parcel : parcels) {
            System.out.println("---------------------------------------");
            System.out.println("Parcel ID: " + parcel.getParcelID());
            System.out.println("Category: " + parcel.categorizeParcel());
            System.out.println("Status: " + parcel.getStatus());
            System.out.println("Weight: " + parcel.getSender().getWeight() + " kg");
            System.out.println("Dimensions: " + parcel.getSender().getWidth() + " m (W) x " + parcel.getSender().getHeight() + " m (H) x " + parcel.getSender().getLength() + " m (L)");
            System.out.println("Delivery Type: " + parcel.getSender().getDeliveryType());

            System.out.println("Sender Details:");
            System.out.println("  Name: " + parcel.getSender().getName());
            System.out.println("  Address: " + parcel.getSender().getAddress());
            System.out.println("  Contact: " + parcel.getSender().getContact());

            System.out.println("Receiver Details:");
            System.out.println("  Name: " + parcel.getReceiver().getName());
            System.out.println("  Address: " + parcel.getReceiver().getAddress());
            System.out.println("  Contact: " + parcel.getReceiver().getContact());

            System.out.println("---------------------------------------");
        }
    }

    @Override
    public void execute() {
        trackParcels();
    }
}

