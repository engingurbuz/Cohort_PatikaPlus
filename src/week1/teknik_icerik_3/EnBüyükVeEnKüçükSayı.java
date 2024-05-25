package week1.teknik_icerik_3;

import java.util.Scanner;

public class EnBüyükVeEnKüçükSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kaç tane sayı girileceğini al
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // İlk sayıyı al ve en büyük ve en küçük olarak ata
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        // Geri kalan sayıları al ve en büyük ve en küçüğü belirle
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // En büyük ve en küçük sayıları ekrana yazdır
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }
}