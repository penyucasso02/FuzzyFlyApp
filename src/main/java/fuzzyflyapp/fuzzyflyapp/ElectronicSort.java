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

class ElectronicSort {
    private ElectronicDetail[] parcels;

    public ElectronicSort(ElectronicDetail[] parcels) {
        this.parcels = parcels;
    }

    public ArrayList<ElectronicDetail> sortParcels() {
        ArrayList<ElectronicDetail> domestic = new ArrayList<>();
        ArrayList<ElectronicDetail> international = new ArrayList<>();

        for (ElectronicDetail parcel : parcels) {
            if ("Domestic".equalsIgnoreCase(parcel.deliveryType)) {
                domestic.add(parcel);
            } else if ("International".equalsIgnoreCase(parcel.deliveryType)) {
                international.add(parcel);
            }
        }

        domestic.addAll(international); // Combined list with Domestic parcels first
        return domestic;
    }
}