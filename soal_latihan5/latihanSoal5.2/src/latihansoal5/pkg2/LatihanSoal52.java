/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihansoal5.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class LatihanSoal52 {
    static void kubus(int Sisi1, int Sisi2, int Sisi3){
        if(Sisi1==Sisi2 && Sisi1==Sisi3){
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus Ya, G Usa Maksa");
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
        kubus(Sisi1, Sisi2, Sisi3);
    }
    
}
