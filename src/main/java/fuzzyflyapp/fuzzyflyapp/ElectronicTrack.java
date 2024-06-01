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
    private List<ElectronicDetail> parcels;

    public ElectronicTrack(List<ElectronicDetail> parcels) {
        this.parcels = parcels;
    }

    public void trackParcels() {
        for (ElectronicDetail parcel : parcels) {
            System.out.println("Parcel ID: " + parcel.getParcelID());
            System.out.println("Parcel Status: " + parcel.getStatus());
        }
    }

    @Override
    public void execute() {
        trackParcels();
    }
}

