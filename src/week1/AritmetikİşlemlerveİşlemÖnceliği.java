package week1;

import java.util.Scanner;

public class AritmetikİşlemlerveİşlemÖnceliği {

    public static void main(String[] args) {

        // Creation of variables
        int a, b, c, total;

        // Define a scanner
        Scanner input= new Scanner(System.in);

        // Get values from the user
        System.out.print("Enter the value of a: ");
        a= input.nextInt();
        System.out.print("Enter the value of b: ");
        b= input.nextInt();
        System.out.print("Enter the value of c: ");
        c= input.nextInt();

        // Calculation of values
        total= a+b*c-b;
        System.out.print("Result: " +total);

    }
}