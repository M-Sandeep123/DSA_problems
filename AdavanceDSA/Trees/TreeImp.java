package AdavanceDSA.Trees;

import com.sun.source.tree.Tree;

import javax.sound.midi.Soundbank;
import java.awt.datatransfer.FlavorEvent;
import java.util.*;

public class TreeImp {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        TreeNodes root = createTree(arr,0);

//        System.out.println(inorderTraversal(root,new ArrayList<>()));
//        System.out.println(preorderTraversal(root, new ArrayList<>()));
//        System.out.println(postorderTraversal(root,new ArrayList<>()));
       // iterativePostorder(root);
        System.out.println(topView(root));
    }

    public static TreeNodes createTree(int[] arr, int index) {
        if(index >= arr.length){
            return null;
        }
        TreeNodes root = new TreeNodes(arr[index]);
        root.setLeft(createTree(arr,2 * index+1));
        root.setRight(createTree(arr,2*index+2));
        return root;
    }

    public static List inorderTraversal(TreeNodes root, ArrayList<Integer> list){
        if(root != null){
             inorderTraversal(root.getLeft(),list);
             list.add(root.getData());
             inorderTraversal(root.getRight(),list);
        }
       return list;
    }

    public static List preorderTraversal(TreeNodes root, ArrayList<Integer> list){
        if(root != null){
            list.add(root.getData());
            preorderTraversal(root.getLeft(),list);
            preorderTraversal(root.getRight(),list);
        }
        return  list;
    }

     public static List postorderTraversal(TreeNodes root, ArrayList<Integer> list){
        if(root != null){
            postorderTraversal(root.getLeft(),list);
            postorderTraversal(root.getRight(),list);
            list.add(root.getData());
        }
            return list;
     }

     public static void iterativeInorder(TreeNodes root){
         Stack<TreeNodes> stack = new Stack<>();
         TreeNodes curr = root;
         while(curr!=null){
             stack.push(curr);
             curr = curr.getLeft();
         }
         while (!stack.isEmpty()){
             System.out.println(stack.peek().getData());
             curr = stack.pop().getRight();
             while(curr!=null){
                 stack.push(curr);
                 curr = curr.getLeft();
             }
         }
     }

     public static void iterativePostorder(TreeNodes root){
         if(root == null){
             return;
         }
         TreeNodes current = root;
         Stack<TreeNodes> stack = new Stack<>();
         while (!stack.isEmpty() || current!=null){
             if(current!=null){
                 stack.push(current);
                 current = current.getLeft();
             }else{
                 TreeNodes temp = stack.peek().getRight();
                 if(temp==null){
                     temp = stack.peek();
                     stack.pop();
                     System.out.println(temp.getData());
                     while (!stack.isEmpty() && temp == stack.peek().getRight()){
                         System.out.println(stack.peek().getData());
                         stack.pop();
                     }
                 }else {
                     current = temp;
                 }
             }
         }
     }

    /**
     *
     * The topView code function will partially only it fails some test cases
     */
     public static List<Integer> topView(TreeNodes root){
        List<Integer> list = new ArrayList<>();
        leftSide(root.getLeft(),list);
        list.add(root.getData());
        rightSide(root.getRight(),list);
        return list;
     }

    private static void rightSide(TreeNodes right, List<Integer> list) {
        if(right!=null){
            list.add(right.getData());
            rightSide(right.getLeft(),list);
        }
    }

    private static void leftSide(TreeNodes left, List<Integer> list) {
        if(left!=null){
            leftSide(left.getLeft(),list);
            list.add(left.getData());
        }
    }
}
