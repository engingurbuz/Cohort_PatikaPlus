package week2.teknik_icerik_1;

import java.util.Scanner;

public class RecursiveFibonacci {
    // Fibonacci serisini özyinelemeli olarak hesaplayan metot
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin kaçıncı elemanını bulmak istiyorsunuz? ");
        int n = scanner.nextInt();

        System.out.println(n + ". Fibonacci sayısı: " + fibonacci(n));

        scanner.close();
    }
}
