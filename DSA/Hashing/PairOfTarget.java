package DSA.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class PairOfTarget {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,-4};
        int k = 6;
        System.out.println(Arrays.toString(findPair(arr,k)));
    }

    private static int[] findPair(int[] arr, int k) {
        int pair[] = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int val = k-arr[i];
           if(map.containsKey(val)){
               pair[0] = val;
               pair[1] = arr[i];
               return pair;
           }
           map.put(arr[i],1);
        }

        return pair;
    }
}
