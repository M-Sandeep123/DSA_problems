package DSA.LinkedList;

public class RecRev {
    public static void main(String args[]){
        SNode head = new SNode(10);
        SNode node1 = new SNode(20);
        SNode node2 = new SNode(30);
        SNode node3 = new SNode(40);
        SNode node4 = new SNode(50);
        SNode node5 = new SNode(60);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        SLinkList.traverse(recRev(head));
    }

    private static SNode recRev(SNode node) {

        if(node.getNext() == null){
            return  node;
        }
        SNode newHead = recRev(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
       /** if(newHead.getNext() == null){
            newHead.setNext(node);
            newHead.getNext().setNext(null);
            return newHead;
        }else{
            SNode temp = newHead;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            temp.getNext().setNext(null);
        }*/
        return newHead;
    }
}
