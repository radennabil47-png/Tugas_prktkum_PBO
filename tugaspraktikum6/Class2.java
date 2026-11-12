/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

    import java.util.Scanner;

public class Class2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan : ");
        int jumlahData = input.nextInt();
        
        double total = 0;
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            double nilai = input.nextDouble();
            total += nilai;
        }
        
        double rataRata = total / jumlahData;
        
        System.out.println("\nTotal jumlah bilangan : " + total);
        System.out.println("Rata-rata             : " + rataRata);
    }
}

