package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SwitchOnLamps {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(1);

        System.out.println(lamps(arr));
    }

    public static int lamps(List<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                arr.set(i,1);
                count++;
                lampsOn(arr, i);
            }
        }
        return count;
    }

    public static void lampsOn(List<Integer> arr,int st){
        for(int i=st+1;i<arr.size();i++){
            if(arr.get(i)==0){
                arr.set(i,1);
            }else{
                arr.set(i,0);
            }
        }
    }
}
