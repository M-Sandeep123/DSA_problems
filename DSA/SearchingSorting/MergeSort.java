package DSA.SearchingSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {101,25,66,10,15,9,100,99};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        sortParts(arr,start,mid,end);
    }

    private static void sortParts(int[] arr, int start, int mid, int end) {
        int temp[] = new int[arr.length];
        int tIndex = start;

        int leftS = start, rightS = mid+1;
        while (leftS<=mid && rightS<=end){
            if(arr[leftS]<=arr[rightS]){
                temp[tIndex] = arr[leftS];
                tIndex++;
                leftS++;
            }else {
                temp[tIndex] = arr[rightS];
                tIndex++;
                rightS++;
            }
        }
        while (leftS<=mid){
            temp[tIndex] = arr[leftS];
            tIndex++;
            leftS++;
        }
        while (rightS<=end){
            temp[tIndex] = arr[rightS];
            tIndex++;
            rightS++;
        }
        /**
         * copy the sorted temp array in main array
         */
        for(int i=start;i<=end;i++){
            arr[i] = temp[i];
        }
    }
}
