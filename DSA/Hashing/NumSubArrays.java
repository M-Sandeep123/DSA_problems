package DSA.Hashing;

import java.util.HashMap;

public class NumSubArrays {
    public static void main(String args[]){
        int arr[] = {1,1,1,1,1};
        int k = 3;
        System.out.println(numSubArray(arr,k));
    }

    private static int numSubArray(int[] arr, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int val = sum-k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
