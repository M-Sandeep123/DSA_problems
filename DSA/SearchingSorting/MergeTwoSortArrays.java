package DSA.SearchingSorting;

import java.util.Arrays;

public class MergeTwoSortArrays {
    public static void main(String args[]){
        int arr[] = {1,2,3,7,0,0,0};
        int arr2[] = {5,6,7};
        sortInOne(arr,arr2,4,arr2.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortInOne(int[] arr, int[] arr2, int m, int n) {
        int point = m+n-1;
        int fEnd = m-1, sEnd = n-1;
        while (point>=0&&fEnd>=0&&sEnd>=0){
            if(arr[fEnd]>=arr2[sEnd]){
                arr[point] = arr[fEnd];
                fEnd--;
            }else{
                arr[point] = arr2[sEnd];
                sEnd--;
            }
            point--;
        }
        while(sEnd>=0){
            arr[point] = arr2[sEnd];
            point--;
            sEnd--;
        }
    }
}
