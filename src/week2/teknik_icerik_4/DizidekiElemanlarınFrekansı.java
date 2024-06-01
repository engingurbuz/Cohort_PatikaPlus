package week2.teknik_icerik_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DizidekiElemanlarınFrekansı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        // Diziyi oluştur
        int[] array = new int[n];

        // Dizinin elemanlarını kullanıcıdan al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Elemanların frekanslarını bulmak için bir map oluştur
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Frekansları ekrana yazdır
        System.out.println("Tekrar Sayıları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }

        scanner.close();
    }
}
