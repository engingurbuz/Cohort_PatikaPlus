package week6.NotePad;

import java.io.*;
import java.util.Scanner;

public class SimpleNotepad {
    // Dosya yolunu tam olarak belirtiyoruz
    private static final String FILE_PATH = "C:\\Users\\Engin\\IdeaProjects\\Cohort_PatikaPlus\\src\\week6\\Notepad\\notlar.txt";

    public static void main(String[] args) {
        // Program başında dosyadan metin okunur
        String okunanMetin = readFromFile();
        if (okunanMetin != null && !okunanMetin.isEmpty()) {
            System.out.println("En son kaydedilen metin: " + okunanMetin);
        } else {
            System.out.println("Dosyadan metin okunamadı veya dosya boş.");
        }

        // Kullanıcıdan yeni metin girişi alınır
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Girdi dosyaya yazılır
        writeToFile(metin);
    }

    private static void writeToFile(String metin) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.print(metin);
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında hata oluştu: " + e.getMessage());
        }
    }

    private static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(FILE_PATH);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println("Dosyadan okuma sırasında hata oluştu: " + e.getMessage());
            return null;
        }
        return sb.toString().trim();
    }
}
