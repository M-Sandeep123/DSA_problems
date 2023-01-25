package DSA.Arrays;

public class NumberOfOpenedDoors {
    public static void main(String args[]){
        int n = 100;
        System.out.println(solve(n));
    }

    /**
     *      given N doors let say's
     * 1 ==> N.
     * 2 ==> N/2.
     * 3 ==>
     *
     *  solution is all the perfect square numbers are final state is opened.
     */
    private static int solve(int n) {
        int res = (int) Math.sqrt(n);
        return res;
    }
}
