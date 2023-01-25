package DSA.LinkedList;

public class SLinkList {
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

        traverse(head);
//        int len = size(head);
//        System.out.println(len);
//        isPresent(head,0);
//        SNode newHead = insert(head,0,70);
//        traverse(newHead);
//        SNode node = midNode(head);
//        System.out.println(node.getData());
        node5.setNext(node3);
        System.out.println(findLoop(head));
        System.out.println(loopStart(head).getData());
    }

    private static SNode loopStart(SNode head) {
        SNode fast = head.getNext();
        SNode point1=head,point2=null;
        SNode slow = head;
        while (fast.getNext()!=null && fast!=null){
            if(fast == slow){
                point2 = fast.getNext();
                break;
            }
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        //System.out.println(point1.getData()+" "+point2.getData());
        while(point1!=point2){
            point1 = point1.getNext();
            point2 = point2.getNext();
        }
        return point1;
    }

    private static boolean findLoop(SNode head) {
        SNode fast = head.getNext();
        SNode slow = head;
        while (fast.getNext()!=null && fast!=null){
            if(fast == slow){
                return true;
            }
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return false;
    }

    private static SNode midNode(SNode head) {
        SNode fPoint = head.getNext();
        SNode sPoint = head;
        while (fPoint.getNext()!=null && fPoint!= null){
            fPoint = fPoint.getNext().getNext();
            sPoint = sPoint.getNext();
        }
        return sPoint;
    }

    public static SNode insert(SNode head, int pos,int data) {
        SNode temp = head;
        SNode fNode = head;
        if(pos == 0){
            SNode newNode = new SNode(data);
            newNode.setNext(head);
            head = newNode;
            return head;
        }
        int count = 0;
        while (temp != null){
            count++;
            if(count == pos){
                SNode newNode = new SNode(data);
                newNode.setNext(temp);
                fNode.setNext(newNode);
                break;
            }
            fNode = temp;
            temp = temp.getNext();
        }
        return head;
    }

    public static boolean isPresent(DNode head, int data) {
        while (head != null){
            if(head.getData() == data)
                return true;
            head = head.getNext();
        }

        return false;
    }

    public static int size(SNode head) {
        SNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public static void traverse(SNode head) {
        SNode temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+" => ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public static SNode reverLL(SNode head){
        if(head==null && head.getNext()==null){
            return head;
        }
        SNode current = head;
        SNode next = null;
        SNode prev = null;
        while (current!=null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }
}
