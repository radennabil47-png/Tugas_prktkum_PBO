public class Main {
    public static void main(String[] args) {
//    no 1
//        int x =5;
//        System.out.println("Nilai Awal x: " + x);
//        
//        System.out.println("Nilai x++: " + (x++));
//        System.out.println("Nilai x setelah post-increment: " + x);
//        
//        System.out.println("Nilai ++x: " +(++x));
//         
        
//    no 2
//    int panjang = 50;
//    int lebar = 45;
//    int luas = panjang * lebar;
//    
//        System.out.println("panjang: " + panjang);
//        System.out.println("lebar: " + lebar);
//        System.out.println("luas perdegi panjang: " + luas);

//     no 3
//      double a = 3;
//      double b = 8;
//      double c = 15;
//      
//      double diskriminan = (b * b) - (4 * a * c);
//      
//        System.out.println("Nilai a: " + a + " b: " + b +", c:" + c);
//        System.out.println("Hasil b^3 - 4ac = " + diskriminan);

//     no 4
//         double x = 22;
//         double y = 33;
//         
//         System.out.println("penjumlahan (x + y) : " + (x + y));
//         System.out.println("pengurangan (x - y) : " + (x - y));
//         System.out.println("perkalian (x * y) : " + (x * y)); 
//         System.out.println("pembagian (x / y) : " +(x / y));
//     no 5
//           double a = 6;
//           double b = 8;
//           
//           double luas = 0.5 * a * b;
//           
//           System.out.println("Nilai a = " + a);
//           System.out.println("Nilai b = " + b);
//           System.out.println("Luas segitiga: " + luas);
//      no 6
//            double a = 6;
//            double b = 8;
//            
//            double c = Math.sqrt((a * a) + (b * b));
//            double keliling = a + b + c;
//            
//            System.out.println("sisi a: " + a);
//            System.out.println("sisi b: " + b);
//            System.out.println("Nilai c (sisi miring): " + c);
//            System.out.println("keliling segitiga: " + keliling);
            
//       no 7
//             String a = "saya belajar java";
//             String b = " saya belajar java";
//             
//             System.out.println("a (lowercase ) : " + a.toLowerCase());
//             System.out.println("a (Uppercase ) : " + b.toUpperCase());
//      
//        no 8
//              double kecepatanCahaya = 300000; // km/s
//        
//              double jarakBulan = 384400; // km
//              double jarakMatahari = 152.1 * 1000000; // 152.1 juta km
//        
//              double waktuBulan = jarakBulan / kecepatanCahaya; // detik
//              double waktuMatahari = jarakMatahari / kecepatanCahaya; // detik
//        
//              System.out.println("Waktu tempuh ke Bulan   : " + waktuBulan + " detik");
//              System.out.println("Waktu tempuh ke Matahari: " + waktuMatahari + " detik (" + (waktuMatahari / 60) + " menit)"); 

//       n0 9  
         double A = 10;
         double B = 15;
         double C = 5;
        
        System.out.println("=== a. Celcius ke Fahrenheit & Sebaliknya ===");
        double cToF = (A * 9/5) + 32;
        double fToC = (B - 32) * 5/9;
        System.out.println(A + " °A = " + cToF + " °B");
        System.out.println(B + " °B = " + fToC + " °A");
        
        System.out.println("\n=== b. Celcius ke Reamur & Sebaliknya ===");
        double cToR = A * 4/5;
        double rToC = A * 5/4;
        System.out.println(A + " °A = " + cToR + " °C");
        System.out.println(C + " °C = " + rToC + " °A");
        
        System.out.println("\n=== c. Fahrenheit ke Reamur & Sebaliknya ===");
        double fToR = (B - 32) * 4/9;
        double rToF = (C * 9/4) + 32;
        System.out.println(B + " °B = " + fToR + " °C");
        System.out.println(C + " °C = " + rToF + " °B");
            
        }
    }
    

