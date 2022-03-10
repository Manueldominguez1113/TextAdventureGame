package weapons;


public class listOfLegendaryWeapons {
    public static weapon[] legendaryWeapons() {
        return new weapon[]{
                new weapon("Sword of Power",20,15,0),
                new weapon("Spear of Life", 20,10,20),
                new weapon("Dagger of Inf. Crits",20,0,100),
                new weapon("Bow of Light",18,0,20),
                new weapon("Earthshatterer the Great Sword",50,-8,-20),

        };
    }
}
