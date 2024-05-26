package week2.teknik_icerik_1;

import java.util.Scanner;

public class RecursivePrime {

    // Recursive metot
    static boolean isPrime(int number, int divisor) {
        // Sayı 2'den küçükse asal değildir
        if (number < 2) {
            return false;
        }
        // Sayı ve kendisi dışında böleni yoksa asaldır
        if (divisor == 1) {
            return true;
        }
        // Sayı herhangi bir bölenine bölünüyorsa asal değildir
        if (number % divisor == 0) {
            return false;
        }
        // Bir sonraki bölen ile kontrol et
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        // Sayının kendisinin yarısından daha büyük bölenlere gerek yok
        if (isPrime(number, number / 2)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }
}
