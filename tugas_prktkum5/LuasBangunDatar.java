/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktkum5;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU HITUNG LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                System.out.println("Luas Persegi = " + (s * s));
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Segitiga = " + (0.5 * a * t));
                break;
            case 3:
                System.out.print("Masukkan jari-jari (r): ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran = " + (Math.PI * r * r));
                break;
            case 4:
                System.out.print("Masukkan sisi atas (a): ");
                double sa = input.nextDouble();
                System.out.print("Masukkan sisi bawah (b): ");
                double sb = input.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double tt = input.nextDouble();
                System.out.println("Luas Trapesium = " + (0.5 * (sa + sb) * tt));
                break;
            case 5:
                System.out.print("Masukkan diagonal 1 (d1): ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 (d2): ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang = " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Pilihan menu tidak valid!");
                break;
        }
    }
}

