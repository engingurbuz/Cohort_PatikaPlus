package week1;
import java.util.Scanner;
public class TipDönüşümleri {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan tam sayı girişi al
            System.out.print("Bir tam sayı giriniz: ");
            int tamSayi = scanner.nextInt();

            // Kullanıcıdan ondalıklı sayı girişi al
            System.out.print("Bir ondalıklı sayı giriniz: ");
            double ondalikliSayi = scanner.nextDouble();

            // Tam sayıyı ondalıklı sayıya dönüştür
            double tamSayiOndalikli = (double) tamSayi;

            // Ondalıklı sayıyı tam sayıya dönüştür
            int ondalikliSayiTam = (int) ondalikliSayi;

            // Sonuçları ekrana yazdır
            System.out.println("Tam sayının ondalıklı hale dönüşümü: " + tamSayiOndalikli);
            System.out.println("Ondalıklı sayının tam sayıya dönüşümü: " + ondalikliSayiTam);

            scanner.close();
        }
    }
