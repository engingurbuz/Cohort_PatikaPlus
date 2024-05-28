package week2.teknik_icerik_3.Maaş_Hesaplayıcı;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergiyi hesaplayan metot
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus ücretleri hesaplayan metot
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışını hesaplayan metot
    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;

        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Çalışana ait bilgileri ekrana bastıran metot
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kemal", 2000.0, 45, 1985);
        System.out.println(emp);
    }
}
