/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
public abstract class ElectronicDetail {
    private static int idCounter = 1;
    private final int parcelID;
    private double weight; // in kilograms
    private double width;  // in meters
    private double height; // in meters
    private double length; // in meters
    private String deliveryType; // "domestic" or "international"
    private String status;

    public ElectronicDetail(double weight, double width, double height, double length, String deliveryType) {
        this.parcelID = idCounter++;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
        this.deliveryType = deliveryType;
        this.status = "Received"; // Initial status
    }

    public int getParcelID() {
        return parcelID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String categorizeParcel() {
        double volume = this.width * this.height * this.length;
        if (volume < 1 && this.weight < 5) {
            return "Small";
        } else if (volume >= 1 && volume <= 5 && this.weight >= 5 && this.weight <= 20) {
            return "Medium";
        } else {
            return "Large";
        }
    }

    public abstract void inputDetails(); // Abstract method to be implemented by subclasses
}

