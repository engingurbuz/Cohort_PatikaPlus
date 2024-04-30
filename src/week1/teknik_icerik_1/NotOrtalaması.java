package week1.teknik_icerik_1;
import java.util.Scanner;
public class NotOrtalaması {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Puanı: ");
        int matematikPuanı = scanner.nextInt();

        System.out.println("Fizik Puanı: ");
        int fizikPuanı = scanner.nextInt();

        System.out.println("Kimya Puanı: ");
        int kimyaPuanı = scanner.nextInt();

        System.out.println("Türkçe Puanı: ");
        int türkçePuanı = scanner.nextInt();

        System.out.println("Tarih Puanı: ");
        int tarihPuanı = scanner.nextInt();

        System.out.println("Müzik Puanı: ");
        int müzikPuanı = scanner.nextInt();

        int toplamPuan = matematikPuanı + fizikPuanı + kimyaPuanı + türkçePuanı + tarihPuanı + müzikPuanı;
        double ortalama = toplamPuan / 6.0;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
