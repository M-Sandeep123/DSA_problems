package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingPositiveInt {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        System.out.println(findKthPositive(list,5));
    }

    private static int findKthPositive(List<Integer> list, int k) {
        int kTerms = 0;
        for (int i=0,j=1;j<list.size();i++,j++){
            int sum=list.get(j)-list.get(i)-1;
            if(sum+kTerms>k){
                return kthPos(list,sum,kTerms,k,i);
            }
            if(sum+kTerms==k){
                return list.get(i)+sum;
            }
            kTerms+=sum;
        }
        return 0;
    }

    private static int kthPos(List<Integer> list, int sum, int kTerms, int k, int index) {
        while(sum+kTerms>k){
            sum--;
        }
        return list.get(index)+sum;
    }
}
