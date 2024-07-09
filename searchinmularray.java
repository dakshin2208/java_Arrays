package javaarray;

import java.util.Arrays;
import java.util.Scanner;

public class searchinmularray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("enter the value to search:");
        int target = in.nextInt();
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        }


    static int[] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }

            }


        }
        return new int[]{-1,-1};
    }
}
