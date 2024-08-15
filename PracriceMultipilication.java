package Teams.day3;

import java.util.Random;
import java.util.Scanner;

public class PracriceMultipilication {
    public static void main(String[] args) {
        Random a = new Random();

        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true){
            int num1 = a.nextInt(1,10);
            int num2 = a.nextInt(1,10);
            System.out.println("Welcome to multipilication practice program!");
            System.out.println("what is " + num1 +"*" + num2 +"?");
            System.out.print("enter your answer (or 0 or exit):");

            ans = in.nextInt();

            if(num1 * num2 == ans){
                System.out.println("correct!");
            }else {
                System.out.println("Incorrect . the answer is " + num1 * num2);
            }


            if(ans == 0 ){
                System.out.println("Thank you for praticipating");
                break;
            }






        }
    }
}
