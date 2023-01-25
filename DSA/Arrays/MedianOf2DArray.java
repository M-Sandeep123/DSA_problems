package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MedianOf2DArray {
    public static void main(String args[]){
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        arr.add(list);
        list1.add(2);
        list1.add(5);
        list1.add(8);
        arr.add(list1);
        list2.add(3);
        list2.add(6);
        list2.add(9);
        arr.add(list2);
        System.out.println(findMedian(arr));
    }

    /**
     *
     * @param arr
     * @return
     *      {
     *          [1,2,5],
     *          [2,5,8],
     *          [3,6,9]
     *      }
     *      { [1,2,5],[2,5,8],[3,6,9] }
     *
     *      Total wrong
     */

    public static int  findMedian(List<List<Integer>> arr) {
        System.out.println(arr);
        for(int i=0,j=1;j<arr.size();i++,j++){
            sortLists(arr.get(i),arr.get(j));
        }
        System.out.println(arr);
        int count = 0;
        for(int i=0;i<arr.size();i++){
            count+=arr.get(i).size();
        }
        int ele = count/2;
            for(int i=0;i<arr.size();i++){
                for(int j=0;j<arr.get(i).size();j++){
                    if(ele==0){
                        return arr.get(i).get(j);
                    }
                    ele--;

                }
            }
        System.out.println(arr);

        return 0;
    }

    private static void sortLists(List<Integer> list1, List<Integer> list2) {
        int i = 0;
        int j = list2.get(0);
        while (i<list1.size()){
            if(list1.get(i)>j){
                int temp = list1.get(i);
                list1.set(i,j);
                list2.set(0,temp);
                j = list2.get(0);
            }
            i++;
        }
        insertionSort(list1);
        insertionSort(list2);
    }

    private static void insertionSort(List<Integer> list) {

        for(int i=1;i<list.size();i++){
            int val = list.get(i);
            int j = i;
            while (j-1>=0 && list.get(j-1)>val){
                list.set(j,list.get(j-1));
                j--;
            }
            list.set(j,val);
        }
    }
}
