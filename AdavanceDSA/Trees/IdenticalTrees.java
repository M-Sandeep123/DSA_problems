package AdavanceDSA.Trees;

import java.util.ArrayList;

public class IdenticalTrees {
    public static void main(String args[]){
        int tree1[] = {2,4,3,1};
        int tree2[] = {2,1,4,3};
        System.out.println(isIndeticalTrees(tree1,tree2));
    }

    private static boolean isIndeticalTrees(int[] tree1, int[] tree2) {
        if(tree1[0]!=tree2[0] || tree1.length!=tree2.length) return false;
        int root = tree1[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i=1;i<tree1.length;i++){
            if(tree1[i]<root){
                left.add(tree1[i]);
            }else {
                right.add(tree1[i]);
            }
        }
        System.out.println(left + " "+ right);
        int lp=0,rp=0,i = 1;
        while (i<tree2.length){
            if(tree2[i]<root && left.get(lp)==tree2[i]){
                lp++;
            } else if (tree2[i]>root && right.get(rp)==tree2[i]) {
                rp++;
            }else {
                return false;
            }
            i++;
        }
        return true;
    }
}
