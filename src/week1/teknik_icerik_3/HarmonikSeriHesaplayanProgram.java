package week1.teknik_icerik_3;

import java.util.Scanner;

public class HarmonikSeriHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harmonik serinin kaçıncı terimini hesaplamak istiyorsunuz? ");
        int n = scanner.nextInt();

        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik serinin " + n + ". terimi: " + toplam);
    }
}