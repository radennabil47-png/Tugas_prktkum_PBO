
package tugas_prktkum5;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char isMember = input.next().charAt(0);

        System.out.print("Masukkan total belanjaan: Rp");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (isMember == 'y' || isMember == 'Y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalHarusDibayar = totalBelanja - diskon;
        System.out.println("Diskon              : Rp" + diskon);
        System.out.println("Total Harus Dibayar : Rp" + totalHarusDibayar);

        System.out.print("Masukkan Uang Diberikan: Rp");
        double uangBayar = input.nextDouble();

        double kembalian = uangBayar - totalHarusDibayar;
        System.out.println("Kembalian           : Rp" + kembalian);
    }
}
