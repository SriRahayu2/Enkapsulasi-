package com.tutorial;

import com.tutorial.ATabung.Tabung;
import com.tutorial.ABalok.Balok;
import com.tutorial.AKubus.Kubus;

import java.util.Scanner; 

public class Amain {
    public static void main(String[] args) {
        char yorn = 'n';

        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BANGUN RUANG");
            System.out.println("Choose :  ");
            System.out.println("1. Tabung ? ");
            System.out.println("2. Kubus ? ");
            System.out.println("3. Balok ? ");
            System.out.println("4. DONE");
            int c = input.nextShort();
        
            // Luas Permukaan & Volume Tabung
            if (c == 1) {
                ATabung.Tabung atab = new ATabung.Tabung();
                System.out.println(atab.toString());
                System.out.println("Luas Permukaan Tabung : " + atab.luasTabung());
                System.out.println("Volume Tabung : " + atab.volTabung());
            }
            
            // Luas Permukaan & Volume Kubus 
            else if (c == 2) {
                AKubus.Kubus akub = new AKubus.Kubus();
                System.out.println(akub.toString());
                System.out.println("Luas Permukaan Kubus : " + akub.luasKubus()); 
                System.out.println("Volume Kubus : " + akub.volKubus());
            }
            
            // Luas Permukaan & Volume Balok 
            else if (c == 3) {
                ABalok.Balok bal = new ABalok.Balok();
                System.out.println(bal.toString());
                System.out.println("Luas Permukaan Balok : " + bal.luasBalok()); 
                System.out.println("Volume Balok : " + bal.volBalok());
            }

            // DONE
            else if (c == 4) {
                System.out.println("DONE");
                System.exit(0);
            }
            
            else {
                System.out.println("Choose [1 - 4] ? ");
            }

            //Looping
            System.out.println("Repeat ? [y / n] ? ");
            input.nextLine();
            String yn = input.nextLine();
            yorn = yn.charAt(0);
        }while(yorn == 'y' || yorn == 'Y');

        input.close(); 
        }
}