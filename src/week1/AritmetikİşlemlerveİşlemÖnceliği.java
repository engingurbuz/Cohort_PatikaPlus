package week1;

import java.util.Scanner;

public class AritmetikİşlemlerveİşlemÖnceliği {

    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayı al
        System.out.print("a sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b = scanner.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c = scanner.nextInt();

        // İşlemleri hesapla
        int sonuc = a + (b * c) - b;

        // Sonucu ekrana yazdır
        System.out.println("Sonuç: " + sonuc);
    }
}

