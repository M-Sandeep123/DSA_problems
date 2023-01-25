package DSA.LinkedList;

import java.util.SortedMap;

public class PairRev {
    public static void main(String args[]){
        SNode head = new SNode(10);
        SNode node1 = new SNode(20);
        SNode node2 = new SNode(30);
        SNode node3 = new SNode(40);
        SNode node4 = new SNode(50);
        SNode node5 = new SNode(60);
        SNode node6 = new SNode(70);
        SNode node7 = new SNode(80);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

       // SLinkList.traverse(pairRecRev(head));
        SLinkList.traverse(kthPairRev(head,3));
    }

    private static SNode kthPairRev(SNode head, int k) {
        if(head == null || head.getNext() == null){
            return head;
        }
        SNode current = head;
        SNode prev = null;
        SNode next = null;
        int count =0;
        while(count<k && current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            count++;
        }

        if(next != null && next.getNext() != null){
            head.setNext(kthPairRev(next,k));
        }
        return prev;
    }

    private static SNode pairRecRev(SNode head) {
        if(head==null || head.getNext()==null){
            return head;
        }
        SNode newHead = head.getNext();
        SNode next = head.getNext().getNext();
        head.getNext().setNext(head);
        SNode newNode = pairRecRev(next);
        head.setNext(newNode);
        return newHead;
    }

    /**
     * This function is not working as excepted
     */
    private static SNode pairRev(SNode head) {
        if(head == null && head.getNext() == null){
            return head;
        }
        SNode newHead = head.getNext();
        while (true){
            if(head.getNext() == null || head.getNext().getNext() == null){
                break;
            }
            SNode next = head.getNext().getNext();
            head.getNext().setNext(head);
            head.setNext(next);
            head = next;
        }
        return newHead;
    }


}
