package Teams.day4;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String [] name = new String[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < name.length; i++) {
           name[i] = in.next();
        }

        for (String s : name) {
            System.out.println("hello :" + s);
        }
    }
}
