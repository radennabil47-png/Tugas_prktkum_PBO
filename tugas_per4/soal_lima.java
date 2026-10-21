package tugas_per4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class soal_lima {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah mangga awal: ");
        int manggaAwal = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan jumlah mangga busuk: ");
        int manggaBusuk = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan jumlah tetangga yang diberi jambu: ");
        int tetangga = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan jumlah jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(reader.readLine());

        // Perhitungan
        int totalMangga = manggaAwal - manggaBusuk;
        int totalJambu = tetangga * jambuPerTetangga;
        int totalBuah = totalMangga + totalJambu;

        System.out.println("\n--- TOTAL BUAH IBU SISCA ---");
        System.out.println("Mangga bersih : " + totalMangga + " pcs");
        System.out.println("Jambu total   : " + totalJambu + " pcs");
        System.out.println("Total Seluruh : " + totalBuah + " pcs");
    }
}

