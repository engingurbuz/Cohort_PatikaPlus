package week1.teknik_icerik_1;

import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyve fiyatları sabit olarak tanımlanır
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Kullanıcıdan her ürün için kilogram değeri alınır
        System.out.print("Armut Kaç Kilo ? :");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKilo = scanner.nextDouble();

        // Her ürün için tutar hesaplanır
        double armutTutari = armutKilo * armutFiyati;
        double elmaTutari = elmaKilo * elmaFiyati;
        double domatesTutari = domatesKilo * domatesFiyati;
        double muzTutari = muzKilo * muzFiyati;
        double patlicanTutari = patlicanKilo * patlicanFiyati;

        // Toplam tutar hesaplanır
        double toplamTutar = armutTutari + elmaTutari + domatesTutari + muzTutari + patlicanTutari;

        // Toplam tutar ekrana yazdırılır
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
