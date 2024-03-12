/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihansoal5.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class LatihanSoal51 {
    static void  bill(int n){
        int i = 0;
        if(n>=1){
            for(i=1; i<=n; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Maaf Bilangan Tersebut Tidak Sesuai");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        bill(n);
        
    }
    
}
