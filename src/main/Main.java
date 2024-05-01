/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Jeremy
 */

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(130, "Bensin Pertamax");
        mobil.mulai();
        mobil.tampilkanInfo();
        mobil.berhenti();
 
        Motor motor = new Motor(60, "Bensin Pertalite");
        motor.mulai();
        motor.tampilkanInfo();
        motor.berhenti();
   
        Bus bus = new Bus(80, "Diesel Solar");
        bus.mulai();
        bus.tampilkanInfo();
        bus.berhenti();
    }
}