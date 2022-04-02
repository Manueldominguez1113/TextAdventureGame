package World;

import java.util.Scanner;

public class Controls {
    static Scanner scan = new Scanner(System.in);


    public static void pressEnterKey() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {

    }
}
