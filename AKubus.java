package com.tutorial;

import java.util.Scanner; 

public class AKubus {
    public static class Kubus {
        int Sisi;

        Scanner input = new Scanner(System.in);
        
        Kubus(){
            System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME KUBUS");            
            System.out.println("Sisi Kubus : ");
            Sisi = input.nextInt();
        }
        public void setSisi(int s) {
            this.Sisi = s;
        }

        public int getSisi() {
            return Sisi;
        }

        int luasKubus(){
            int luaskubus = 6 * (Sisi * Sisi);
            return luaskubus;
        }

        int volKubus(){
            int volkubus = Sisi * Sisi * Sisi;
            return volkubus;
        }
        @Override
        public String toString() {
            return "\nSisi kubus : " + Sisi;
        }
    
    }
}