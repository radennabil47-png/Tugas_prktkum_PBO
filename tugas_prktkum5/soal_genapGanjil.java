package tugas_prktkum5;

import java.util.Scanner;

public class soal_genapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan sebuah bilangan: ");
        int angka = input.nextInt();
        
        //pemecahan modulus
        if(angka % 2 == 0){
            System.out.println(angka + " adalah bilangan genap.");      
        }else{
            System.out.println(angka + "adalah bilangan ganjil.");
        }
    }
}
