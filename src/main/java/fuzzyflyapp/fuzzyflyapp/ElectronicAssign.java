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

public class ElectronicAssign implements ElectronicParcel {
    private List<ElectronicDetail> parcels;

    public ElectronicAssign(List<ElectronicDetail> parcels) {
        this.parcels = parcels;
    }

    public void assignDelivery() {
        for (ElectronicDetail parcel : parcels) {
            if (parcel.getDeliveryType().equalsIgnoreCase("international")) {
                System.out.println("Assigning to shipping for international delivery.");
                parcel.setStatus("Delivering (International)");
            } else {
                String category = parcel.categorizeParcel();
                switch (category) {
                    case "Small":
                        System.out.println("Assigning to runner for domestic delivery.");
                        parcel.setStatus("Delivering (Runner)");
                        break;
                    case "Medium":
                        System.out.println("Assigning to lorry for domestic delivery.");
                        parcel.setStatus("Delivering (Lorry)");
                        break;
                    case "Large":
                        System.out.println("Assigning to cargo for domestic delivery.");
                        parcel.setStatus("Delivering (Cargo)");
                        break;
                    default:
                        System.out.println("Invalid parcel category.");
                        parcel.setStatus("Error");
                        break;
                }
            }
        }
    }

    @Override
    public void execute() {
        assignDelivery();
    }
}


