package week2.teknik_icerik_3.Öğrenci_Bilgi_Sistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralExamNote; // Sözlü notu
    double examWeight; // Sınav notunun ortalamaya etkisi
    double oralExamWeight; // Sözlü notunun ortalamaya etkisi

    public Course(String name, String code, String prefix, double examWeight, double oralExamWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralExamNote = 0;
        this.examWeight = examWeight;
        this.oralExamWeight = oralExamWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
