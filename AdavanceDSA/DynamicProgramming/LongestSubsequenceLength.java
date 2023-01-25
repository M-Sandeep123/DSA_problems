package AdavanceDSA.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequenceLength {
    public static void main(String args[]){
        int arr[] = {7,7,7,7,7,7,7};

        System.out.println(subsequenceLength(arr,arr.length));
    }

    private static int subsequenceLength(int[] arr, int n) {
        int lis[] = new int[n];
        for(int i=0;i<n;i++){
            lis[i] = 1;
        }
        int total = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int max = 1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[j]>=max){
                    max = 1+lis[j];
                }
            }
            lis[i] = max;
            if(total<max){
                total = max;
            }
        }
       return total;
    }
}
