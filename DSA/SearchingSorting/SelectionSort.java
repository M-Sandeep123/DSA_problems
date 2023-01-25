package DSA.SearchingSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int arr[] = {8,8,2,8,4,6,2,1,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
