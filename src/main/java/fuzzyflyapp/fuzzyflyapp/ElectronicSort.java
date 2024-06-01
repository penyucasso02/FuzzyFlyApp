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
import java.util.List;

public class ElectronicSort implements ElectronicParcel {
    private List<ElectronicDetail> parcels;

    public ElectronicSort() {
        parcels = new ArrayList<>();
    }

    public void addParcel(ElectronicDetail parcel) {
        parcel.setStatus("Sorting");
        parcels.add(parcel);
    }

    public void sortParcels() {
        parcels.sort((p1, p2) -> p1.categorizeParcel().compareTo(p2.categorizeParcel()));
    }

    public List<ElectronicDetail> getParcels() {
        return parcels;
    }

    @Override
    public void execute() {
        sortParcels();
    }
}
