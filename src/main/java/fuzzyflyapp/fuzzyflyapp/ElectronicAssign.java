/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class ElectronicAssign {
    private ArrayList<ElectronicDetail> sortedParcels;

    public ElectronicAssign(ArrayList<ElectronicDetail> sortedParcels) {
        this.sortedParcels = sortedParcels;
    }

    public void assignDelivery() {
        for (ElectronicDetail parcel : sortedParcels) {
            if ("Domestic".equalsIgnoreCase(parcel.deliveryType)) {
                System.out.println("Parcel ID: " + parcel.parcelID + " assigned to Lorry.");
            } else if ("International".equalsIgnoreCase(parcel.deliveryType)) {
                System.out.println("Parcel ID: " + parcel.parcelID + " assigned to Ship.");
            }
        }
    }
}

