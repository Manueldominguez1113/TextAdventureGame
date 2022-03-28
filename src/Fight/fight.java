package Fight;

import Characters.*;

import java.util.Scanner;

public class fight {

    static Scanner input = new Scanner(System.in);

    public fight(Hero player, Enemy enemy) {
        System.out.printf("%s blocks the way!\n", enemy.getName());
        choice(player, enemy);

    }

    public void choice(Hero player, Enemy enemy) {
        if (player.isDefending) {
            player.resetDefending();
        }
        hpShow(player);
        int inp = ask(player);
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
                choice(player, enemy);
                break;
            }
            case 4: {
                player.usePotion();
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

        endDefend(enemy);

        if (enemy.checkIfDead()) {
            System.out.printf("%s collapses.. You win!", enemy.getName());
            player.xpGain(enemy.level);
        } else {
            int roll = (int) Math.ceil(Math.random() * (100));
            if (roll > 25) {
                enemy.attack(player);
                if (player.checkIfDead()) {
                    System.out.println("Your vision begins to fade, you collapse.. Game over");
                    gameOver(player, enemy);
                } else {
                    choice(player, enemy);
                }
            } else {
                enemy.defend();
                choice(player, enemy);
            }
        }
    }

    public int ask(Hero player) {
        System.out.printf("\nwhat do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Potion: %s\n5.Run\n", player.getPotions());
        return input.nextInt();
    }

    public void endDefend(Hero target) {
        if (target.isDefending) {
            target.resetDefending();
        }
    }

    public void endDefend(Enemy target) {
        if (target.isDefending) {
            target.resetDefending();
        }
    }

    public void hpShow(Hero target) {
        System.out.println("HP:" + target.currHP + "/" + target.maxHP);
    }

    public void hpShow(Enemy target) {
        System.out.println("HP:" + target.currHP + "/" + target.maxHP);
    }

    public void run() {
        System.out.println("got away safely...");
    }

    public void gameOver(Hero player, Enemy killer) {
        System.out.println("you have fallen.. but will you get back up?");
        System.out.printf("%-5s || %5s ", "continue", "quit");
        String answer = input.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("continue")) {
            player.setCurrHP(player.getMaxHP());
            new fight(player, killer);
        } else {
            System.out.println("your light fades away..");
        }
    }


 /*   public void gameOver(Hero player, Boss killer) {
        System.out.printf("you have fallen.. %s laughs as he continues his onslaught.\n..Without you, many innocent lives end, here, now. do you accept this fate?\n");
        System.out.printf("%-5s || %5s ", "fight", "end");
        String answer = input.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("continue")) {
            player.setCurrHP(player.getMaxHP());
            new fight(player, killer);
        } else {
            System.out.println("your light fades away..\n as you lose consciousness, the area surrounding goes up in a blaze. \n");
            System.out.print("                 ___-----------___\n" +
                    "           __--~~                 ~~--__\n" +
                    "       _-~~                             ~~-_\n" +
                    "    _-~                                     ~-_\n" +
                    "   /                                           \\\n" +
                    "  |                                             |\n" +
                    " |                                               |\n" +
                    " |                                               |\n" +
                    "|                                                 |\n" +
                    "|                                                 |\n" +
                    "|                                                 |\n" +
                    " |                                               |\n" +
                    " |  |    _-------_               _-------_    |  |\n" +
                    " |  |  /~         ~\\           /~         ~\\  |  |\n" +
                    "  ||  |             |         |             |  ||\n" +
                    "  || |               |       |               | ||\n" +
                    "  || |              |         |              | ||\n" +
                    "  |   \\_           /           \\           _/   |\n" +
                    " |      ~~--_____-~    /~V~\\    ~-_____--~~      |\n" +
                    " |                    |     |                    |\n" +
                    "|                    |       |                    |\n" +
                    "|                    |  /^\\  |                    |\n" +
                    " |                    ~~   ~~                    |\n" +
                    "  \\_         _                       _         _/\n" +
                    "    ~--____-~ ~\\                   /~ ~-____--~\n" +
                    "         \\     /\\                 /\\     /\n" +
                    "          \\    | ( ,           , ) |    /\n" +
                    "           |   | (~(__(  |  )__)~) |   |\n" +
                    "            |   \\/ (  (~~|~~)  ) \\/   |\n" +
                    "             |   |  [ [  |  ] ]  /   |\n" +
                    "              |                     |\n" +
                    "               \\                   /\n" +
                    "                ~-_             _-~\n" +
                    "                   ~--___-___--~\n" +
                    "                     GAME OVER                          ");
        }
    }
}

*/
}
