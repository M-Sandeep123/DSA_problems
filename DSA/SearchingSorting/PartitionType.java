package DSA.SearchingSorting;

import java.util.Arrays;

public class PartitionType {
    public static void main(String args[]){
        char nuts[] = {'a','g','f','d','e','b'};
        char bolts[] = {'d','e','b','a','g','f'};

        matchingNutsAndBolts(nuts,bolts,0,nuts.length-1);
        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));
    }

    private static void matchingNutsAndBolts(char[] nuts, char[] bolts, int st, int end) {
        if(st>=end){
            return;
        }
        int pI = partition(nuts,st,end,bolts[end]);
        partition(bolts,st,end,bolts[end]);
        matchingNutsAndBolts(nuts,bolts,st,pI-1);
        matchingNutsAndBolts(nuts,bolts,pI+1,end);
    }

    private static int partition(char[] nuts, int st, int end, char pivotEle) {
        int index =st-1;
        int i=st;
        while (i<end){
            if(nuts[i]<pivotEle){
                index++;
                swapValues(nuts,index,i);
            } else if (nuts[i]==pivotEle) {
                swapValues(nuts,i,end);
                i--;
            }
            i++;
        }
        swapValues(nuts,index+1,end);

        return index+1;
    }

    private static void swapValues(char[] arr, int i, int index) {
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
