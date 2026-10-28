
package tugas_prktkum5;

import java.util.Scanner;

public class gajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4");
        int gol = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jmlAnak = input.nextInt();

        double gajiPokok = 0;
        double tunjPasangan = 0;

        switch (gol) {
            case 1: // Menikah
                gajiPokok = 1200000;
                tunjPasangan = 0.10 * gajiPokok;
                break;
            case 2: // Belum menikah
                gajiPokok = 1500000;
                break;
            case 3: // Cerai
                gajiPokok = 1750000;
                break;
            case 4: // Menikah dan punya anak
                gajiPokok = 2000000;
                tunjPasangan = 0.10 * gajiPokok;
                break;
            default:
                System.out.println("Kode Golongan tidak valid!");
                return;
        }

        double tunjAnak = 0.05 * gajiPokok * jmlAnak;
        double totalTunjangan = tunjPasangan + tunjAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n--- REKAP GAJI ---");
        System.out.println("Nama         : " + nama + " (NIK: " + nik + ")");
        System.out.println("Gaji Pokok   : Rp" + gajiPokok);
        System.out.println("Total Tunj.  : Rp" + totalTunjangan);
        System.out.println("Gaji Bersih  : Rp" + gajiBersih);
    }
}
    

