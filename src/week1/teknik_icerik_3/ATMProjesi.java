package week1.teknik_icerik_3;
import java.util.Scanner;
public class ATMProjesi {

        public static void main(String[] args) {

            // Kullanıcı adı ve şifre tanımlamaları
            String userName, password;

            // Scanner nesnesi
            Scanner input = new Scanner(System.in);

            // Kalan deneme hakkı
            int right = 3;

            // Başlangıç bakiyesi
            int balance = 1500;

            // İşlem seçimi
            int select;

            while (right > 0) {

                // Kullanıcı adı giriş
                System.out.print("Kullanıcı Adınız: ");
                userName = input.nextLine();

                // Şifre giriş
                System.out.print("Parolanız: ");
                password = input.nextLine();

                // Giriş bilgileri kontrol
                if (userName.equals("patika") && password.equals("dev123")) {

                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz!");

                    do {

                        // Menü
                        System.out.println("""

                                1- Para Yatırma
                                2- Para Çekme
                                3- Bakiye Sorgulama
                                4- Çıkış
                                Seçiminizi giriniz:\s""");

                        // Seçim al
                        select = input.nextInt();

                        // Switch-Case ile işlem seçimi
                        switch (select) {
                            case 1:
                                // Para yatırma işlemi
                                System.out.print("Yatırılacak tutarı giriniz: ");
                                int depositAmount = input.nextInt();
                                balance += depositAmount;
                                System.out.println("Hesabınıza " + depositAmount + " TL yatırıldı. Yeni bakiyeniz: " + balance);
                                break;

                            case 2:
                                // Para çekme işlemi
                                System.out.print("Çekilecek tutarı giriniz: ");
                                int withdrawAmount = input.nextInt();
                                if (withdrawAmount > balance) {
                                    System.out.println("Yetersiz bakiye.");
                                } else {
                                    balance -= withdrawAmount;
                                    System.out.println("Hesabınızdan " + withdrawAmount + " TL çekildi. Kalan bakiyeniz: " + balance);
                                }
                                break;

                            case 3:
                                // Bakiye sorgulama
                                System.out.println("Bakiyeniz: " + balance);
                                break;

                            case 4:
                                // Çıkış
                                System.out.println("Tekrar görüşmek üzere.");
                                break;

                            default:
                                // Hatalı seçim
                                System.out.println("Hatalı seçim. Lütfen tekrar deneyiniz.");
                                break;
                        }

                    } while (select != 4); // 4 seçildiğinde döngüden çıkış

                } else {
                    // Hatalı giriş
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Kalan hakkınız: " + right);
                }
            }

            // Tüm haklar tükendiğinde
            System.out.println("Hesabınıza erişiminiz engellenmiştir. Bankamıza şahsen başvurunuz.");

        }
    }
