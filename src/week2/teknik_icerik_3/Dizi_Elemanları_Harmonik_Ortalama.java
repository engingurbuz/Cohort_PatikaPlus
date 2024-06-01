package week2.teknik_icerik_3;

import java.util.Scanner;

public class Dizi_Elemanları_Harmonik_Ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi uzunluğunu al
        System.out.print("Dizinin eleman sayısını girin: ");
        int n = scanner.nextInt();

        // Diziyi oluştur
        double[] array = new double[n];

        // Diziyi harmonik seri formülüne göre doldur
        for (int i = 0; i < n; i++) {
            array[i] = 1.0 / (i + 1);
        }

        // Dizinin elemanlarını ekrana yazdır
        System.out.println("Dizinin elemanları:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Harmonik seriyi hesapla
        double harmonicSum = 0.0;
        for (int i = 0; i < n; i++) {
            harmonicSum += array[i];
        }

        // Harmonik ortalamayı hesapla
        double harmonicMean = n / harmonicSum;

        // Sonucu ekrana yazdır
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }
}
