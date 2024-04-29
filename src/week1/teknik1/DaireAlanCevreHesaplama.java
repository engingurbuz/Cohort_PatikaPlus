package week1.teknik1;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        double yariCap = scanner.nextDouble();

        // Alan hesaplama
        double alan = Math.PI * yariCap * yariCap;

        // Çevre hesaplama
        double cevre = 2 * Math.PI * yariCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        // ## Ödev: Daire Dilimi Alan Hesaplama

        System.out.print("Daire diliminin açı ölçüsünü (derece cinsinden) giriniz: ");
        double aciOlcu = scanner.nextDouble();

        // Daire diliminin alanı hesaplama
        double dilimAlani = (Math.PI * yariCap * yariCap * aciOlcu) / 360;

        System.out.println("Daire diliminin Alanı: " + dilimAlani);
    }
}
