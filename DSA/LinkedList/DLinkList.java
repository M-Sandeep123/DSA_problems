package DSA.LinkedList;


public class DLinkList {
    public static void main(String args[]){

        DNode head = new DNode(10);
        DNode node1 = new DNode(20);
        DNode node2 = new DNode(30);
        DNode node3 = new DNode(40);
        DNode node4 = new DNode(50);
        DNode node5 = new DNode(60);

        head.setNext(node1);
        node1.setPrev(head);
        node1.setNext(node2);
        node2.setPrev(node1);
        node2.setNext(node3);
        node3.setPrev(node2);
        node3.setNext(node4);
        node4.setPrev(node3);
        node4.setNext(node5);
        node5.setPrev(node4);

        traverse(head);
        int size = listSize(head);
        System.out.println(size);
        System.out.println(dataPresent(head,50));
    }



    private static boolean dataPresent(DNode head, int data) {
        DNode temp = head;
        while (temp != null){
            if(temp.getData() == data) return true;
            temp = temp.getNext();
        }
        return false;
    }

    private static int listSize(DNode head) {
        DNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    private static void traverse(DNode head) {
        DNode temp = head;
        DNode temp2 = null;
        while (temp != null){
            System.out.print(temp.getData()+"->");
            temp2 = temp;
            temp = temp.getNext();
        }
        System.out.println();
        while(temp2 != null){
            System.out.print(temp2.getData()+"=>");
            temp2 = temp2.getPrev();
        }
        System.out.println();
    }


}
