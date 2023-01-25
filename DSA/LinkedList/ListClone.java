package DSA.LinkedList;

import java.util.HashMap;
import java.util.List;

public class ListClone {
    public static void main(String args[]){
        ListNodeM head = new ListNodeM(10);
        ListNodeM node1 = new  ListNodeM(20);
        ListNodeM node2 = new  ListNodeM(30);
        ListNodeM node3 = new  ListNodeM(40);
        ListNodeM node4 = new  ListNodeM(50);
//        ListNodeM node5 = new  ListNodeM(60);
//        ListNodeM node6 = new  ListNodeM(70);
//        ListNodeM node7 = new  ListNodeM(80);

        head.setNext(node1);
        head.setRandom(node2);
        node1.setNext(node2);
        node1.setRandom(node4);
        node2.setNext(node3);
        node2.setRandom(node3);
        node3.setNext(node4);
        node3.setRandom(node4);
        node4.setRandom(node1);

//        node4.setNext(node5);
//        node5.setNext(node6);
//        node6.setNext(node7);

        traverse(randomListClone(head));

    }

    public static ListNodeM randomListClone(ListNodeM head){
        if(head==null || head.getNext()==null){
            return head;
        }
        HashMap<ListNodeM,ListNodeM> map = new HashMap<>();
        ListNodeM temp = head;
        while(temp!=null){
            ListNodeM newNode = new ListNodeM(temp.getData());
            map.put(temp,newNode);
            temp = temp.getNext();
        }
        temp = head;
        while(temp!=null){
            ListNodeM node = map.get(temp);
            node.setNext(temp.getNext());
            node.setRandom(temp.getRandom());
            temp = temp.getNext();
        }
        return map.get(head);
    }

    public static void traverse(ListNodeM head) {
        ListNodeM temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+" => ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    private static SNode basicClone(SNode head) {
        if(head==null || head.getNext()==null){
            return head;
        }
        SNode temp = head;
        SNode next= null;
        SNode newHead = null;
        while(temp!=null){
            SNode node = new SNode(temp.getData());
            if(newHead == null){
                newHead = node;
                next = node;
            }else {
                next.setNext(node);
                next = node;
            }
            temp = temp.getNext();
        }
        return newHead;
    }
}

class ListNodeM{
    private int data;
    private ListNodeM next;
    private ListNodeM random;

    public ListNodeM(int data) {
        this.data = data;
    }

    public ListNodeM getRandom() {
        return random;
    }

    public void setRandom(ListNodeM random) {
        this.random = random;
    }

    public ListNodeM getNext() {
        return next;
    }

    public void setNext(ListNodeM next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
