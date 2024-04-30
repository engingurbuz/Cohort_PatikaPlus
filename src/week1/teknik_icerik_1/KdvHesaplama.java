package week1.teknik_icerik_1;

import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz (TL): ");
        double tutar = scanner.nextDouble();

        double kdvOrani;
        if (tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
    }
}