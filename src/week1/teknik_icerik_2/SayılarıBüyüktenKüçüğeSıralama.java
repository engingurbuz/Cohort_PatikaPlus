package week1.teknik_icerik_2;

import java.util.Scanner;

public class SayılarıBüyüktenKüçüğeSıralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enKucuk, ortanca, enBuyuk;

        if (sayi1 < sayi2) {
            if (sayi1 < sayi3) {
                enKucuk = sayi1;
                ortanca = sayi2;
                enBuyuk = sayi3;
            } else if (sayi2 < sayi3) {
                enKucuk = sayi1;
                ortanca = sayi3;
                enBuyuk = sayi2;
            } else {
                enKucuk = sayi1;
                ortanca = sayi2;
                enBuyuk = sayi1;
            }
        } else if (sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                enKucuk = sayi1;
                ortanca = sayi2;
                enBuyuk = sayi3;
            } else {
                enKucuk = sayi2;
                ortanca = sayi1;
                enBuyuk = sayi3;
            }
        } else {
            enKucuk = sayi2;
            ortanca = sayi1;
            enBuyuk = sayi3;
        }

        System.out.println("Sıralama: " + enKucuk + ", " + ortanca + ", " + enBuyuk);
    }
}
