
import java.util.*;

public class Zomoso {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println(minSwaps(arr,n));
        Arrays.sort(arr);
        System.out.println(minCost(arr,n));
    }

    private static int minCost(int[] arr, int n) {
        int cost=0;
        int i=0;
        int j=n-1;
        while(i<j){
            cost+=(arr[j]-arr[i]);
            i++;
            j--;
        }
        return cost;
    }

    private static int minSwaps(int[] arr, int n) {
        int count = 0;
        for(int i=1;i<=n;i+=2){
            if(arr[i-1]!=0){
                count++;
            }
        }
        return count;
    }
}
