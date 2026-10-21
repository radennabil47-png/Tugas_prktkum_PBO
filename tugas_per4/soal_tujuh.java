/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_per4;

import java.util.Scanner;

public class soal_tujuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Novel yang Akan Dicetak: ");
        int jumlahNovel = input.nextInt();
        System.out.print("Masukkan Tebal Lembar Per Novel: ");
        int tebalPerNovel = input.nextInt();

        // Total lembar = Total detik (karena 1 lembar = 1 detik)
        long totalDetik = (long) jumlahNovel * tebalPerNovel;

        // Konversi detik ke hari, jam, menit, dan detik
        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n--- WAKTU PROSES PERCETAKAN ---");
        System.out.println("Total Lembar : " + totalDetik + " lembar");
        System.out.println("Waktu Cetak  : " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");
    }
}
