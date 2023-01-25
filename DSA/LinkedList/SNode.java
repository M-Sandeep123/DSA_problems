package DSA.LinkedList;

public class SNode {
    private int data;
    private SNode next;

    public SNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public SNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(SNode next) {
        this.next = next;
    }

}
