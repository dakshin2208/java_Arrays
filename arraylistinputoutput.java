package javaarray;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistinputoutput {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter how many need to store in list");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(in.nextInt());
        }
       //get item at any index
        for (int i = 0; i < size; i++) {
           System.out.println(arr.get(i));//pass index

        }
        System.out.println(arr); ///print entire array list..
    }
}
