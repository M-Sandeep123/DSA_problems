package AdavanceDSA.Trees;

public class AVLTree {
    public static void main(String args[]){
        Node root = insert(null,1);
        root = insert(root,2);
        root = insert(root,3);
        root = insert(root,4);
        root = insert(root,5);
        root = insert(root,6);
        root = insert(root,7);
        root = insert(root,8);
        System.out.println(root.getData());
    }

    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        } else if (key < root.getData()) {
            root.setLeft(insert(root.getLeft(),key));
        } else if (key > root.getData()) {
            root.setRight(insert(root.getRight(),key));
        }else {
            return root;
        }

        root.setHeight(1+maxHeight(height(root.getLeft()),height(root.getRight())));

        int balance = balanceFactor(root);

        if(balance>1 && key < root.getLeft().getData()){
            return rightRotation(root);
        }
        if(balance<-1 && key > root.getRight().getData()){
            return leftRotation(root);
        }
        if(balance>1 && key > root.getLeft().getData()){
            root.setLeft(leftRotation(root.getLeft()));
            return rightRotation(root);
        }
        if(balance<-1 && key < root.getRight().getData()){
            root.setRight(rightRotation(root.getRight()));
            return leftRotation(root);
        }

        return root;
    }

    private static Node leftRotation(Node node) {
        Node rightTree = node.getRight();
        Node rightLeftSubTree = rightTree.getLeft();

        rightTree.setLeft(node);
        node.setRight(rightLeftSubTree);

        node.setHeight(1+maxHeight(height(node.getLeft()), height(node.getRight())));
        rightTree.setHeight(1+maxHeight(height(rightTree.getLeft()), height(rightTree.getRight())));
        return rightTree;
    }

    private static Node rightRotation(Node node) {
       Node leftTree = node.getLeft();
       Node leftRightSubTree = leftTree.getRight();

       leftTree.setRight(node);
       node.setLeft(leftRightSubTree);

       node.setHeight(1+maxHeight(height(node.getLeft()), height(node.getRight())));
       leftTree.setHeight(1+maxHeight(height(leftTree.getLeft()), height(leftTree.getRight())));
       return leftTree;
    }


    private static int maxHeight(int lh, int rh) {
        return lh > rh ? lh : rh;
    }

    private static int balanceFactor(Node node) {
        if(node == null){
            return 0;
        }
        return height(node.getLeft())-height(node.getRight());
    }

    public static int height(Node node){
        if(node == null){
            return 0;
        }
        return node.getHeight();
    }
}
