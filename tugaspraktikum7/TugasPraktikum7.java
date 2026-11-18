package tugaspraktikum7;

 
public class TugasPraktikum7 {
    public static void main(String[] args) {
     // Variasi 1: Deklarasi dan alokasi ukuran memori terlebih dahulu
        int[] angka1 = new int[3];
        angka1[0] = 10;
        angka1[1] = 20;
        angka1[2] = 30;

        // Variasi 2: Deklarasi sekaligus inisialisasi nilai (Array Literal)
        int[] angka2 = {10, 20, 30};

        // Variasi 3: Penempatan tanda kurung siku [] setelah nama variabel (gaya C/C++)
        int angka3[] = new int[]{10, 20, 30};

        System.out.println("Variasi 1 indeks 0: " + angka1[0]);
        System.out.println("Variasi 2 indeks 1: " + angka2[1]);
        System.out.println("Variasi 3 indeks 2: " + angka3[2]);
    }
}
