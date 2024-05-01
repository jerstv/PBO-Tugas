/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Jeremy
 */
public class Bus extends Kendaraan {
    public Bus(int kecepatan, String bahanBakar) {
        super(kecepatan, bahanBakar);
    }
 
    @Override
    public void mulai() {
        System.out.println("Bus dihidupkan");
    }
 
    @Override
    public void berhenti() {
        System.out.println("Bus dihentikan");
    }
}