/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Jeremy
 */
public abstract class Kendaraan {
    protected int kecepatan; 
    protected String bahanBakar; 
 
    public Kendaraan(int kecepatan, String bahanBakar) {
        this.kecepatan = kecepatan;
        this.bahanBakar = bahanBakar;
    }
 
    public abstract void mulai();
 
    public abstract void berhenti();
 
    public void tampilkanInfo() {
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
}