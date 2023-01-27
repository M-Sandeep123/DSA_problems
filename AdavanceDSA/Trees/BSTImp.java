package AdavanceDSA.Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class BSTImp {
    public static void main(String args[]){
        Node root = null;

        root = insert(root,5);
        insert(root,2);
        insert(root,7);
        insert(root,1);
        insert(root,3);
        insert(root,6);
        insert(root,8);
        insert(root,9);

        System.out.println(nthLargest(root,4));
    }

    public static Node insert(Node node, int val){
        if(node == null){
            Node root = new Node(val);
            return root;
        }
        if(val<node.getData()){
            node.setLeft(insert(node.getLeft(),val));
        }else {
            node.setRight(insert(node.getRight(),val));
        }
        return node;
    }

    /**
     * finding an element in binary search tree
     */
    public static boolean findEle(Node node, int target){
        if(node==null){
            return false;
        }
        if(target == node.getData()){
            return true;
        }
        if(target<node.getData()){
            return findEle(node.getLeft(),target);
        }else {
            return findEle(node.getRight(),target);
        }
    }

    public static int minEle(Node root){
        if(root.getLeft()==null){
            return root.getData();
        }
        return minEle(root.getLeft());
    }

    public static int maxEle(Node root){
        if(root.getRight()==null){
            return root.getData();
        }
        return maxEle(root.getRight());
    }

    /**
     * Inorder predecessor and successor of a given binary tree
     */

    public static int inorderPre(Node root, int ele){
        if(root==null){
            return -1;
        }
        int pre = -1;

        while(root!=null){
            if(ele>root.getData()){
                pre = root.getData();
                root = root.getRight();
            }else {
                root = root.getLeft();
            }
        }
        return pre;
    }

    public static int inorderSuc(Node root, int ele){
        if(root==null){
            return -1;
        }
        int suc = -1;

        while(root!=null){
           if(ele<root.getData()){
               suc = root.getData();
               root = root.getLeft();
           }else {
               root = root.getRight();
           }
        }
        return suc;
    }

    /**
     *Nth Smallest and Largest element of the given binary tree
     */
    public static int nthSmallest(Node root , int n){
        int count = 0;
        Node cur = root;
        while (cur !=null && count<n){
            if(cur.getLeft() == null){
                count++;
                if(count == n) return cur.getData();
                cur = cur.getRight();
            }else {
                Node prev = cur.getLeft();
                while (prev.getRight()!=null && prev.getRight()!=cur){
                    prev = prev.getRight();
                }
                if(prev.getRight() == null){
                    prev.setRight(cur);
                    cur = cur.getLeft();
                }else{
                    prev.setRight(null);
                    count++;
                    if(count == n) return cur.getData();
                    cur = cur.getRight();
                }
            }
        }
        return -1;
    }

    public static int nthLargest(Node root, int k){
        Node cur = root;
        while (cur !=null){
            if(cur.getRight() == null){
                k--;
                if(k==0) return cur.getData();
                cur = cur.getLeft();
            }else {
                Node prev = cur.getRight();
                while (prev.getLeft()!=null && prev.getLeft() != cur){
                    prev = prev.getLeft();
                }
                if(prev.getLeft() == null){
                    prev.setLeft(cur);
                    cur = cur.getRight();
                }else {
                    prev.setLeft(null);
                    k--;
                    if(k==0) return cur.getData();
                    cur = cur.getLeft();
                }
            }
        }
        return -1;
    }

}
