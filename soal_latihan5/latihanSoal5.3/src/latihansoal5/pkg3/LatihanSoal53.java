/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihansoal5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class LatihanSoal53 {
    static void segitiga(int Sisi1, int Sisi2, int Sisi3){
        
        if(Sisi1 <= Sisi2 && Sisi2 <= Sisi3){
            if(Sisi1 * Sisi1 + Sisi2 * Sisi2 == Sisi3 * Sisi3){
                System.out.println("Segitiga Siku - Siku");
            } else if (Sisi1 * Sisi1 + Sisi2 * Sisi2 < Sisi3 * Sisi3){
                System.out.println("Segitiga Tumpul");
            } else {
                System.out.println("Segitiga Lancip");
            }
        } else {
            System.out.println("Coba cek lagi? Dah bener belum masukin nilai sisinya kaya gini (a <= b <= c");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai sisi 1 : ");
        int Sisi1 = input.nextInt();
        
        System.out.print("Masukkan nilai sisi 2 : ");
        int Sisi2 = input.nextInt();
        
        System.out.print("Masukkan nilai sisi 3 : ");
        int Sisi3 = input.nextInt();
        segitiga(Sisi1, Sisi2, Sisi3);
        
    }
    
}
