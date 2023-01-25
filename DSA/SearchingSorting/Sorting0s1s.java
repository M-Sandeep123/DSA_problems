package DSA.SearchingSorting;


import java.util.Arrays;

public class Sorting0s1s {
    public static void main(String args[]){
        int arr[] = {1,0,1,0,1,2,1,2,1,0,1,0,1,0};
        sort0s1s2s(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort0s1s(int[] arr) {
        int st = 0, end=arr.length-1;
        while (st<end){
            if(arr[st]==1 && arr[end]==0){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
            if(arr[st]==0){
                st++;
            }
            if(arr[end]==1){
                end--;
            }
        }
    }

    public static void sort0s1s2s(int arr[]){
        int st=0,mid=0,end=arr.length-1;
        while (mid<=end){
            if(arr[mid]==1){
                mid++;
            } else if(arr[mid]==0) {
                int temp = arr[st];
                arr[st] = arr[mid];
                arr[mid] = temp;
                st++;
                mid++;
            }else {
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
        }
    }
}
