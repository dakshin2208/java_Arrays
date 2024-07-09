package javaarray;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //array input
        //array in primitive
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //arry in object
    String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();

        }
        System.out.println(Arrays.toString(str));



    }

}
