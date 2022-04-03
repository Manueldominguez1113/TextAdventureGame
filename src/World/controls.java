package World;

import java.lang.Math;
import java.lang.invoke.StringConcatFactory;
import java.lang.reflect.Method;
import java.util.Scanner;

public class controls {
    static Scanner scan = new Scanner(System.in);


    public static String input() {
        return scan.next();
    }

    public static String input(String... restrictions) {
        String inp = scan.next();
        for (String restriction : restrictions) {
            if (inp.equalsIgnoreCase(restriction)) {
                return inp;
            }
        }
        System.out.println("hmm.. i dont understand what " + inp + " is.. let me think again about this..");
        return input(restrictions);
    }

    public static String longInput() {

        return scan.nextLine();

    }

    public static int choice(int optionLimit) {
        int inp = scan.nextInt();
        if (inp > optionLimit || inp <= 0) {
            System.out.println("..that- wasn't even one of the options. try again.");
            return choice(optionLimit);
        }
        return inp;
    }

    public static int roll(int max) {
        double die = Math.floor(Math.random() * max + 1);
        return (int) die;

    }
}
