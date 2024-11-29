import java.util.Scanner;
public class Tugas120 {

    public static void tampilkanBilanganRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        tampilkanBilanganRekursif(n - 1);
    }

    public static void tampilkanBilanganIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka n: ");
        int n = scanner.nextInt();
        
        System.out.print("Pilih metode (1: Rekursif, 2: Iteratif): ");
        int pilihan = scanner.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Menampilkan bilangan dari " + n + " sampai 0 (rekursif):");
            tampilkanBilanganRekursif(n);
        } else if (pilihan == 2) {
            System.out.println("Menampilkan bilangan dari " + n + " sampai 0 (iteratif):");
            tampilkanBilanganIteratif(n);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}