package week2.teknik_icerik_4;

import java.util.HashSet;
import java.util.Set;

public class TekrarEdenÇiftSayılar {
    public static void main(String[] args) {
        int[] array = {2, 4, 2, 6, 4, 8, 6, 10, 12, 8, 14, 12};

        Set<Integer> allNumbers = new HashSet<>();
        Set<Integer> repeatingEvens = new HashSet<>();

        for (int num : array) {
            if (num % 2 == 0) { // Çift sayıları kontrol et
                if (!allNumbers.add(num)) { // Eğer sayı zaten varsa, tekrar edenler setine ekle
                    repeatingEvens.add(num);
                }
            }
        }

        // Tekrar eden çift sayıları yazdır
        System.out.println("Tekrar eden çift sayılar: " + repeatingEvens);
    }
}
