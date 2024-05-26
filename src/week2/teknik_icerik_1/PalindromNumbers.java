package week2.teknik_icerik_1;

import java.util.Scanner;

public class PalindromNumbers {
    // Sayının palindrom olup olmadığını kontrol eden metot
    static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Sayıyı tersine çevirme işlemi
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Orijinal sayı ile ters çevrilmiş sayının karşılaştırılması
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
}
