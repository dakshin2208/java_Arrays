package javaarray;

public class binarysearch2 {
    public static void main(String[] args) {
        int[] arr = {-18, -2, -1, 0, 1, 5, 7, 11, 17, 22, 36, 88};
        int target = 0;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end= mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
