package tugas_per4;
import java.util.Scanner;

public class gajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // Input Data Karyawan
        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        // Input Nominal Gaji dan Tunjangan
        System.out.print("Gaji Pokok (P1): ");
        double p1 = input.nextDouble();
        System.out.print("Tunjangan Jabatan (P2): ");
        double p2 = input.nextDouble();
        System.out.print("Tunjangan Istri (P3): ");
        double p3 = input.nextDouble();
        System.out.print("Tunjangan Anak (P4): ");
        double p4 = input.nextDouble();

        // Perhitungan
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        // Output Hasil
        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.println("NPM            : " + npm);
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Total Gaji     : Rp " + totalGaji);
        System.out.println("Pajak (10%)    : Rp " + pajak);
        System.out.println("Gaji Bersih    : Rp " + gajiBersih);
    }
}
    



