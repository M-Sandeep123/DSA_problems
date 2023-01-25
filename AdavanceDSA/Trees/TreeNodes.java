package AdavanceDSA.Trees;

public class TreeNodes {
    private int data;
    private TreeNodes left;
    private TreeNodes right;

    public TreeNodes(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodes getRight() {
        return right;
    }

    public void setRight(TreeNodes right) {
        this.right = right;
    }

    public TreeNodes getLeft() {
        return left;
    }

    public void setLeft(TreeNodes left) {
        this.left = left;
    }
}
