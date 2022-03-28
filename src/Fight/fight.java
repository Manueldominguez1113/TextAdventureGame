package Fight;

import Characters.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fight {
    public boolean gameOverChecker;
    static Scanner input = new Scanner(System.in);

    public fight(Hero player, Enemy enemy) {
        if (enemy.isBoss()) {
            System.out.printf("%s's presence is formidable.. you prepare, this will be a challenge!\n", enemy.getName());
        } else {
            System.out.printf("%s blocks the way!\n", enemy.getName());
        }
        choice(player, enemy);
        if (gameOverChecker) {
            System.exit(0);
        }
    }

    public int attempt = 0;

    public void choice(Hero player, Enemy enemy) {
        endDefend(player);
        hpShow(player);
        int inp;
        inp = ask(player);
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
                if (enemy.isBoss()) {
                    attempt++;
                    switch (attempt) {
                        case 1: {
                            System.out.printf("You turn to escape, but %s is too fast! \n", enemy.getName());
                            break;
                        }
                        case 2: {
                            System.out.printf("you find an abandoned house to hide in, enter the bathroom and lock the door. too bad %s saw you enter!\n %s breaks the door with an axe and says \"Heeeerre's %s!\"", enemy.getName(), enemy.getName(), enemy.getName());
                            break;
                        }
                        case 3: {
                            System.out.printf("you pull a pillow and blanket out and begin to sleep. he cant catch you in your dreams right?? \n in your nice, happy dream of clouds everything turns dark and you hear, \"one, two, %s coming for you..\"", enemy.getName());
                            break;
                        }
                        case 4: {
                            System.out.printf("you attach a paper sign to a tree\n \"%s Season\"\n...\n%s puts a sign in front of yours\n \"%s Season\" \n You replace his sign \"%s Season\"\n and he replaces yours.. \n \"%s Season\"\n Yawn.. your turn \n \"%s Season\"\n his turn.. \n \"%s Season\"\n wait-\n \"%s Season\"\n \"Fire!\"\n", enemy.getName(), enemy.getName(), player.getName(), enemy.getName(), player.getName(), enemy.getName(), enemy.getName(), player.getName());
                            break;
                        }
                        default: {
                            System.out.println("escape is impossible!");
                        }
                    }

                    break;
                } else {    // small joke if you keep running away from a boss to help show its pointless
                    run();//runs and escapes the fight
                }
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
            System.out.printf("\n\n%s collapses.. You win!", enemy.getName());
            player.xpGain(enemy.level);
        } else {
            int roll = (int) Math.ceil(Math.random() * (100));
            if (roll > 25) {
                enemy.attack(player);
                if (player.checkIfDead()) {
                    System.out.println("\n\nYour vision begins to fade, you collapse.. Game over");
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
        System.out.printf("\nwhat do you want to do? \n1.Fight\n2.Defend\n3.Check\n4.Potion: %s left\n5.Run\n", player.getPotions());
        if(input.hasNextInt()) {
            return input.nextInt();
        } else {
            System.out.println("invalid input.. try using numbers here..");
            input.next();
            return ask(player);
        }



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

    public void run() {
        System.out.println("got away safely...");
        // escapes the code to carry on.
    }

    public void gameOver(Hero player, Enemy killer) {
        System.out.println("\n\n\n\n");
        if (killer.isBoss()) {
            System.out.printf("you have fallen.. %s laughs as he continues his onslaught.\n..Without you, many innocent lives end, here, now. do you accept this fate?\n", killer.getName());
        } else {
            System.out.println("you have fallen.. but will you get back up?");
        }
        System.out.printf("%-5s || %5s ", "fight", "end");
        String answer = input.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("continue") || answer.equalsIgnoreCase("fight")) {
            player.setCurrHP(player.getMaxHP());
            new fight(player, killer);
        } else {
            if (killer.isBoss()) {
                System.out.println("your light fades away..\n as you lose consciousness, the area surrounding goes up in a blaze. \n");
            } else {
                System.out.println("your light fades away..\n");
            }
            gameOverChecker = true;
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

