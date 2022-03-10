package weapons;


public class listOfCommonWeapons {
    public static weapon[] commonWeapons() {
        return new weapon[]{
                new weapon("Sword and shield",5,5,0),
                new weapon("Spear", 5,5,10),
                new weapon("Dagger",3,0,50),
                new weapon("Bow",4,0,20),
                new weapon("Great Sword",9,-4,-20),
        };
    }
}
