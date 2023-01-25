package AdavanceDSA.Trees;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SymmetricOrNot {
    public static void main(String args[]){
        int arr[] = {1,2,2,3,4,4,3};
        TreeNodes root = TreeImp.createTree(arr,0);
        System.out.println(isTreeSymmetric(root));
    }

    private static boolean isSymmetric(TreeNodes root) {
        ArrayList<Integer> leftMap = new ArrayList<>();
        ArrayList<Integer> rightMap = new ArrayList<>();
        leftSubtree(root.getLeft(),leftMap);
        rightSubTree(root.getRight(),rightMap);
        return leftMap.equals(rightMap);
    }

    private static void leftSubtree(TreeNodes node, ArrayList<Integer> leftList) {
        if(node!=null){
            leftList.add(node.getData());
            leftSubtree(node.getLeft(),leftList);
            leftSubtree(node.getRight(),leftList);
        }
    }

    private static void rightSubTree(TreeNodes node, ArrayList<Integer> rightList) {
        if(node!=null){
            rightList.add(node.getData());
            leftSubtree(node.getLeft(),rightList);
            leftSubtree(node.getRight(),rightList);
        }
    }

    /**
     * Another way of solving same problem
     *
     */
    public static boolean isTreeSymmetric(TreeNodes root){
        if(root == null){
            return true;
        }
        return isMirror(root.getLeft(),root.getRight());
    }

    private static boolean isMirror(TreeNodes left, TreeNodes right) {
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.getData() == left.getData()){
            isMirror(left.getLeft(),right.getRight());
            isMirror(left.getRight(),right.getLeft());
        }else {
            return false;
        }
        return true;
    }
}
