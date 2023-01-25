package DSA.Arrays;

import java.util.Arrays;

public class Max1sRow{
    public static void main(String args[]){
        int arr[][] = {
                {0,0,0,1},
                {0,1,1,1},
                {1,1,1,1},
                {0,0,0,0}
        };
        System.out.println(max1sRow(arr));
    }

    private static int max1sRow(int[][] arr) {
        int row=0,point=0,i=arr.length-1;
        while(i>=0 && point<arr.length){
            if(arr[point][i] == 0){
                point++;
            }else{
                row=point;
                i--;
            }
        }

        return row;
    }
}
