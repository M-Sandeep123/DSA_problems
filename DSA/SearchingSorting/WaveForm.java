package DSA.SearchingSorting;

import java.util.Arrays;

public class WaveForm {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        waveForm(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void waveForm(int[] arr) {
        for(int i=1;i<arr.length-1;i=i+2){
            if(arr[i-1]>arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            } else if (arr[i]<arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
