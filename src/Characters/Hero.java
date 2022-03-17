package Characters;
import weapons.weapon;

public class Hero extends livingThing {
    private int level;
    private int potions;

    public Hero(String name, String role, weapon weapon) {
        super(name, role, 1, weapon);
        this.potions = 5;

    }

    public int getLevel() {
        return this.level;
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


    public int getPotions() {
        return this.potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }
    public void usePotion(){
        if (this.currHP != this.maxHP){
            if(this.potions==0){
            System.out.println("you are out of potions!");
        } else {
            this.potions -= 1;
            System.out.println("you use a potion... and return to full health!");
            this.setCurrHP(this.maxHP);
        }
        } else{
            System.out.println("your already at full health!");
        }

    }
}

