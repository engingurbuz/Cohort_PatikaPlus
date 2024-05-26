package week2.teknik_icerik_1;

import java.util.Scanner;

public class RecursivePower {

    // Recursive metot
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
