package javaarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> list =new ArrayList<>(5);
//        list.add(44);
//        list.add(22);
//        list.add(23);
//        list.add(55);
//        list.add(434);
//        list.add(443);
//        list.add(999);
//        list.add(546);
//        System.out.println(list);
//        System.out.println(list.contains(999));
//        System.out.println(list);
//        System.out.println(list.set(3,999999));
//        System.out.println(list);
//        System.out.println(list.remove(5));
          ArrayList<Integer> list =new ArrayList<>(5);
        Scanner in =new Scanner(System.in);
          for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
          }
        for (int i = 0; i < 5; i++) {
            list.get(i);

        }



    }
}
