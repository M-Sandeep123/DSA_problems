package DSA.Arrays;


import java.util.ArrayList;
import java.util.List;

/**
 * Search an Element in Rotated Sorted Array
 */

public class SearchAnEle {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println(isElePrestnt(arr,0));
    }

    private static boolean isElePrestnt(List<Integer> arr, int target) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==target) return true;
        }
        return false;
    }
}
