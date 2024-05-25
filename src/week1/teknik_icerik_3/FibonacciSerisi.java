package week1.teknik_icerik_3;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                System.out.print(i + " ");
            } else {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
