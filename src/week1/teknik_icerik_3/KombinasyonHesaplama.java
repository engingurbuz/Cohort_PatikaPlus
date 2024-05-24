package week1.teknik_icerik_3;

import java.util.Scanner;

public class KombinasyonHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("Hata: n değeri r değerinden büyük olmalıdır!");
            return;
        }

        long kombinasyon = hesaplaKombinasyon(n, r);
        System.out.println(n + " elemanlı kümeden " + r + " elemanlı kombinasyonların sayısı: " + kombinasyon);
    }

    private static long hesaplaFaktoriyel(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hesaplaFaktoriyel(n - 1);
        }
    }

    private static long hesaplaKombinasyon(int n, int r) {
        return hesaplaFaktoriyel(n) / (hesaplaFaktoriyel(r) * hesaplaFaktoriyel(n - r));
    }
}
