package weapons;

public class weapon {
    public String name;
    private int atk;
    private int def;
    private int acc;



    public weapon(String name, int atk, int def, int bonusAcc){
        this.name = name;
        this.atk=atk;
        this.def=def;
        this.acc=bonusAcc; //bonus acc to try for crit chance..
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

    public int getAcc() {
        return this.acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
public void info(){
    System.out.printf("%s, attack: %s defence: %s bonus-accuracy: %s ", this.getName(),this.getAtk(),this.getDef(),this.getAcc());

}

}
