package DSA.SearchingSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {2,5,6,8,4,9};
       // System.out.println(Arrays.toString(recBubbleSort(arr,0)));f
        //recBubbleSort(arr,0);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     public static void bubbleSort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag){
                break;
            }
        }
     }

    private static void recBubbleSort(int[] arr,int n) {
        if(n>=arr.length){
            return;
        }
        for(int i=n+1;i<arr.length;i++){
            if(arr[n]>arr[i]){
                int temp = arr[n];
                arr[n] = arr[i];
                arr[i] = temp;
            }
        }
        recBubbleSort(arr,n+1);
    }
}
