package week1.teknik_icerik_3;

import java.util.Scanner;

import java.util.Scanner;

public class TersÜçgen { // Sınıf ismi Türkçe olarak daha açıklayıcı

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in); // Daha Türkçe bir isim kullanın

        System.out.print("Satır Sayısı Giriniz (Üçgenin Yüksekliği): "); // Açıklayıcı bir istem kullanın
        int satirSayisi = tarayici.nextInt(); // Daha açıklayıcı bir değişken ismi kullanın

        // Dış döngü, en üstten (satirSayisi) başlayarak ve azalarak her satırda gezinir
        for (int i = satirSayisi; i >= 1; i--) {
            // İç döngü, sütunlardan geçerek, geçerli satırdaki her sütun için yıldız basar
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Bir yıldız yazdırın
            }
            System.out.println(); // Bir satır için yıldızları yazdırdıktan sonra sonraki satıra geç
        }
    }
}
