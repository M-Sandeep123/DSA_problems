package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *  [2,0,2,1,1,0]
 */
public class Sort012s {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        sortColors(arr);
        System.out.println(arr);
    }

    public static void sortColors(List<Integer> arr) {
        // Write your code here
        int i=0,j=0,k=arr.size()-1;
        while(j<=k){
            if(arr.get(j)==0 && j>i){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i++;
            }
            else if(arr.get(j)==2 && j < k){
                int temp = arr.get(k);
                arr.set(k,arr.get(j));
                arr.set(j,temp);
                k--;
            }else{
                j++;
            }
        }
    }
}
