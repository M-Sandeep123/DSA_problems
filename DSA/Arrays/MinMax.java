package DSA.Arrays;

import java.util.Arrays;

public class MinMax {
    public static void main(String args[]){
        int arr[] = {6,5,4,8,9,10};
        System.out.println(Arrays.toString(minMax(arr)));
    }
    private static int[] minMax(int[] arr) {
        int min =arr[0],max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int reArr[] = {min,max};
        return reArr;
    }
}
