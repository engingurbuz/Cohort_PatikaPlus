package week6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
    // Veritabanı bağlantı bilgileri
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb"; // testdb yerini veritabanı isminizle değiştirin
    static final String USER = "root"; // MySQL kullanıcı adınız
    static final String PASS = "password"; // MySQL şifreniz

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Adım 1: Bağlantı oluştur
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Adım 2: Statement oluştur
            stmt = conn.createStatement();

            // Adım 3: Tablo oluşturma sorgusu
            String sql = "CREATE TABLE IF NOT EXISTS employees " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " position VARCHAR(255), " +
                    " salary DECIMAL(15, 2), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Tablo oluşturuldu...");

            // Adım 4: Tabloya veri ekleme
            sql = "INSERT INTO employees VALUES (1, 'John Doe', 'Manager', 80000.00), " +
                    "(2, 'Jane Smith', 'Developer', 75000.00), " +
                    "(3, 'Bob Johnson', 'Designer', 70000.00), " +
                    "(4, 'Alice Davis', 'Analyst', 65000.00), " +
                    "(5, 'Chris Wilson', 'Tester', 60000.00)";
            stmt.executeUpdate(sql);
            System.out.println("Veriler tabloya eklendi...");

            // Adım 5: Veritabanından veri çekme ve ekrana yazdırma
            sql = "SELECT id, name, position, salary FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            // Adım 6: Verileri okuma
            while(rs.next()){
                // Sütunları al ve ekrana yazdır
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                double salary = rs.getDouble("salary");

                // Verileri ekrana yazdır
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Position: " + position);
                System.out.println(", Salary: $" + salary);
            }
            rs.close();
        } catch (SQLException se) {
            // JDBC hatalarını işleme
            se.printStackTrace();
        } catch (Exception e) {
            // Class.forName hatalarını işleme
            e.printStackTrace();
        } finally {
            // Kaynakları kapat
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("İşlem tamamlandı!");
    }
}
