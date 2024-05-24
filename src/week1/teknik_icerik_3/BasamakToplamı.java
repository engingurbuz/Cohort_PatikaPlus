package week1.teknik_icerik_3;

import java.util.Scanner;

public class BasamakToplamı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamak toplamı: " + toplam);
    }
}
