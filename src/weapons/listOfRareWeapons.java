package weapons;

public class listOfRareWeapons {
    public static weapon[] rareWeapons() {
        return new weapon[]{
                new weapon("Sword and shield",10,10,0),
                new weapon("Spear", 10,5,10),
                new weapon("Dagger",10,0,50),
                new weapon("Bow",7,0,20),
                new weapon("Great Sword",40,-8,-20),
        };
    }
}
