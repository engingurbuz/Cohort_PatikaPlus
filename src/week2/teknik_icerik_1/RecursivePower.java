package week2.teknik_icerik_1;

import java.util.Scanner;

public class RecursivePower {

    // Recursive metot: üs alma işlemini gerçekleştirir
    static int power(int base, int exponent) {
        // Eğer üs 0 ise, sonuç 1'dir (herhangi bir sayının 0. kuvveti 1'dir)
        if (exponent == 0) {
            return 1;
        } else {
            // Üs 0 değilse, base * power(base, exponent - 1) işlemi yapılır
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner sınıfı kullanılır
        System.out.print("Taban değeri giriniz: "); // Kullanıcıdan taban değeri istenir
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: "); // Kullanıcıdan üs değeri istenir
        int exponent = scan.nextInt();

        // Recursive power metodunu çağırarak sonucu hesaplar
        int result = power(base, exponent);
        // Hesaplanan sonucu ekrana yazdırır
        System.out.println("Sonuç: " + result);
    }
}
