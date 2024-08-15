package Teams.day3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner in = new Scanner(System.in);

        int guess ;

        int a = random.nextInt(1,100);

        while(true){
//            int a = random.nextInt(1,100);

            guess = in.nextInt();

            if(guess == a){
                System.out.println("Conguratulation ! you guessed the correct answer");
                break;
            } else if (guess > a) {
                System.out.println("too high");
            }else{
                System.out.println("too low");
            }
        }

    }


}
