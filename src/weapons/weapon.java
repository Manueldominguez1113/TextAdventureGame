package weapons;

public class weapon {
    public String name;
    private int atk;
    private int def;
    private int critchance;
    private int acc;

    public weapon(String name, int atk, int def, int cc,int bonusAcc){
        this.name = name;
        this.atk=atk;
        this.def=def;
        this.acc=bonusAcc; //bonus to help hit.
        this.critchance= cc; // bonus to crit chance
    }


    //getters and setters..
    public String getName() {
        return this.name;
    }


    public int getAtk() {
        return this.atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return this.def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getCC() {
        return this.critchance;
    }

    public void setCC(int cc) {
        this.critchance = cc;
    }

    public int getAcc() {
        return acc;
    }
 public void setAcc(int acc){ this.acc=acc;}


    public void info(){
    System.out.printf("%s\n Attack: %s\n Defence: %s\n Crit. Chance: +%s%%\n Bonus-Accuracy: +%s%%\n ", this.getName(),this.getAtk(),this.getDef(),this.getCC(), this.getAcc());

}

}
