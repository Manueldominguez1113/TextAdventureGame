package Characters;

public class livingThing {
    public String name;
    public String role;
    public String feats;
    public int level;
    public int maxHP;
    public int maxAtk;
    public int minAtk;
    public int currHP;


    public livingThing(String name, String role, int level, int maxHP, int maxAtk, int minAtk) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.maxHP = maxHP;
        this.maxAtk = maxAtk;
        this.minAtk = minAtk;

    }

    public void attack(){

    }

}
