/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuzzyflyapp.fuzzyflyapp;

/**
 *
 * @author Swift 3
 */
class CourierFactory {
    public static Courier[] getCouriers() {
        return new Courier[] {
            new Jnt(),
            new NinjaVan(),
            new Poslaju()
        };
    }
}
