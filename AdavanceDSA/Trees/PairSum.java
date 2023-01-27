package AdavanceDSA.Trees;

import java.util.HashMap;
import java.util.HashSet;

public class PairSum {
    public  static void main(String args[]){
        Node root = null;

        root = BSTImp.insert(root,5);
        BSTImp.insert(root,2);
        BSTImp.insert(root,7);
        BSTImp.insert(root,1);
        BSTImp.insert(root,3);
        BSTImp.insert(root,6);
        BSTImp.insert(root,8);
        BSTImp.insert(root,9);
        System.out.println(pairSumExist(root,4));
    }

    private static boolean pairSumExist(Node root, int k) {
        HashSet<Integer> set = new HashSet<>();
        Node cur = root;
        while (cur !=null){
            if(cur.getLeft() == null){
               int ele = Math.abs(k- cur.getData());
               if(set.contains(ele)) return true;
                set.add(cur.getData());
                cur  = cur.getRight();
            }else {
                Node prev = cur.getLeft();
                while (prev.getRight() != null && prev.getRight() != cur){
                    prev = prev.getRight();
                }
                if(prev.getRight() == null){
                    prev.setRight(cur);
                    cur = cur.getLeft();
                }else {
                    prev.setRight(null);
                    int ele = Math.abs(k- cur.getData());
                    if(set.contains(ele)) return true;
                    set.add(cur.getData());
                    cur  = cur.getRight();
                    cur = cur.getRight();
                }
            }
        }
        return false;
    }
}
