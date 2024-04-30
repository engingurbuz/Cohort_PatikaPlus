package week1.teknik_icerik_1;

import java.util.Scanner;

public class DikUcgenHipotenus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dik kenarları alma
        System.out.print("Birinci dik kenar uzunluğunu giriniz: ");
        double dikKenar1 = scanner.nextDouble();

        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        double dikKenar2 = scanner.nextDouble();

        // Hipotenüsü hesaplama
        double hipotenus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);

        // Sonucu yazdırma
        System.out.println("Hipotenüsün uzunluğu: " + hipotenus);
    }
}
