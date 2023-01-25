package AdavanceDSA.Trees;

public class isBalanceBST {
    public static void main(String args[]){
        Node root = BSTImp.insert(null,5);
        BSTImp.insert(null,5);
        BSTImp.insert(root,1);
        BSTImp.insert(root,7);
        BSTImp.insert(root,2);
        BSTImp.insert(root,3);
        System.out.println(isBST(root));
        System.out.println(isBalanced(root));
    }

    /**
     *
     * Method 1
     */
    static Node prev = null;
    private static int isBST(Node root) {
        if(root == null){
            return 1;
        }
        if(isBST(root.getLeft())!=1){
            return 0;
        }
        if(prev!=null && root.getData()<= prev.getData()){
            return 0;
        }
        prev = root;
        return isBST(root.getRight());
    }

    /**
     * Method 2
     */
    private static boolean isBalanced(Node root){
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValid(Node root, int min, int max) {
        if(root == null){
            return true;
        }
        if(root.getData()<min || root.getData() > max){
            return false;
        }
        return (isValid(root.getLeft(),min, root.getData()) && isValid(root.getRight(), root.getData(), max));
    }

}
