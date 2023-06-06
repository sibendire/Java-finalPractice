package arrays.phone.interfaces.challengInterface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hintPoint;
    private int strength;
    private String weapon;
//
//    public class Player(){
//
//    }
    public Player(String name, int hintPoint, int strength) {
        this.name = name;
        this.hintPoint = hintPoint;
        this.strength = strength;
        this.weapon="gun";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHintPoint() {
        return hintPoint;
    }

    public void setHintPoint(int hintPoint) {
        this.hintPoint = hintPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hintPoint='" + hintPoint + '\'' +
                ", strength='" + strength + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String>values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.hintPoint);
        values.add(2,"" + this.strength);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedvalues) {
    if (savedvalues != null && savedvalues.size()>0){
        this.name = savedvalues.get(0);
        this.hintPoint = Integer.parseInt(savedvalues.get(1));
        this.strength = Integer.parseInt(savedvalues.get(2));
        this.weapon = savedvalues.get(3);
    }
    }
}
