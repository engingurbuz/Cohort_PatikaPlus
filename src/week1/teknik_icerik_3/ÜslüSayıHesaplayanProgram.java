package week1.teknik_icerik_3;

import java.util.Scanner;

public class ÜslüSayıHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs giriniz: ");
        int us = scanner.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üssü " + us + " : " + sonuc);
    }
}
