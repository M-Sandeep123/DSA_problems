package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LargestNumber {
    public static void main(String args[]){
        //int arr[] = {3,30,34,5,9};
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(30);
        arr.add(34);
        arr.add(5);
        arr.add(9);
        System.out.println(largestNumber(arr));
    }

    private static String largestNumber(List<Integer> arr) {

        for(int i=0;i<arr.size();i++){
            String num1 = Integer.toString(arr.get(i));
           for(int j=i+1;j<arr.size();j++){
               String num2 = Integer.toString(arr.get(j));
               if(getNum(num1,num2)){
                   int temp = arr.get(i);
                   int temp2 = arr.get(j);
                   arr.set(i,temp2);
                   arr.set(j,temp);
               }
           }
        }

        return arr.toString();
    }

    private static boolean getNum(String  num1, String num2) {
        int f = Integer.parseInt(num1+num2);
        int s = Integer.parseInt(num2+num1);
        if(f>=s){
            return false;
        }
        return true;
    }
}
