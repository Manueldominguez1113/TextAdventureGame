package Characters;

import weapons.weapon;

public class Enemy extends livingThing {
    private final boolean isBoss;

    public Enemy(String name, String role, int level, weapons.weapon wields, boolean isBoss) {
        super(name, role, level, wields);
        this.isBoss = isBoss;
        if (!isBoss) {
            this.cc = 1;
        }
    }

    public boolean isBoss(){
        return this.isBoss;
    }

    public void info() {
        if (this.isBoss) {
            System.out.printf("the aura around %s %s is dark and powerful.. he wields a %s\ndanger level: %s\n", this.role, this.name, this.weapon.getName(), this.level);
        } else {
            System.out.printf("A %s %s using %s\ndanger level: %s\n", this.role, this.name, this.weapon.getName(), this.level);
        }
        System.out.printf("Stats:\n Max HP %s\n Attack: %s \n Defence %s\n Dodge %s\nI watch %s to see how they are holding up..\n", this.maxHP, this.atk + this.weapon.getAtk(), this.def + this.weapon.getDef(), this.dodge, this.name);
            hpCheck();

    }

    public void hpCheck() {
        double hpPercent = (double) this.currHP / this.maxHP;
        if (hpPercent == 1) {
            System.out.printf("%s seems to be in 100%% fighting condition...", this.name);
        } else if (hpPercent < 0.99 && hpPercent > 0.90) {
            System.out.printf("%s growls. looks like i only scratched him..!", this.name);
        } else if (hpPercent < 0.89 && hpPercent > 0.80) {
            System.out.printf("%s looks angry. time to get serious!", this.name);
        } else if (hpPercent < 0.79 && hpPercent > 0.70) {
            System.out.printf("%s is breathing heavily. my last attacks seem to be working..!", this.name);
        } else if (hpPercent < 0.69 && hpPercent > 0.60) {
            System.out.printf("my last attack made some serious damage! %s has an ugly wound.", this.name);
        } else if (hpPercent < 0.59 && hpPercent > 0.50) {
            System.out.printf("%s is gritting it's teeth and loosing focus, I gotta be halfway!", this.name);
        } else if (hpPercent < 0.49 && hpPercent > 0.40) {
            System.out.printf("gotta keep it up! %s is trying to stay focused", this.name);
        } else if (hpPercent < 0.39 && hpPercent > 0.30) {
            System.out.printf("%s is on it's last legs..!", this.name);
        } else if (hpPercent < 0.29 && hpPercent > 0.20) {
            System.out.printf("%s is struggling. I can win this..!", this.name);
        } else if (hpPercent < 0.19) {
            System.out.printf("%s is dying. End their misery.", this.name);
        }
        System.out.printf("\n(Using a magic eyeglass, I can see %s's hp %s/%s)",this.name,this.currHP,this.maxHP);
    }

}
