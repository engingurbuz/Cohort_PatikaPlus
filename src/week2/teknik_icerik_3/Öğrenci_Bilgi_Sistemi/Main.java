package week2.teknik_icerik_3.Öğrenci_Bilgi_Sistemi;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.80, 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.80, 0.20);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.80, 0.20);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 70, 20, 30, 40, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 90, 50, 40, 40, 60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 60, 20, 30, 40, 45);
        s3.isPass();
    }
}
