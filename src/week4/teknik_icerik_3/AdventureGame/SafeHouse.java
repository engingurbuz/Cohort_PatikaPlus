package week4.teknik_icerik_3.AdventureGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesiniz!");
        System.out.println("Sağlığınız yenilendi.");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        return true;
    }
}
