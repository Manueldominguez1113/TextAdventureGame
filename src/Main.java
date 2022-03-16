import Characters.*;
import Fight.*;
import weapons.*;
import World.*;



public class Main {
    public static void main(String[] args) {
 Hero alex = new Hero("alex", "barbarian", listOfCommonWeapons.commonWeapons()[1]);
Enemy enemy = new Enemy("minotaur", "barbarian", 1, listOfCommonWeapons.commonWeapons()[1]);
alex.setCurrHP(10);
new fight(alex, enemy);

        System.out.println("this should show up after the fight. ");
        new fight(alex, new Enemy("wolf", "assassin",1,listOfCommonWeapons.commonWeapons()[1]));
    }
}
