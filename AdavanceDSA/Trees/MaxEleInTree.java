package AdavanceDSA.Trees;


public class MaxEleInTree {
    public static void main(String args[]){
        int arr[] = {10,22,11,13,14,16};
        TreeNodes root = createTree(arr,0);
        int maxValue = findMaxVal(root);
        System.out.println(maxValue);
    }

    private static int findMaxVal(TreeNodes root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.getData();
        int lVal = findMaxVal(root.getLeft());
        int rVal = findMaxVal(root.getRight());

        return Math.max(max,Math.max(lVal,rVal));
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
