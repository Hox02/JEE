package org.example;

public class Voyage {

    public static void main(String[] args) {

        Voiture v = new Voiture();
        //v.bouger();
        v.setMoteur(new Moteur());
        v.rouler();
        System.out.println("Bon voyage!");
    }
}
