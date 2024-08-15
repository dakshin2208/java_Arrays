package Teams.day4;

import java.util.Arrays;
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        for (int j : arr) {
//            System.out.println(Arrays.toString(arr));
//        }
        System.out.println(Arrays.toString(arr));

        float ava = 0;

        int high = arr[0];

        int low = arr[0];

        for (int k = 0; k < arr.length; k++) {
            ava += arr[k];

            if(arr[k] > high){
                high = arr[k];
            }
            if(arr[k] < low){
                low = arr[k];
            }
        }

        System.out.println(ava/5);

        System.out.println(high);

        System.out.println(low);

    }
}
