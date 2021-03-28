import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List write() {
        ArrayList<String> input = new ArrayList<String>();
        input.add(0,this.name);
        input.add(1,"" + this.hitPoints);
        input.add(2,"" + this.strength);



        return input ;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> saved) {
        if (saved != null && saved.size()>0){
            this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength =  Integer.parseInt(saved.get(2));


        }

    }}
