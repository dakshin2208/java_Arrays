package Teams.day4;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String[] name =new String[5];

        for (int i = 0; i < name.length; i++) {
            name[i] = in.next();
        }

        int max = name[0].length();

        int min = name[0].length();

        String longest = name[0];
        String smallest = name[0];

        for (int i = 0; i < name.length; i++) {

              if(max < name[i].length()){
                  max = name[i].length();
                  longest = name[i];
              }

              else if(min > name[i].length()){
                  min = name[i].length();
                  smallest = name[i];
              }
        }

        for (int i = name.length -1 ; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("longest name : " + longest);

        System.out.println("shortest name : "+ smallest);


    }
}
