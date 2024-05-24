package week1.teknik_icerik_3;

import java.util.Scanner;

public class YıldızlarİleElmasYazanProgram {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Elmasın satır sayısını giriniz: ");
            int n = scanner.nextInt();

            // Üst yarısı
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" "); // Boşluk yazdır
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("*"); // Yıldız yazdır
                }
                System.out.println(); // Bir satır atla
            }

            // Alt yarısı
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" "); // Boşluk yazdır
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("*"); // Yıldız yazdır
                }
                System.out.println(); // Bir satır atla
            }
        }
    }
