/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
public class ElectronicParcelID {
    private static int idCounter = 1;
    private final int parcelID;
    private ElectronicSender sender;
    private ElectronicReceiver receiver;
    private String status;

    public ElectronicParcelID(ElectronicSender sender, ElectronicReceiver receiver) {
        this.parcelID = idCounter++;
        this.sender = sender;
        this.receiver = receiver;
        this.status = "Received";
    }

    public int getParcelID() {
        return parcelID;
    }

    public ElectronicSender getSender() {
        return sender;
    }

    public ElectronicReceiver getReceiver() {
        return receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String categorizeParcel() {
        double volume = sender.getWidth() * sender.getHeight() * sender.getLength();
        double weight = sender.getWeight();
        if (volume < 0.1 && weight < 5) { // Adjusted threshold for small category
            return "Small";
        } else if (volume >= 0.1 && volume <= 1 && weight >= 5 && weight <= 20) { // Adjusted threshold for medium category
            return "Medium";
        } else {
            return "Large";
        }
    }
}

