package week1.teknik_icerik_2;

import java.util.Scanner;

public class ArtıkYılHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        boolean artikMi = artikYilHesapla(yil);

        if (artikMi) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }

    private static boolean artikYilHesapla(int yil) {
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                return yil % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
