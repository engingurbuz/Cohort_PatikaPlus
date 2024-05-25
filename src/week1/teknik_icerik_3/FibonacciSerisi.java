package week1.teknik_icerik_3;

import java.util.Scanner;

import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in); // Kullanıcıdan sayı almak için tarayıcı

        System.out.print("Fibonacci dizisinin kaç elemanını görmek istiyorsunuz? "); // Kullanıcıya soru
        int elemanSayisi = tarayici.nextInt(); // Eleman sayısını al

        int a = 0; // İlk Fibonacci sayısı
        int b = 1; // İkinci Fibonacci sayısı

        for (int i = 0; i < elemanSayisi; i++) {
            if (i == 0 || i == 1) { // İlk iki eleman özel durum
                System.out.print(i + " "); // İlk iki elemanı doğrudan yazdır
            } else {
                int c = a + b; // Yeni bir eleman hesapla (önceki iki toplamı)
                System.out.print(c + " "); // Yeni elemanı yazdır
                a = b; // Bir sonraki hesaplama için bir önceki değeri a'ya ata
                b = c; // Bir sonraki hesaplama için yeni hesaplanan değeri b'ye ata
            }
        }
    }
}
