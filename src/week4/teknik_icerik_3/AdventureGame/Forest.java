package week4.teknik_icerik_3.AdventureGame;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Orman", new Vampire(),"firewood", 3);
    }
}
