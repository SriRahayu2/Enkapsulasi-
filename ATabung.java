package com.tutorial;

import java.util.Scanner; 

public class ATabung {    
    public static class Tabung {
        int Jari,Tinggi;
        final double Phi = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        public Tabung() {
            System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME TABUNG");
            System.out.println("jari-jari alas : ");
            Jari = input.nextInt();
            System.out.println("Tinggi Tabung : ");
            Tinggi = input.nextInt();
        }

        public void setJari(int r) {
            this.Jari = r;
        }

        public int getJari() {
            return Jari;
        }

        public void setTinggi(int t) {
            this.Tinggi = t;
        }

        public int getTinggi() {
            return Tinggi;
        }

        double luasTabung(){
            double luastabung = (double)2 * (Phi * Jari * Jari) + (2 * Phi * Jari * Tinggi);
            return luastabung;
        }

        double volTabung(){
            double voltabung = (double)(Phi * Jari * Jari) * Tinggi;
            return voltabung;
        }

        @Override
        public String toString() {
            return "\nJari-jari tabung : " + Jari + "\nTinggi tabung : " + Tinggi;
        }
    }
}