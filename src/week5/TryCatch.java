package week5;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // Diziyi manuel olarak tanımlıyoruz
        int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Kullanıcıdan indeks değerini alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen indeks değerini girin: ");
        int indeks = scanner.nextInt();

        // Metodu çağırarak sonucu alıyoruz
        String sonuc = getElementAtIndex(dizi, indeks);
        System.out.println(sonuc);

        scanner.close();
    }

    public static String getElementAtIndex(int[] dizi, int indeks) {
        try {
            // Belirtilen indeksteki elemanı döndürüyoruz
            return "İndeksteki eleman: " + dizi[indeks];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata durumunda hata mesajı döndürüyoruz
            return "Hata: Geçersiz indeks değeri!";
        }
    }
}

