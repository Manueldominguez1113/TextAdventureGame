package Fight;

import Characters.*;

import java.util.Scanner;

public class fight {
    static Scanner input = new Scanner(System.in);

    public fight(Hero player, Enemy enemy) {
        System.out.printf("%s blocks the way!", enemy.getName());
        System.out.println("what do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Item\n5.Run");
        String in = input.next();
        switch (in) {
            case "1": {
                player.attack(enemy);
            }
            case "2":{
                player.defend();
            }
            case "3":{
                enemy.info();
            }
            case "4"{
                player.items();//item
            }
            case "5"{
                run();//run
            }
        }
    }

    public fight(Hero player, Boss boss) {
        System.out.printf("%s blocks the way!", boss.getName());
        System.out.println("what do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Item\n5.Run");

    }

    public void run(){

    }
}



