/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

import java.util.Scanner;

public class Class1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, terbesar = 0, terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            angka = input.nextInt();

            // Inisialisasi nilai awal pada input pertama
            if (i == 1) {
                terbesar = angka;
                terkecil = angka;
            } else {
                if (angka > terbesar) {
                    terbesar = angka;
                }
                if (angka < terkecil) {
                    terkecil = angka;
                }
            }
        }

        System.out.println("\nBilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}

