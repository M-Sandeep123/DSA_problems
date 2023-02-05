package AdavanceDSA.Trees;

import java.util.ArrayList;
import java.util.List;

public class LargestBST {
    public static void main(String args[]){
        int arr[] = {20,15,40,14,18,30,60,-1,17,16,19,-1,-1,50,-1};
        TreeNodes root = createTree(arr,0);
        LargestBST obj = new LargestBST();
        System.out.println(obj.largestBST(root));
    }

     class NodeValue{
        int maxNode,minNode,maxSize;
        NodeValue(int maxNode,int minNode,int maxSize){
            this.maxNode = maxNode;
            this.minNode = minNode;
            this.maxSize = maxSize;
        }
    }
    private NodeValue largestBSTHelper(TreeNodes root){
        if(root == null){
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        NodeValue left = largestBSTHelper(root.getLeft());
        NodeValue right = largestBSTHelper(root.getRight());
        if(left.maxNode<root.getData() && root.getData()<right.minNode){
            return new NodeValue(Math.min(root.getData(), left.minNode),Math.max(root.getData(),right.maxNode), left.maxSize+right.maxSize+1);
        }
        return  new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxSize, right.maxSize));
    }
    private int largestBST(TreeNodes root) {

        return largestBSTHelper(root).maxSize;
    }

    public static TreeNodes createTree(int arr[], int index){
        if(index >= arr.length || arr[index]==-1){
            return null;
        }
        TreeNodes root = new TreeNodes(arr[index]);
        root.setLeft(createTree(arr,2*index+1));
        root.setRight(createTree(arr,2*index+2));
        return root;
    }
}


