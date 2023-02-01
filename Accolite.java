import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Accolite {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int arr[] = {5,5};
        System.out.println(minSubSize(arr,arr.length));
    }

    private static int minSubSize(int[] arr, int n) {
        int freq=Integer.MIN_VALUE, ele=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i])+1;
                map.put(arr[i],val);
                if(freq<val) {
                    freq = val;
                    ele = arr[i];
                }
            }else {
                map.put(arr[i],1);
            }
        }
        if(freq <= 1) return 0;
        int minSubSize = Integer.MAX_VALUE;
        int i = 0,count=0;
        while (i<n){
            if(arr[i] == ele){
                int j=i;
                while (j<n && arr[i] == arr[j]) {
                    count++;
                    j++;
                }
                i = j;
            }else {
                i++;
            }
            if(count!=0 && count < minSubSize) {
                minSubSize = count;
                count = 0;
            }
        }
        return minSubSize;
    }
}

