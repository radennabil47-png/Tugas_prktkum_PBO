/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

    import java.util.Scanner;

public class Class4 {


public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        
        int total = 0;
        int ganjil = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
}
