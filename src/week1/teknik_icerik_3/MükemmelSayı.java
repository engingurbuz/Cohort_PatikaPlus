package week1.teknik_icerik_3;

import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Mükemmel sayı olup olmadığını kontrol et
        if (isMukemmelSayi(sayi)) {
            System.out.println(sayi + " Mükemmel sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir");
        }

        scanner.close();
    }

    // Mükemmel sayı kontrol fonksiyonu
    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        // Sayının kendisi hariç pozitif tam sayı çarpanlarını bul ve toplamlarını hesapla
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Toplam sayıya eşitse mükemmel sayıdır
        return toplam == sayi;
    }
}
