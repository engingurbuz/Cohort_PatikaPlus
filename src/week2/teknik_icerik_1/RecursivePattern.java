package week2.teknik_icerik_1;

import java.util.Scanner;

public class RecursivePattern {

    static void printPattern(int number, int original, boolean isIncreasing) {
        // Son değeri ekrana yazdır
        System.out.print(number + " ");

        // Negatif veya 0 olduğu yerden geri dönme aşamasına geçiyoruz
        if (number <= 0) {
            isIncreasing = true;
        }

        // Eğer sayıyı artırma modundayız
        if (isIncreasing) {
            // Orijinal değere geri dönene kadar devam et
            if (number < original) {
                printPattern(number + 5, original, true);
            }
        } else {
            // Sayıyı azaltma modundayız
            printPattern(number - 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        // Deseni başlat
        printPattern(number, number, false);
    }
}
