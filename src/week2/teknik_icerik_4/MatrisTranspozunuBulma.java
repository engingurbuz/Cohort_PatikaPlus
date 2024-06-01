package week2.teknik_icerik_4;

import java.util.Scanner;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Satır sayısını girin: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // Matris oluştur ve elemanları al
        int[][] matrix = new int[rows][cols];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu hesapla
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Orijinal matrisi yazdır
        System.out.println("Matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisi yazdır
        System.out.println("Transpoze:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
