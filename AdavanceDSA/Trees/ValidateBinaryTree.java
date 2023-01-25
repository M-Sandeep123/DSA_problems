package AdavanceDSA.Trees;

public class ValidateBinaryTree {
    public static void main(String args[]){

    }

    public static boolean isBalance(TreeNodes root){
        return checkBalance(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    private static boolean checkBalance(TreeNodes root, int maxVal,int minVal) {
        if(root == null){
            return true;
        }
        if(!checkBalance(root.getRight(),root.getData(), root.getData())) return false;
        if(root.getData()>maxVal) return false;
        checkBalance(root.getRight(), root.getData(), root.getData());
        return true;
    }
}
