package Characters;
import java.lang.Math;
public class livingThing implements chacteristics{
    public String name;
    public String role;
    public int maxHP;
    public int maxAtk;
    public int minAtk;
    public int currHP;
    public int accuracy;


    public livingThing(String name, String role, int accuracy, int maxHP, int maxAtk, int minAtk) {
        this.name = name;
        this.role = role;
        this.accuracy = accuracy;
        this.maxHP = maxHP;
        this.maxAtk = maxAtk;
        this.minAtk = minAtk;

    }

    public void attack(livingThing target){
        //ill implement acc here.. double acc to make it more specific with the random roll.

        int attack = (int)Math.floor(Math.random()*(this.maxAtk-this.minAtk)+this.minAtk);
        System.out.printf("\n%s strikes..", this.name);
        if(attack == maxAtk){
            System.out.println("CRITICAL HIT!");
        } if (attack == minAtk){
            System.out.printf("\n%s grazes %s with his strike",this.name, target.getName());
        }
            System.out.printf(" %s is hit for %s hp!", target.getName(), attack);


        target.setCurrHP(target.getCurrHP()-attack);
    }


    public boolean checkIfDead() {
        return this.currHP >= 0;

    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void newName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void changeRole(String role) {
        this.role = role;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxAtk() {
        return maxAtk;
    }

    public void setMaxAtk(int maxAtk) {
        this.maxAtk = maxAtk;
    }

    public int getMinAtk() {
        return minAtk;
    }

    public void setMinAtk(int minAtk) {
        this.minAtk = minAtk;
    }

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }




}
