/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author lenovo
 */
public class Class7 {

    public static void main(String[] args) {
        System.out.println("=== Menggunakan i++ (Post-increment) ===");
        int i = 0;
        // Nilai i dicek dulu (< 5), baru ditambah 1 setelahnya
        while (i++ < 5) {
            System.out.print(i + " "); // Output: 1 2 3 4 5
        }

        System.out.println("\n\n=== Menggunakan ++i (Pre-increment) ===");
        int j = 0;
        // Nilai j ditambah 1 dulu, baru dicek (< 5)
        while (++j < 5) {
            System.out.print(j + " "); // Output: 1 2 3 4
        }
        System.out.println();
    }
}

