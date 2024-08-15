package Teams.day4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int [][] student = new int[5][5];
//
//        for (int i = 0; i < student.length; i++) {
//            for (int j = 0; j < student[i].length; j++) {
//                student[i][j] = in.nextInt();
//            }
//        }

        int[][] student = {
                {85, 92},
                {78, 85},
                {90, 88},
                {95, 94},
                {80, 87}
        };

        float math = 0;
        float sci = 0;

        for (int i = 0; i < student.length; i++) {
            math += student[i][0];
            sci +=student[i][1];

                System.out.println("student" + (i+1) + ": math:" + student[i][0]+ "science:" + student[i][0]);
            }
        System.out.println("avg maths:"+ math/5);
        System.out.println("avg sci:"+ sci/5);

        }

    }

