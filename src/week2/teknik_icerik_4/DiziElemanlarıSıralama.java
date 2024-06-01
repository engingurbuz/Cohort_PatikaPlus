package week2.teknik_icerik_4;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlarıSıralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        // Diziyi oluştur
        int[] array = new int[n];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralayın
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralanmış dizi:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
