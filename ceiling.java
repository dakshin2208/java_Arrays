package javaarray;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target =7;
        int ans  = ceilings(arr,target);
        System.out.println(ans);

    }

    static int ceilings(int[] arr, int target) {
        //what if the target is greater than the gratest number in array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return arr[start];

    }
}