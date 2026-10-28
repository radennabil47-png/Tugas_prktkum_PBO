
package tugas_prktkum5;

import java.util.Scanner;

public class komisiSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();

        double uangJasa = 0;
        double persenKomisi = 0;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persenKomisi = 0.10;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            persenKomisi = 0.15;
        } else {
            uangJasa = 300000;
            persenKomisi = 0.20;
        }

        double komisi = penjualan * persenKomisi;
        double totalPendapatan = uangJasa + komisi;

        System.out.println("Uang Jasa   : Rp" + uangJasa);
        System.out.println("Komisi      : Rp" + komisi);
        System.out.println("Total Hasil : Rp" + totalPendapatan);
    }
}

