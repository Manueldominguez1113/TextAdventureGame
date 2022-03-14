package Characters;
import weapons.weapon;

public class Hero extends livingThing {
    private int level;



    public Hero(String name, String role, weapon weapon) {
        super(name, role, 1, weapon);


    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        this.level += 1;
    }

    public void checkWeapon() {
        weapon.info();
    }

    public void setWeapon(weapons.weapon weapon) {
        this.weapon = weapon;
    }

    public void items(){


    }
}

