package Characters;
import java.lang.Math;
public class livingThing implements chacteristics{
    public String name;
    public String role;
    public int maxHP;
    public int maxAtk;
    public int atk;
    public int minAtk;
    public int currHP;
    public int accuracy;
    public int def;
    public int cc;


    public livingThing(String name, String role, int maxHP, int atk) {
        this.name = name;
        this.role = role;
        this.accuracy = 100;
        this.maxHP = maxHP;
        this.maxAtk = atk*2;
        this.atk = atk;
        this.minAtk = atk/2;
        this.def=0;
        this.cc=25;

    }

    public void attack(livingThing target) {
        int die100 = (int) Math.ceil(Math.random() * (100));
        int attack = (int) Math.floor(Math.random() * (this.maxAtk - this.minAtk) + this.minAtk);
        System.out.printf("\n%s attempts to strike %s..", this.name, target.getName());
        if (die100 >= 100 - 85) {
            hit();
        } else {
            miss();
        }
        System.out.println(die100);



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

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public int getAcc() {
        return accuracy;
    }

    public void setAcc(int accuracy) {
        this.accuracy = accuracy;
    }




}
