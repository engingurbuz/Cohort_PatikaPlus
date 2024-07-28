package week5.teknik_icerik_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Most_Frequent_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin girin:");
        String text = scanner.nextLine();

        // Metni kelimelere ayırma
        String[] words = text.split("\\s+");

        // Kelimeleri saymak için HashMap oluşturma
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Kelimeleri sayma
        for (String word : words) {
            word = word.toLowerCase(); // Büyük-küçük harf duyarlılığını kaldırmak için
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // En çok geçen kelimeyi bulma
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Sonucu yazdırma
        if (mostFrequentWord != null) {
            System.out.println("En çok geçen kelime: " + mostFrequentWord + " (Sıklık: " + maxCount + ")");
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }

        scanner.close();
    }
}
