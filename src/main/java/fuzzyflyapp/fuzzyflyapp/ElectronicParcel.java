/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
public abstract class ElectronicParcel {
    protected String parcelID;
    protected String senderName;
    protected String senderAddress;
    protected String senderContact;
    protected String receiverName;
    protected String receiverAddress;
    protected String receiverContact;
    protected double weight;
    protected String dimensions;
    protected String contentDescription;
    protected double value;
    protected String deliveryType;

    public abstract void displayDetails();
}


