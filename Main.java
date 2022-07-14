package com.itfactory;

import com.itfactory.componente.MemorieRam;
import com.itfactory.componente.MemorieSSD;
import com.itfactory.electronice.Laptop;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop ("Asus", "Negru", 15.6);
        MemorieRam memorieRam = new MemorieRam("DDR3","GB", 16);
        MemorieSSD memorieSSD = new MemorieSSD(256, "GB");

        System.out.println("Detalii laptop:");
        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("Culoare: " + laptop.getCuloare());
        System.out.println("Dimensiune Ecran: " + laptop.getDimensiuneEcran());
        System.out.println(" ");
        System.out.println("Memorie RAM:");
        System.out.println("Tip memorie RAM: " + memorieRam.getTipMemorie());
        System.out.println("Unitate de Masura Memorie RAM: " + memorieRam.getUnitateMasura());
        System.out.println("Capacitate memorie RAM: " + memorieRam.getCapacitateMemorie());
        System.out.println(" ");
        System.out.println("Spatiu de stocare SSD:");
        System.out.println("Capacitate stocare SSD: " + memorieSSD.getCapacitateStocare());
        System.out.println("Unitate de masura stocare SSD: " + memorieSSD.getUnitateMasura());

  }
}
