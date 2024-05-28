package week2.teknik_icerik_3.Öğrenci_Bilgi_Sistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matOral, int fizik, int fizikOral, int kimya, int kimyaOral) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralExamNote = matOral;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (fizikOral >= 0 && fizikOral <= 100) {
            this.fizik.oralExamNote = fizikOral;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (kimyaOral >= 0 && kimyaOral <= 100) {
            this.kimya.oralExamNote = kimyaOral;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (
                (this.mat.note * this.mat.examWeight + this.mat.oralExamNote * this.mat.oralExamWeight) +
                        (this.fizik.note * this.fizik.examWeight + this.fizik.oralExamNote * this.fizik.oralExamWeight) +
                        (this.kimya.note * this.kimya.examWeight + this.kimya.oralExamNote * this.kimya.oralExamWeight)
        ) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " | Sözlü: " + this.mat.oralExamNote);
        System.out.println("Fizik Notu : " + this.fizik.note + " | Sözlü: " + this.fizik.oralExamNote);
        System.out.println("Kimya Notu : " + this.kimya.note + " | Sözlü: " + this.kimya.oralExamNote);
    }
}
