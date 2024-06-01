package week2.teknik_icerik_4;

import java.util.Scanner;

public class EnKüçükVeEnBüyükEnYakınSayı {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // En yakın küçük ve büyük sayılar için başlangıç değerlerini belirle
        Integer closestSmaller = null;
        Integer closestLarger = null;

        // Dizideki elemanları kontrol et
        for (int i : array) {
            if (i < number) {
                if (closestSmaller == null || number - i < number - closestSmaller) {
                    closestSmaller = i;
                }
            } else if (i > number) {
                if (closestLarger == null || i - number < closestLarger - number) {
                    closestLarger = i;
                }
            }
        }

        // Sonuçları ekrana yazdır
        if (closestSmaller != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (closestLarger != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }
    }
}

