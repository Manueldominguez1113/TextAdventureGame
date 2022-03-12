package Characters;

import java.lang.Math;

public class livingThing implements chacteristics {
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
        this.maxAtk = atk * 2;
        this.atk = atk;
        this.minAtk = atk / 2;
        this.def = 0;
        this.cc = 25;

    }

    public void attack(livingThing target) {
        int die100 = (int) Math.ceil(Math.random() * (100));
        // int attack = (int) Math.floor(Math.random() * (this.maxAtk - this.minAtk) + this.minAtk);
        System.out.printf("\n%s attempts to strike %s..", this.name, target.getName());

        if (die100 >= 100 - this.accuracy) {
            hit();
        } else {
            System.out.printf("%s missed!",this.name);
            // i want a critical miss function
        }
        System.out.println("under attack this should go away after finishing "+die100);
    }

    public void hit(livingThing target) {
        System.out.printf("\n%s lands a blow!\n", this.name);
        int critRoll = (int) Math.ceil(Math.random() * (100));
        if(critRoll <= this.cc){
            System.out.printf("CRITICAL HIT! %s flavor text %s flavor text ", this.name, target.getName());
            target.setCurrHP(target.currHP-this.maxAtk);
        } else{
            System.out.printf("%s hits! %s takes %s points of damage!", this.name, target.getName(), this.atk);
            target.setCurrHP(target.currHP-this.atk);
        }
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
