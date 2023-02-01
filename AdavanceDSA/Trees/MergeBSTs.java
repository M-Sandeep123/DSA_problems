package AdavanceDSA.Trees;

import java.util.ArrayList;
import java.util.List;

public class MergeBSTs {
    public static void main(String args[]){
        Node root = BSTImp.insert(null,1);
        root = BSTImp.insert(root,2);
        root = BSTImp.insert(root,3);
        root = BSTImp.insert(root,4);
        root = BSTImp.insert(root,5);
        root = BSTImp.insert(root,6);
        root = BSTImp.insert(root,7);
        Node root1 = BSTImp.insert(root,8);
        root = BSTImp.insert(null,10);
        root = BSTImp.insert(root,20);
        root = BSTImp.insert(root,30);
        root = BSTImp.insert(root,40);
        root = BSTImp.insert(root,50);
        root = BSTImp.insert(root,60);
        Node root2 = BSTImp.insert(root,70);
        System.out.println(mergerBst(root1, root2));
    }

    private static List<Integer> mergerBst(Node root1, Node root2) {
        List<Integer> l1 = MorrisTraversal.morrisTraversal(root1);
        List<Integer> l2 = MorrisTraversal.morrisTraversal(root2);
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while (i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
                res.add(l1.get(i));
                i++;
            }else {
                res.add(l2.get(j));
                j++;
            }

        }
        if(i<l1.size()){
            while (i<l1.size()){
                res.add(l1.get(i));
                i++;
            }
        }else {
            while (j<l2.size()){
                res.add(l2.get(j));
                j++;
            }
        }
        return res;
    }
}
