package javaarray;

import java.util.Arrays;

public class swapusingarray {
    public static void main(String[] args) {
        int [] array = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(array));
        swap (array, 0,4);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
         array[index1]=array[index2];
         array[index2]=temp;

    }
}
