package tugas_per4;
import java.io.*;

public class soal_dua {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama Pembeli: ");
        String nama = reader.readLine();
        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(reader.readLine());
        System.out.print("Diskon (%): ");
        double persenDiskon = Double.parseDouble(reader.readLine());
        System.out.print("Uang Bayar: ");
        double bayar = Double.parseDouble(reader.readLine());

        // Simulasi Menulis ke Stream Data (DataOutputStream)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(persenDiskon);
        dos.writeDouble(bayar);

        // Simulasi Membaca dari Stream Data (DataInputStream)
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        DataInputStream dis = new DataInputStream(bais);

        String resNama = dis.readUTF();
        double resTotalBelanja = dis.readDouble();
        double resDiskon = dis.readDouble();
        double resBayar = dis.readDouble();

        // Perhitungan
        double jumlahDiskon = resTotalBelanja * (resDiskon / 100);
        double totalSetelAhDiskon = resTotalBelanja - jumlahDiskon;
        double kembalian = resBayar - totalSetelAhDiskon;

        // Output
        System.out.println("\n--- NOTA PEMBELANJAAN ---");
        System.out.println("Nama       : " + resNama);
        System.out.println("Total      : Rp " + resTotalBelanja);
        System.out.println("Diskon     : " + resDiskon + "% (Rp " + jumlahDiskon + ")");
        System.out.println("Total Akhir: Rp " + totalSetelAhDiskon);
        System.out.println("Bayar      : Rp " + resBayar);
        System.out.println("Kembalian  : Rp " + kembalian);
    }
}
        
   
