package AdavanceDSA.Trees;

import java.util.ArrayList;

/**
 *  TC  = O(n)
 *  and SC = O(1)
 */

public class MorrisTraversal {
    public static void main(String args[]){
        Node root = null;

        root = BSTImp.insert(root,5);
        BSTImp.insert(root,2);
        BSTImp.insert(root,7);
        BSTImp.insert(root,1);
        BSTImp.insert(root,3);
        BSTImp.insert(root,6);
        BSTImp.insert(root,8);
        BSTImp.insert(root,9);

        System.out.println(morrisTraversal(root));
    }

    public static ArrayList<Integer> morrisTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        Node cur = root;
        while (cur !=null){
            if(cur.getLeft() == null){
                list.add(cur.getData());
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
                    list.add(cur.getData());
                    cur = cur.getRight();
                }
            }
        }

        return list;
    }
}
