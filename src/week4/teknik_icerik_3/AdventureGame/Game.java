package week4.teknik_icerik_3.AdventureGame;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.println("Lütfen bir isim giriniz: ");
        //String playerName = input.nextLine();

        Player player = new Player("Engin");
        System.out.println(player.getName() + " Hoşgeldiniz!");
        System.out.println("Lütfen bir karakter seçiniz: ");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("**************** Bölgeler ****************");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli ev, düşman yoktur.");
            System.out.println("2 - Mağaza --> Silah veya zırh satın alabilirsiniz.");
            System.out.println("3 - Mağara --> Mağara gir. Dikkatli ol, canavar çıkabilir.");
            System.out.println("0 - Çıkış Yap --> Oyunu sonlandır.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz.");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(location == null){
                System.out.println("Oyun bitti, yine bekleriz :(");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Öldünüz! Oyun Bitti!");
                        break;
            }
        }
    }
}
