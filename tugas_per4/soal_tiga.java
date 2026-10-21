package tugas_per4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class soal_tiga {
    public static void main(String[] args) throws IOException {
        // 1. Menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan Angka: ");
        int angkaScanner = sc.nextInt(); // Langsung dibaca sebagai int
        System.out.println("Hasil Scanner: " + angkaScanner);

        // 2. Menggunakan BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan Angka: ");
        String inputStr = br.readLine(); // Dibaca sebagai String dulu
        int angkaBR = Integer.parseInt(inputStr); // Konversi ke int
        System.out.println("Hasil BufferedReader: " + angkaBR);
    }
}

