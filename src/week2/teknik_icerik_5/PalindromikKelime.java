package week2.teknik_icerik_5;

import java.util.Scanner;

public class PalindromikKelime {
    // İlk yöntem: İki uçtan başlayarak karşılaştırma yapar
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // İkinci yöntem: Kelimenin tersini oluşturur ve karşılaştırır
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Girilen kelime palindromiktir.");
        } else {
            System.out.println("Girilen kelime palindromik değildir.");
        }

        // Alternatif yöntem ile kontrol
        if (isPalindrome2(input)) {
            System.out.println("Girilen kelime (alternatif yöntem) palindromiktir.");
        } else {
            System.out.println("Girilen kelime (alternatif yöntem) palindromik değildir.");
        }

        scanner.close();
    }
}
