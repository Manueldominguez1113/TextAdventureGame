package Characters;
import weapons.weapon;
public class Hero extends livingThing {
    private int level;
    private weapon weapon;


    public Hero(String name, String role, int maxHP, int atk, weapon weapon) {
        super(name, role, maxHP, atk);
 this.level = 1;
 this.weapon = weapon;


    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void levelUp(){
        this.level +=1;
    }

    public void checkWeapon() {
         weapon.info();
    }

    public void setWeapon(weapons.weapon weapon) {
        this.weapon = weapon;
    }


}

