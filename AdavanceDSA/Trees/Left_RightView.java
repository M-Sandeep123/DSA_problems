package AdavanceDSA.Trees;

import java.util.*;

public class Left_RightView {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        TreeNodes root = TreeImp.createTree(arr,0);
        System.out.println(leftView(root));
        System.out.println(rightView(root));
    }

    private static List<Integer> leftView(TreeNodes root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        leftData(root,list,map,0);
        return list;
    }

    private static void leftData(TreeNodes root, List<Integer> list, Map<Integer, Integer> map, int level) {
        if(root!=null){
            if(!map.containsKey(level)){
                list.add(root.getData());
                map.put(level, root.getData());
            }
            leftData(root.getLeft(),list,map,level+1);
            leftData(root.getRight(),list,map,level+1);
        }
    }

    private static List<Integer> rightView(TreeNodes root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        rightData(root,list,map,0);
        return list;
    }

    private static void rightData(TreeNodes root, List<Integer> list, Map<Integer, Integer> map, int level) {
        if(root!=null){
            if(!map.containsKey(level)){
                list.add(root.getData());
                map.put(level, root.getData());
            }
            rightData(root.getRight(),list,map,level+1);
            rightData(root.getLeft(),list,map,level+1);
        }
    }
}

