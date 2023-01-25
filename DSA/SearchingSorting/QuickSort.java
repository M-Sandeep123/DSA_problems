package DSA.SearchingSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]){
        int arr[] = {5,4,6,7,8,4,6,4,10,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int st, int end) {
        if(st>=end){
            return;
        }

        int pI = pivotIndex(arr,st,end);
        quickSort(arr,st,pI-1);
        quickSort(arr,pI+1,end);
    }

    private static int pivotIndex(int[] arr, int st, int end) {
        int index = st-1;
        int i=st;
        while (i<end){
            if(arr[i]<=arr[end]){
                index++;
                swapValues(arr,i,index);
            }
            i++;
        }
        swapValues(arr,index+1,end);
        return index+1;
    }

    private static void swapValues(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
