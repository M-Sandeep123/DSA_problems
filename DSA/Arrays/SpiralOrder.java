package DSA.Arrays;

public class SpiralOrder {
    public static void main(String args[]){
        int arr[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        spiralOrder(arr);
    }

    private static void spiralOrder(int[][] arr) {
        int topRight =0,leftTop = 0,bottomLeft = arr[0].length-1,rightBottom =arr[0].length-1;

        while (topRight<=rightBottom && leftTop<=bottomLeft){

            for(int i=topRight;i<=rightBottom;i++){
                System.out.print(arr[topRight][i]+" ");
            }
            topRight++;
            for(int i=topRight;i<=bottomLeft;i++){
                System.out.print(arr[i][rightBottom]+" ");
            }
            rightBottom--;
            for(int i=rightBottom;i>=leftTop;i--){
                System.out.print(arr[bottomLeft][i]+" ");
            }
            bottomLeft--;
            for(int i=bottomLeft;i>=topRight;i--){
                System.out.print(arr[i][leftTop]+" ");
            }
            leftTop++;
        }
    }
}