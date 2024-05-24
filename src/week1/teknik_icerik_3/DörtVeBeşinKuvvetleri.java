package week1.teknik_icerik_3;

import java.util.Scanner;

public class DörtVeBeşinKuvvetleri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("4'ün Kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n5'in Kuvvetleri:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + " ");
        }
    }

}
