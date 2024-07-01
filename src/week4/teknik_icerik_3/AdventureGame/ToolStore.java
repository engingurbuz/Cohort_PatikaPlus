package week4.teknik_icerik_3.AdventureGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya Hoşgeldiniz!");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış Yap");
        System.out.print("Seçiminiz: ");
        int selectCase = Location.input.nextInt();

        while (selectCase < 1 || selectCase > 3){
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectCase = Location.input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz.");
                return true;
        }

        return true;
    }

    public void printWeapon() {
       System.out.println("------- Silahlar -------");
        System.out.println();
        for (Weapon w: Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName()
                    + " <Para: " + w.getPrice()
                    + " <Hasar: " + w.getDamage() + ">");
        }
        System.out.print("Bir silah seçiniz:");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length){
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectWeapon = Location.input.nextInt();
            System.out.println("39.55 dkkada kaldım");
        }
    }
    public void printArmor() {
        System.out.println("Zırhlar");
    }
}
