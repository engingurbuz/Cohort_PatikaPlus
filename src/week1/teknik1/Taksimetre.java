package week1.teknik1;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gidilen mesafeyi al
        System.out.print("Gidilen mesafe (KM): ");
        double mesafe = scanner.nextDouble();

        // Hesaplamaları yap
        double yolUcreti = mesafe * 2.20;
        double toplamUcret = yolUcreti + 10; // Açılış ücreti ekle

        // Minimum ücreti kontrol et
        if (toplamUcret < 20) {
            toplamUcret = 20;
        }

        // Ücreti ekrana yazdır
        System.out.println("Toplam Ücret: " + toplamUcret + " TL");
    }
}
