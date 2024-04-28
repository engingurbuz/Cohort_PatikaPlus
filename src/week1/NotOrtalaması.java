package week1;
import java.util.Scanner;
public class NotOrtalaması {

        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Matematik notunuzu giriniz:");
                int Mat = scanner.nextInt();

                System.out.println("Fizik notunuzu giriniz:");
                int Fizik = scanner.nextInt();

                System.out.println("Kimya notunuzu giriniz:");
                int Kimya = scanner.nextInt();

                System.out.println("Türkçe notunuzu giriniz:");
                int Türkce = scanner.nextInt();

                System.out.println("Tarih notunuzu giriniz:");
                int Tarih = scanner.nextInt();

                System.out.println("Müzik notunuzu giriniz:");
                int Müzik = scanner.nextInt();

                int Toplam = (Mat + Fizik + Kimya + Türkce + Tarih + Müzik);
                double Ortalama = Toplam / 6 ;

                System.out.println("6 dersin Ortalaması " + Ortalama);

                boolean Gecti = Ortalama >= 60 ;

                String Sonuc = Gecti ? "Sınıfı Geçtiniz..." : "Sınıfta Kaldınız...";

                System.out.println(Sonuc);
            }

        }
    }
