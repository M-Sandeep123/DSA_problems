package DSA.LinkedList;

public class AddNumLL {
    public static void main(String args[]){
        SNode head = new SNode(1);
        SNode node1 = new SNode(9);
        SNode node2 = new SNode(9);
        SNode node3 = new SNode(9);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        SLinkList.traverse(addNumber(head,1));
    }

    public static int lastModified(int input1, int[] input2){
        int sum = 1;
        for(int i=input2.length-1;i>=0;i--){
            sum +=input2[i];
            if(sum>9){
                input2[i] = sum%10;
                sum = sum/10;
            }else {
                input2[i] = sum;
                break;
            }
        }
        int size=0;
        for(int i=0;i< input2.length;i++){
            if(input2[i]!=0){
                size++;
            }
        }
        return size;
    }

    private static SNode addNumber(SNode head, int num) {
        if(head.getNext()==null){
            head.setData(head.getData()+num);
            return head;
        }
        SNode revHead = SLinkList.reverLL(head);
        SNode temp = revHead;
        int carry = num;
        while (temp!=null){
            carry +=temp.getData();
            if(carry>9){
                temp.setData(carry%10);
                carry=carry/10;
            }else {
                temp.setData(carry);
                break;
            }
            temp = temp.getNext();
        }
         return SLinkList.reverLL(revHead);
    }
}
