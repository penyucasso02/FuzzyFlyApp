/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
abstract class Courier {
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

class Jnt extends Courier {
    public Jnt() {
        super("Jnt", 2.0);
    }
}

class NinjaVan extends Courier {
    public NinjaVan() {
        super("NinjaVan", 3.0);
    }
}

class Poslaju extends Courier {
    public Poslaju() {
        super("Poslaju", 1.5);
    }
}

