import java.util.Scanner;

public class KullanıcıGirişi {

    public static void main(String[] args) {
        String username = "patika", password = "java123", newpassword;
        Integer select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        String enteredUsername = inp.nextLine();

        System.out.print("Şifreniz: ");
        String enteredPassword = inp.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Giriş yaptınız.");
        } else if (enteredUsername.equals(username) && !enteredPassword.equals(password)) {
            System.out.println("Şifreniz yanlış, sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz: ");
            select = inp.nextInt();
            inp.nextLine();

            if (select == 1) {
                System.out.print("Yeni Şifreniz: ");
                newpassword = inp.nextLine();

                if (newpassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    password = newpassword;
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifrenizi sıfırlamadınız.");
            }

        } else {
            System.out.println("Kullanıcı bulunamadı.");
        }
    }
}
