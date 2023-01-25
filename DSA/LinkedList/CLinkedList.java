package DSA.LinkedList;

import java.util.LinkedList;

public class CLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<6;i++){
            list.add(i);
        }

        System.out.println(list.remove(2));

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
