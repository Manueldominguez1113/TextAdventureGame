package Fight;

import Characters.*;

import java.util.Scanner;

public class fight {

    static Scanner input = new Scanner(System.in);

    public fight(Hero player, Enemy enemy) {
        System.out.printf("%s blocks the way!\n", enemy.getName());
        choice(player, enemy);

    }

    public fight(Hero player, Boss boss) {
        System.out.printf("%s blocks the way!\n", boss.getName());
        System.out.println("what do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Item\n5.Run");

    }

    public void choice(Hero player, Enemy enemy){

            System.out.println("what do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Item\n5.Run");
        int inp = input.nextInt();
        switch (inp) {

            case 1: {
                player.attack(enemy);
                break;
            }
            case 2: {
                player.defend();
                break;
            }
            case 3: {
                enemy.info();
                break;
            }
            case 4: {
                player.items();//item
                break;
            }
            case 5: {
                run();//run
                break;
            }
            default: {
                System.out.println("not a valid input. try again..");
                choice(player, enemy);
                break;

        }
    }
    if(enemy.checkIfDead()){
        int roll = (int) Math.ceil(Math.random() * (100));
        if(roll >25){
            enemy.attack(player);
            if(player.checkIfDead()){
                choice(player, enemy);
            } else{
                System.out.println("You fell.. Game over");
            }
        }
        else{enemy.defend();}
        choice(player, enemy);
    } else{
        System.out.printf("%s collapses.. You win!", enemy.getName());
    }
}

    public void run(){
        System.out.println("got away safely...");
    }
}



