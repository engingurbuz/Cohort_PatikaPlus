package week1.teknik_icerik_3;
import java.util.Scanner;
public class EbobEkok {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı al
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // EBOB hesaplama
        int ebob = findEBOB(sayi1, sayi2);
        System.out.println("EBOB: " + ebob);

        // EKOK hesaplama
        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }

    // EBOB hesaplama fonksiyonu
    public static int findEBOB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}