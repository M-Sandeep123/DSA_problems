package AdavanceDSA.Trees;

import java.lang.reflect.Array;
import java.util.*;

public class Top_BottomView {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        TreeNodes root = TreeImp.createTree(arr,0);
        //System.out.println(treeTopView(root));
        System.out.println(treeBottomView(root));
    }

    private static ArrayList<Integer> treeTopView(TreeNodes root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair cur = queue.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd,cur.node.getData());
            }
            if(cur.node.getLeft()!=null){
                queue.add(new Pair(cur.hd-1,cur.node.getLeft()));
            }
            if(cur.node.getRight()!=null){
                queue.add(new Pair(cur.hd+1, cur.node.getRight()));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }

    private static ArrayList<Integer> treeBottomView(TreeNodes root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair cur = queue.poll();
            map.put(cur.hd,cur.node.getData());
            if(cur.node.getLeft()!=null){
                queue.add(new Pair(cur.hd-1,cur.node.getLeft()));
            }
            if(cur.node.getRight()!=null){
                queue.add(new Pair(cur.hd+1, cur.node.getRight()));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}

class Pair{
    int hd;
    TreeNodes node;
    public Pair(int hd, TreeNodes node){
        this.hd = hd;
        this.node = node;
    }
}
