package Teams.day3;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String password = "secret@123";

        while(true){
            String an = in.next();

            if(an.equals(password)){
                System.out.println("password accepted");
                break;
            }else{
                System.out.println("incorrect try again ");
            }


        }






    }
}
