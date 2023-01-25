package DSA;

import java.util.Scanner;

public class TowerOFAnnoy {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfSteps(n,'s','d','a'));
    }

    private static int noOfSteps(int n, char s, char d, char a) {
        if(n==1) return 1;
        return noOfSteps(n-1,s,d,a)+1+noOfSteps(n-1,a,d,s);
    }


}
