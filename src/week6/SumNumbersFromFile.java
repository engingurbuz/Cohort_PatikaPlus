package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        // Update the file path to the full path of your numbers.txt file
        String fileName = "C:\\Users\\Engin\\IdeaProjects\\Cohort_PatikaPlus\\src\\week6\\numbers.txt"; // Replace with your file path
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
