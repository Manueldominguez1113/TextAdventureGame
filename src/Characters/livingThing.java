package Characters;

import java.lang.Math;

public class livingThing {
    public String name;
    public String role;
    public int level;
    public int maxHP;
    public int maxAtk;
    public int atk;
    public int currHP;
    public int accuracy;
    public int def;
    public int cc;
    public int dodge;


    public livingThing(String name, String role, int level) {
        this.name = name;
        this.level = level;
        this.role = role;
        statAllocation(role);
        this.maxHP = 100+(10*this.level);
        this.maxAtk = atk * 2;
        this.atk = 10+(5*this.level);
        this.def = 0;
        this.cc = 15;
        this.dodge = 5;


    }

    public void statAllocation(String role) { //keyword system to adjust stats more accordingly to the class of the hero/enemies
        if (role.contains("barbarian")) {
            this.atk += 5 * this.level;
            this.def +=5;
            this.dodge = 0;
        }
        if (role.contains("Assassin")) {
            this.atk += 2 * this.level;
            this.cc += 10;
            this.dodge += 5;
            this.def -= 10;
        }
        if (role.contains("knight")) {
            this.def += 20;
            this.dodge =0;
        }
        if(role.contains("beast")){
            this.atk += this.level;
            this.def += 5;
        }
        if(role.contains("minotaur")){
            this.atk += 2 * this.level;
            this.def += 20;
        }
        if(role.contains("death")){  // exclusive boss keyword. ie.. "Death Knight Minotaur". or maybe a "Death Assassin Reaper" would probably be the scariest fight. imagine a 100 dmg easy crit.
            this.atk += 10* this.level;
            this.accuracy +=20;

        }
        if(role.contains("wolf")){
            this.atk += this.level;
            this.cc += 5;
        }
        if(role.contains("boss")){ // I want to put the boss stats out of proportion. then give you a "lady in the lake" chance at a god weapon to bring him down with long numbers
             this.maxHP = 1000000000; // one million hp!
            this.def = 50; // 50% damage reduction!
            this.dodge += 20; //base 25% dodge chance!
            this.atk += 20*this.level; // base 10+ 20* boss level, probably 10. so he smacks for 210 non crit per hit if you didnt get the super weapon.
        }

    }

    public void attack(livingThing target) {
        int die100 = (int) Math.ceil(Math.random() * (100));
        System.out.printf("\n%s attempts to strike %s..", this.name, target.getName());

        if (die100 >= 100 - this.accuracy + target.dodge) { // basically, say you have 95% acc. if the roll was higher than 100-95(5)+ opponents dodge chance of 5(10), you hit.
            hit(target);
        } else {
            System.out.printf("%s missed!",this.name);
        }
        System.out.println("under attack this should go away after finishing "+die100);
    }

    public void hit(livingThing target) {
        System.out.printf("\n%s lands a blow!\n", this.name);
        int critRoll = (int) Math.ceil(Math.random() * (100));
        if(critRoll <= this.cc){ // opposite of acc, if you roll from 1-100 under the cc number, you crit. so 25 cc is 25% chance to crit
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
