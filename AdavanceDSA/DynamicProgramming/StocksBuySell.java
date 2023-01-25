package AdavanceDSA.DynamicProgramming;

public class StocksBuySell {
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr,arr.length));
    }

    private static int maxProfit(int[] arr, int n) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }else {
                int profit = arr[i] - minPrice;
                maxProfit+=profit;
                minPrice = Integer.MAX_VALUE;
            }
        }

        return maxProfit;
    }
}
