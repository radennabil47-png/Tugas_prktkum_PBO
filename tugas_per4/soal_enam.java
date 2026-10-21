package tugas_per4;

import java.util.Scanner;

public class soal_enam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.println("--- Waktu Pertama ---");
        System.out.print("Jam   : "); float jam1 = input.nextInt();
        System.out.print("Menit : "); float menit1 = input.nextInt();
        System.out.print("Detik : "); float detik1 = input.nextInt();

        // Waktu Kedua
        System.out.println("--- Waktu Kedua ---");
        System.out.print("Jam   : "); float jam2 = input.nextInt();
        System.out.print("Menit : "); float menit2 = input.nextInt();
        System.out.print("Detik : "); float detik2 = input.nextInt();

        // Konversi semua ke detik
        float totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        float totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        // Hitung selisih dalam detik
        float selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        // Konversi kembali selisih ke jam, menit, detik
        float jam = selisihDetik / 3600;
        float sisaDetik = selisihDetik % 3600;
        float menit = sisaDetik / 60;
        float detik = sisaDetik % 60;

        System.out.println("\n--- SELISIH WAKTU ---");
        System.out.println(jam + " Jam, " + menit + " Menit, " + detik + " Detik");
    }
}

