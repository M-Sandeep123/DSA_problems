package AdavanceDSA.Trees;


public class HeightBalanced {
    public static void main(String args[]){
        int arr[] = {1,2,3};
        TreeNodes root = TreeImp.createTree(arr,0);
        System.out.println(isBalanced(root));
    }

    private static int isBalanced(TreeNodes root) {
        if(root==null){
            return 1;
        }
        if(isBalanced(root.getLeft())>1){
            return 0;
        }
        if(isBalanced(root.getRight())>1){
            return 0;
        }
        int leftHeight = height(root.getLeft());
        int rightHeight = height(root.getRight());
        if(Math.abs(leftHeight-rightHeight)>1){
            return 0;
        }
        return 1;
    }

    private static int height(TreeNodes node) {
        if(node==null){
            return 0;
        }
        int lh = height(node.getLeft());
        int rh = height(node.getRight());
        return Math.max(lh,rh)+1;
    }

}
