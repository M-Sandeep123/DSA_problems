package AdavanceDSA.Trees;


public class LowestCommonAncestor {
    public static void main(String args[]){
        int arr[] = {10,22,11,13,14,16};
        TreeNodes root = createTree(arr,0);
        TreeNodes lca = findLCA(root,null,null);
    }

    private static TreeNodes findLCA(TreeNodes root, TreeNodes p , TreeNodes q) {
            if (root==null) {
                return null;
            }
            if (root==p || root==q) {
                return root;
            }
            TreeNodes left = findLCA(root.getLeft(), p, q);
            TreeNodes right = findLCA(root.getRight(), p, q);
            if (left!= null && right!=null) {
                return root;
            }
            else if (left!=null) {
                return left;
            }
            return right;
    }

    private static TreeNodes createTree(int[] arr, int index) {
        if(index >= arr.length){
            return null;
        }
        TreeNodes root = new TreeNodes(arr[index]);
        root.setLeft(createTree(arr,2 * index+1));
        root.setRight(createTree(arr,2*index+2));
        return root;
    }
}
