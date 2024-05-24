package week1.teknik_icerik_3;

import java.util.Scanner;

public class ÇiftVeDördünKatlarınıToplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        // Loop until an odd number is entered
        do {
            System.out.print("Enter an integer (odd to stop): ");
            number = scanner.nextInt();

            // Check if even and add to sum if it's also a multiple of 4
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);  // Continue looping as long as even

        // Print the sum
        System.out.println("Sum of even and multiples of 4: " + sum);
    }
}
