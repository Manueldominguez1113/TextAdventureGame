import java.util.Scanner;
import java.util.Random;
public class fight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome! what is your name, hero?");
        String name =input.nextLine();
        System.out.format("%s, are you sure? Y/N\n",name);
        String confirm= input.next();
        while(confirm.equalsIgnoreCase("n")){
            System.out.println("Name:");
            name= input.next();
            System.out.format("%s, are you sure? Y/N\n",name);
             confirm= input.next();
        }
        int hp = 5;
        int atk = 5;
        int def = 5;
        System.out.format("%s's stats:\nHP:%s\nATK:%s\nDEF:%s\n",name,hp,atk,def);
        System.out.println("would you like to change any stats or will these do? Y/N");// which do you want to change
        String changeStats = input.next();
        while(changeStats.equalsIgnoreCase("y")){
            System.out.println("which will you change? HP, ATK, or DEF?");
            String change= input.next();
            if (change.equalsIgnoreCase("hp")){
                System.out.print("HP: ");
                hp = input.nextInt();
            }
            if (change.equalsIgnoreCase("atk")){
                System.out.print("ATK: ");
                atk = input.nextInt();
            }
            if (change.equalsIgnoreCase("def")){
                System.out.print("DEF: ");
                def = input.nextInt();
            }
            System.out.println("anymore changes? Y/N");
            changeStats=input.next();
        }
        System.out.println("declare enemy stats");

    }
    public static void enemy(){


    }

}

