package AdavanceDSA.Trees;

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
        System.out.println(root.getData());
        System.out.println(findEle(root,8));
        System.out.println(maxEle(root));
        System.out.println(inorderPre(root,9));
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

}
