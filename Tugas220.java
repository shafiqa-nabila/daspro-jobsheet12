import java.util.Scanner;

public class Tugas220 {
    public static int jumlahRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int f = scanner.nextInt();

        int hasil = jumlahRekursif(f);
        System.out.println("Hasil penjumlahan dari 1 hingga " + f + " adalah: " + hasil);
        
        scanner.close();
    }
}