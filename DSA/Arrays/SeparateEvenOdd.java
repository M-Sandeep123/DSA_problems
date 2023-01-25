package DSA.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String args[]){
        int arr[] = {3,2,6,5,7,8,9,4,1};
        System.out.println(Arrays.toString(evenOdd(arr)));
    }

    private static int[] evenOdd(int[] arr) {
        int st=0,end=arr.length-1;
        while(st<end){
           if(arr[st]%2 == 0){
               st++;
           }
           if(arr[end]%2 !=0){
               end--;
           }
           if(arr[st]%2 != 0 && arr[end]%2 ==0){
               int temp = arr[st];
               arr[st] = arr[end];
               arr[end] = temp;
           }

        }
        return arr;
    }
}
