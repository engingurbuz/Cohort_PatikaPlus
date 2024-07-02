package week4.teknik_icerik_3.AdventureGame;

public class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        System.out.println("Şu an buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + this.getObstacle().getName() + " yaşıyor.");
        return true;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
