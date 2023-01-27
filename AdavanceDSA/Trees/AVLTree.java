package AdavanceDSA.Trees;


/**
 *      Adelson_Velsky_Landis (AVL)
 * Implementing the self balanced Binary Search Tree (AVL)
 */

public class AVLTree {
    public static void main(String args[]){
        Node root = insert(null,1);
        root = insert(root,2);
        root = insert(root,3);
        root = insert(root,4);
        root = insert(root,5);
        root = insert(root,6);
        root = insert(root,7);
        root = insert(root,8);
        System.out.println(root.getData());
    }

    /**
     *  The function insert is used to insert a new key in the BST and balance it and return the updated the root
     *      Insert function accepts Args ROOT and KEY as Integer
     */
    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        } else if (key < root.getData()) {
            root.setLeft(insert(root.getLeft(),key));
        } else if (key > root.getData()) {
            root.setRight(insert(root.getRight(),key));
        }else {
            return root;
        }
        /**
         *  The above code return after insert key at leaf node
         *  and "Update" the height of the node
         */
        root.setHeight(1+maxHeight(height(root.getLeft()),height(root.getRight())));

        /**
         *      After updating the height check the Balance factor
         *      The fun balanceFactor take current root as an args
         *      return the balance factor of current root as an Integer
         */
        int balance = balanceFactor(root);

        /**
         *  Now check the type of rotation needed according to the balance factor
         *  The available rotations are LL(single right rotation) RR(single left rotation) LR(double rotation)
         *  and RL(double rotation)
         */

        /**
         *  LL (Single right rotation)
         *  Ex :        5 (2)              4
         *          "L"/                 /   \
         *            4                 3      5
         *        "L"/
         *          3
         *          key < root.getLeft().getData ==> means the keys exist at left assume 3 as key
         */

        if(balance>1 && key < root.getLeft().getData()){
            return rightRotation(root);
        }
        /**
         *  RR (Single left rotation)
         *  Ex :         5 (-2)               6
         *                \ "R"             /   \
         *                 6                5     7
         *                  \"R"
         *                   7
         *          key > root.getRight().getData ==> means the keys exist at right assume 7 as key
         */
        if(balance<-1 && key > root.getRight().getData()){
            return leftRotation(root);
        }
        /**
         *  LR (double rotation)            perform leftRotation at node "3" --then simply perform the LL rotation--
         *  Ex :        5 (2)              5
         *          "L"/                 /
         *            3                 4
         *             \"R"            /
         *              4             3
         *          key > root.getLeft().getData ==> means the keys exist at left part of right assume 4 as key
         */
        if(balance>1 && key > root.getLeft().getData()){
            root.setLeft(leftRotation(root.getLeft()));
            return rightRotation(root);
        }
        /**
         *  RL (double rotation)            perform right rotation at node 7 --then simply perform the RR rotation--
         *  Ex :         5 (-2)               5
         *                \ "R"                \
         *                 7                    6
         *                /"L"                   \
         *               6                        7
         *          key < root.getRight().getData ==> means the keys exist at right assume 6 as key
         */
        if(balance<-1 && key < root.getRight().getData()){
            root.setRight(rightRotation(root.getRight()));
            return leftRotation(root);
        }

        return root;
    }

    /**
     *
     * Logic for Left Rotation
     */
    private static Node leftRotation(Node node) {
        Node rightTree = node.getRight();
        Node rightLeftSubTree = rightTree.getLeft();

        rightTree.setLeft(node);
        node.setRight(rightLeftSubTree);

        node.setHeight(1+maxHeight(height(node.getLeft()), height(node.getRight())));
        rightTree.setHeight(1+maxHeight(height(rightTree.getLeft()), height(rightTree.getRight())));
        return rightTree;
    }

    /**
     *
     * Logic for Right rotation
     */
    private static Node rightRotation(Node node) {
       Node leftTree = node.getLeft();
       Node leftRightSubTree = leftTree.getRight();

       leftTree.setRight(node);
       node.setLeft(leftRightSubTree);

       node.setHeight(1+maxHeight(height(node.getLeft()), height(node.getRight())));
       leftTree.setHeight(1+maxHeight(height(leftTree.getLeft()), height(leftTree.getRight())));
       return leftTree;
    }

    /**
     *  The MaxHeight function will return the max height of left and right subtrees
     *      it accepts current root's _left height and _right height as an args of Integer type
     */
    private static int maxHeight(int lh, int rh) {
        return lh > rh ? lh : rh;
    }

    private static int balanceFactor(Node node) {
        if(node == null){
            return 0;
        }
        return height(node.getLeft())-height(node.getRight());
    }

    /**
     *  In the Node class the height member is stores the height of the every node
     *  and during the recursive call of insertion function the nodes heights will be updated
     */
    public static int height(Node node){
        if(node == null){
            return 0;
        }
        return node.getHeight();
    }
}
