package Characters;
import weapons.weapon;
public class Hero extends livingThing {
    public int level;
    public weapon weapon;

    public Hero(String name, String role, int accuracy, int maxHP, int maxAtk, int minAtk, int level, weapon weapon) {
        super(name, role, accuracy, maxHP, maxAtk, minAtk);
 this.level = level;
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

