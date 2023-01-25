package DSA.Arrays;

public class PosOfLastSelection {
    public static void main(String args[]){
        int n = 1;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return 2*solve(n/2);
    }
}
