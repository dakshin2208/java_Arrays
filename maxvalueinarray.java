package javaarray;

import java.util.Scanner;

public class maxvalueinarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array =new int[5];
       System.out.println("enter the number :");
       for (int i = 0; i < array.length; i++) {
           array[i]=in.nextInt();
       }
        System.out.println(maxvalue(array));
        }
        static int maxvalue(int[] array)
        {
            int max=array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i]>max){
                    max=array[i];
                }

            }
            return max;

    }
}
