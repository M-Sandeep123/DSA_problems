package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        List<List<Integer>> list= arrPermutation(arr);
        System.out.println(list);
//        int arr[] = {1,2,3};
//        List<List<Integer>> res = new ArrayList<>();
//        permutation(arr,0,arr.length-1,res);
//        System.out.println(res);
    }

    private static List<List<Integer>> arrPermutation(List<Integer> list) {
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        List<List<Integer>> res = new ArrayList<>();
         resultPermutation(arr,0,arr.length-1,res);
        return res;
    }

    private static void resultPermutation(int[] arr,int st,int end,List<List<Integer>> list) {

        if(st == end){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(arr[i]);
            }
            list.add(l);
            return;
        }

        for(int i=st;i<=end;i++){
            arr = swap(arr,st,i);
            resultPermutation(arr,st+1,end,list);
            arr = swap(arr,st,i);
        }
    }

    private static int[] swap(int[] arr, int st, int i) {
        int temp = arr[st];
        arr[st] = arr[i];
        arr[i] = temp;
        return arr;
    }

    private static void permutation(int[] arr, int st, int end,List<List<Integer>> list) {
        if(st == end){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(arr[i]);
            }
            list.add(l);
            return;
        }

        for(int i=st;i<=end;i++){
            arr = swap(arr,st,i);
            permutation(arr,st+1,end,list);
            arr = swap(arr,st,i);
        }
    }
}
