/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author lenovo
 */
public class Class5 {

    public static void main(String[] args) {
        // 1. Half Triangle (Piramida 5 baris)
        System.out.println("=== Half Triangle ===");
        int tinggiHalf = 5;
        for (int i = 1; i <= tinggiHalf; i++) {
            // Cetak spasi
            for (int s = tinggiHalf - i; s > 0; s--) {
                System.out.print(" ");
            }
            // Cetak bintang ganjil (1, 3, 5, 7, 9)
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Full Triangle / Belah Ketupat (5 baris)
        System.out.println("\n=== Full Triangle ===");
        int n = 3; // Titik tengah (baris ke-3 memiliki 5 bintang)
        // Bagian atas (baris 1 sampai 3)
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bagian bawah (baris 4 dan 5)
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

