package week1.teknik_icerik_3;

public class AsalSayılarıBulma {

        public static void main(String[] args) {
            // 1'den 100'e kadar sayıları kontrol edelim
            for (int sayi = 1; sayi <= 100; sayi++) {
                // Sayının asal olup olmadığını kontrol edelim
                if (isPrime(sayi)) {
                    // Asal sayıyı ekrana yazdıralım
                    System.out.print(sayi + " ");
                }
            }
        }

        // Bir sayının asal olup olmadığını kontrol eden metod
        private static boolean isPrime(int sayi) {
            // 1 ve kendisinden başka böleni olmayan sayılar asaldır
            if (sayi <= 1) {
                return false;
            }

            // 2'den sayının köküne kadar olan sayıları bölen olarak kontrol edelim
            for (int bolen = 2; bolen * bolen <= sayi; bolen++) {
                if (sayi % bolen == 0) {
                    return false;
                }
            }

            // Hiçbir bölen bulamadıysak sayı asaldır
            return true;
        }
    }
