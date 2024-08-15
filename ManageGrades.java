package Teams.day4;

public class ManageGrades {
    public static void main(String[] args) {
         int[][] arr = {
                 {80,80,80,80},
                 {80,80,80,80},
                 {80,80,80,80},

         };
         float student1 = ava(arr,0);
         float student2 = ava(arr,1);
         float student3 = ava(arr,2);

         float maths = sub(arr , 0);
        float science = sub(arr , 1);
        float english = sub(arr , 2);
        float ps = sub(arr , 3);

        System.out.println("Ava score for each student:");
        System.out.println("student1" + student1);
        System.out.println("student2" + student2);
        System.out.println("student3" + student3);

        System.out.println("ava score for each subject:");

        System.out.println("maths :" + maths);
        System.out.println("science :" + science);
        System.out.println("english:" +english );
        System.out.println("ps :" + ps);

    }

    static int ava(int[][] arr,int index){
        int a = 0;
        for (int i = 0; i < arr[index].length; i++) {
            a +=arr[index][i];

        }
        return a/ arr[index].length;

    }

    static  int sub(int[][] arr , int index){
        int ava = 0;
        for (int i = 0; i < arr.length; i++) {
            ava += arr[i][index];
        }
        return ava/arr.length;
    }

}
