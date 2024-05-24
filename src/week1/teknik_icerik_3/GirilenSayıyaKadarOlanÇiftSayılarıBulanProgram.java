package week1.teknik_icerik_3;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanÇiftSayılarıBulanProgram {
    public static void main(String[] args) {

        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();

        for (int i=1; i<= k; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

    }
}
