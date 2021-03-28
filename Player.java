import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List write() {
        ArrayList<String> input = new ArrayList<>();
        input.add(0,this.name);
        input.add(1,"" + this.hitPoints);
        input.add(2,"" + this.strength);
        input.add(3,this.weapon);


        return input ;
    }

    @Override
    public void read(List<String> saved) {
        if (saved != null && saved.size()>0){
            this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength =  Integer.parseInt(saved.get(2));
            this.weapon = saved.get(3);

        }
    }
}
