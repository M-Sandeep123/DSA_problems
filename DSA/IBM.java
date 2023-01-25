package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IBM {
    public static void main(String args[]){
        double d = 8.0;
        String str = "+";
        int arr[] = {2,5,3,6,10,7};
        partition(arr,d,str);
    }

    private static void partition(int[] arr, double d, String str) {
        if(arr.length%2!=0 && str.length()>1){
            System.out.println("Invalid Input");
        }
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double val = 0;
                if(str == "+"){
                    val = arr[i]+arr[j];
                }else if (str == "-"){
                    val = arr[i]-arr[j];
                } else if (str == "*"){
                    val = arr[i]*arr[j];
                }else if (str == "/"){
                    val = arr[i]+arr[j];
                }
                if(val == d){
                    int a[] = {arr[i],arr[j]};
                    String s = Arrays.toString(a);
                    set.add(s);
                }
            }
        }
        System.out.println(set);
    }
}

