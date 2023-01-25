package DSA.LinkedList;

public class BreakTwoHalf {
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

        //splitTwoLists(head);
        breakLL(head);
    }

    private static void splitTwoLists(SNode head) {
       if(head==null || head.getNext()==null){
           return;
       }
       boolean flag=true;
       SNode current=head, next = head.getNext().getNext();
       SNode temp = head;
       SNode fList=null,sList=null,point1=null,point2=null;
       while (temp != null && next!=null){
           temp = temp.getNext();
           if(flag){
               flag = false;
               if(fList == null){
                   fList = current;
                   fList.setNext(next);
                   point1 = fList.getNext();
               }else {
                   point1.setNext(next);
                   point1 = point1.getNext();
               }
           }else {
               flag = true;
               if(sList == null) {
                   sList = current;
                   sList.setNext(next);
                   point2 = sList.getNext();
               }else {
                   point2.setNext(next);
                   point2 = point2.getNext();
               }
           }
           current = temp;
           next = next.getNext();
       }
       point1.setNext(null);
       point2.setNext(null);
       SLinkList.traverse(fList);
       SLinkList.traverse(sList);
    }

    public static void breakLL(SNode head){
        SNode first = head,head1 = first;
        SNode second = head.getNext(),head2 = second;
        while (first != null && second.getNext()!=null){
            first.setNext(first.getNext().getNext());
            second.setNext(second.getNext().getNext());
            first = first.getNext();
            second = second.getNext();
        }
        first.setNext(null);
        second.setNext(null);
        SLinkList.traverse(head1);
        SLinkList.traverse(head2);
    }
}
