package Teams.day3;

import java.util.Random;
import java.util.Scanner;

public class GuessNum2 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner in = new Scanner(System.in);

        int guess ;

        int a = random.nextInt(1,10);

        do{
            guess = in.nextInt();
            if(guess > a){
                System.out.println("too low");
            }else{
                System.out.println("too high");
            }

        }while(guess == a);

        System.out.println("conguratulation ! , you guessed the correct number");






    }
}
