package Teams.day3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int ans = fact(num);

        System.out.println("factorial of " + num + " is " + ans);


    }
    static int fact(int fact){
        if(fact == 1){
            return 1;
        }else{
            return fact * fact(fact-1);
        }
    }


}
