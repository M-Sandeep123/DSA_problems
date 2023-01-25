package DSA.SearchingSorting;

import DSA.LinkedList.SNode;

import java.util.Arrays;


public class InsertionSort {
    public static void main(String args[]){
//        int arr[] = {8,8,2,8,4,6,2,1,10};
//       // insertionSort(arr);
//        recSort(arr,1);
//        System.out.println(Arrays.toString(arr));

    }
    private static void recSort(int[] arr, int i) {
        if(i>=arr.length){
            return;
        }
        int v = arr[i];
        int j = i;
        while (j-1>=0 && arr[j-1]>v){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = v;
        recSort(arr,i+1);
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int v = arr[i];
            int j = i;
            while(j-1>=0 && arr[j-1]>v){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = v;
        }
    }

    public static SNode insertionSortLL(SNode head){
        SNode current = head;
        SNode sortedHead = null;
        while (current!=null){
            SNode next = current.getNext();
            insertNode(current,sortedHead);
            current = next;

        }
        head = sortedHead;
        return head;
    }

    private static void insertNode(SNode current, SNode sortedHead) {
        if(sortedHead==null || sortedHead.getData()>= current.getData()){
            current.setNext(sortedHead);
            sortedHead = current;
        }else {
            SNode temp = sortedHead;
            while (temp.getNext()!=null && temp.getNext().getData()< current.getData()){
                temp = temp.getNext();
            }
            current.setNext(temp.getNext());
            temp.setNext(current);
        }
    }
}
