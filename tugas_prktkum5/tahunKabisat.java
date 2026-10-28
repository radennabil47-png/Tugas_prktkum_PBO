
package tugas_prktkum5;

import java.util.Scanner;

public class tahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " BUKAN Tahun Kabisat.");
        }
    }
}

