package Teams.day3;

import java.util.Scanner;

public class Nnatural {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

         int count = 0;

        for (int i = 0; i <= a; i++) {

            count += i ;
        }
        System.out.println("the sum of "+ a +"natural numbers " + count);
    }
}
