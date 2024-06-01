/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
class ElectronicDetail extends ElectronicParcel {
    public ElectronicDetail(String parcelID, String senderName, String senderAddress, String senderContact,
                            String receiverName, String receiverAddress, String receiverContact, double weight,
                            String dimensions, String contentDescription, double value, String deliveryType) {
        this.parcelID = parcelID;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderContact = senderContact;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverContact = receiverContact;
        this.weight = weight;
        this.dimensions = dimensions;
        this.contentDescription = contentDescription;
        this.value = value;
        this.deliveryType = deliveryType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Parcel ID: " + parcelID);
        System.out.println("Sender: " + senderName + ", Address: " + senderAddress + ", Contact: " + senderContact);
        System.out.println("Receiver: " + receiverName + ", Address: " + receiverAddress + ", Contact: " + receiverContact);
        System.out.println("Weight: " + weight + ", Dimensions: " + dimensions + ", Content: " + contentDescription + ", Value: " + value);
        System.out.println("Delivery Type: " + deliveryType);
    }
}
