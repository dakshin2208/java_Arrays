package javaarray;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -2, -1, 0, 1, 5, 7, 11, 17, 22, 36, 88};
        int target = 0;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        //find wheather the arr is sorted in asc or des
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }else{
                    if(target>arr[mid]){
                        end=mid-1;
                    } else if (target<arr[mid]) {
                        start=mid+1;

                    }
                }
            }

        }
        return -1;
    }
}
