package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * A[] = {2,1,5,6,2,3}
 */
public class MaxRectangleArea {
    public static void main(String args[]){
        List<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        System.out.println(largestArea(arr));

    }

    public static int largestArea(List<Integer> arr) {
        // Write your code here
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            int height = arr.get(i);
            int cArea = currentArea(arr,height,i);
            if(cArea>maxArea){
                maxArea = cArea;
            }
        }
        return maxArea;
    }

    public static int currentArea(List<Integer> arr, int height,int index){
        int breadth = 0;
        int i=index;
        while (i>=0 && arr.get(i)>=height){
            breadth++;
            i--;
        }
        i=index+1;
        while (i<arr.size() && arr.get(i)>=height){
            breadth++;
            i++;
        }
        return height*breadth;
    }
}
