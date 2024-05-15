package week1.teknik_icerik_2;

import java.util.Scanner;

public class UçakBiletiFiyatı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for distance, age, and travel type
        System.out.println("Mesafeyi km türünden giriniz:");
        double distance = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz:");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş):");
        int travelType = scanner.nextInt();

        // Validate user input
        if (distance < 0 || age < 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Calculate the normal fare
        double normalFare = distance * 0.10;

        // Calculate the discount based on age
        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = normalFare * 0.50;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = normalFare * 0.10;
        } else if (age >= 65) {
            ageDiscount = normalFare * 0.30;
        }

        // Calculate the discount based on travel type
        double travelTypeDiscount = 0;
        if (travelType == 2) {
            travelTypeDiscount = (normalFare - ageDiscount) * 0.20;
        }

        // Calculate the total fare
        double totalFare = (normalFare - ageDiscount - travelTypeDiscount) * (travelType == 2 ? 2 : 1);

        // Display the total fare
        System.out.println("Toplam Tutar = " + totalFare + " TL");
    }
}
