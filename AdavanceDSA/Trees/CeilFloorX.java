package AdavanceDSA.Trees;

public class CeilFloorX {
    public static void main(String args[]){
        //int arr[] = {5,1,7,2,3};
        Node root = BSTImp.insert(null,5);
        BSTImp.insert(null,5);
        BSTImp.insert(root,1);
        BSTImp.insert(root,7);
        BSTImp.insert(root,2);
        BSTImp.insert(root,3);

        System.out.println(floorX(root,4));
    }

    private static int ceilX(Node root, int target) {
        if(root == null){
            return -1;
        }
        int ceil = -1;
        while (root!=null){
            if(root.getData()==target){
                return root.getData();
            }else if (target<root.getData()){
                ceil = root.getData();
                root = root.getLeft();
            }else {
                root = root.getRight();
            }
        }

        return ceil;
    }

    public static int floorX(Node root, int target){
        if(root == null){
            return -1;
        }
        int floor = -1;
        while (root!=null){
            if(root.getData() == target){
                return root.getData();
            } else if (target< root.getData()) {
                root = root.getLeft();
            }else {
                floor = root.getData();
                root = root.getRight();
            }
        }
        return floor;
    }
}
