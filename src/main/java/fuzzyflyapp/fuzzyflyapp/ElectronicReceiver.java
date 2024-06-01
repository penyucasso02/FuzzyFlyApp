/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ElectronicReceiver extends ElectronicDetail {
    private String name;
    private String address;
    private String contact;

    public ElectronicReceiver(double weight, double width, double height, double length, String deliveryType) {
        super(weight, width, height, length, deliveryType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter receiver name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter receiver address: ");
        this.address = scanner.nextLine();

        if (getDeliveryType().equalsIgnoreCase("international")) {
            System.out.print("Enter receiver email: ");
            this.contact = scanner.nextLine();
        } else if (getDeliveryType().equalsIgnoreCase("domestic")) {
            System.out.print("Enter receiver contact number: ");
            this.contact = scanner.nextLine();
        } else {
            System.out.println("Invalid delivery type.");
        }
    }
}
