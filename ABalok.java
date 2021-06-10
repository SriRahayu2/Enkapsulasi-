package com.tutorial;

import java.util.Scanner; 

public class ABalok {
    public static class Balok {
        int P,L,T;
        
        Scanner input = new Scanner(System.in);
        
        public Balok() {
            System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME BALOK");          
            System.out.println("Panjang Balok : ");
            P = input.nextInt();
            System.out.println("Lebar Balok : ");
            L = input.nextInt();
            System.out.println("Tinggi Balok : ");
            T = input.nextInt();
        }

        public void setP(int p) {
            this.P = p;
        }

        public int getP() {
            return P;
        }

        public void setL(int l) {
            this.L = l;
        }

        public int getL() {
            return L;
        }

        public void setT(int t) {
            this.T = t;
        }

        public int getT() {
            return T;
        }

        int luasBalok(){
            int luasbal = 2 * (P * L + P * T + L * T);
            return luasbal;
        }

        int volBalok(){
            int volbal = P * L * T;
            return volbal;
        }

        @Override
        public String toString() {
            return "\nPanjang balok : " + P + "\nLebar balok : " + L + "\nTinggi balok : " + T;
        }
    }
}