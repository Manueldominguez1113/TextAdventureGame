package World;

import java.lang.Math;
import java.util.Scanner;

public class Controls {
    static Scanner scan = new Scanner(System.in);


    public static String input() {
        return scan.next();
    }

    public static String longInput() {

        return scan.nextLine();

    }

    public static int choice(){
        return scan.nextInt();
    }
    public static int roll(int max,int min) {
        double die = Math.floor(Math.random()*max -min)-min;
        return (int) die;

    }
}
