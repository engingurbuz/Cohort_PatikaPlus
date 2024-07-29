package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        String fileName = "numbers.txt"; // Change this to your file's path
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The sum is: " + sum);
    }
}
