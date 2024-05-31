/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
public abstract class Courier {
    private String name;
    private double fixedRate;

    public Courier(String name, double fixedRate) {
        this.name = name;
        this.fixedRate = fixedRate;
    }

    public String getName() {
        return name;
    }

    public double getFixedRate() {
        return fixedRate;
    }
}

