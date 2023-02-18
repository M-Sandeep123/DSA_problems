import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Batch {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //int arr[] = {1,2,3,4,5};
        //printSumTri(arr);
        System.out.println(adjDuplicate("aadbbddddgggghf"));
    }

    public static void printSumTri(int[] arr) {
        ArrayList<String> list = new ArrayList<>();
        list.add(Arrays.toString(arr));
        while (arr.length>1){
            int i=0,j=1,dummy[]=new int[arr.length-1];
            while (j<arr.length){
                dummy[i] = arr[i]+arr[j];
                i++;
                j++;
            }
            list.add(Arrays.toString(dummy));
            arr = dummy;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }

    public static String adjDuplicate(String str){
        if(str.length()<=1){
            return ""+str;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        String newStr = adjDuplicate(str);
        if(ch != newStr.charAt(0)){
            return ch+newStr;
        }
        return newStr.substring(1);
    }
}
