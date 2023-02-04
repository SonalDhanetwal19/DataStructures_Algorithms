import javax.swing.tree.TreeNode;

public class InorderPredecessorBST {
    public static void main(String[] args)
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(8);
        binarySearchTree.insert(15);
        binarySearchTree.insert(6);
        binarySearchTree.insert(2);
        binarySearchTree.insert(7);
        binarySearchTree.insert(20);
        binarySearchTree.insert(5);

        binarySearchTree.inorder();
        BinarySearchTree.Node predecessorNode = binarySearchTree.getInorderPredecessor(binarySearchTree.root,20);
        if(predecessorNode != null)
        System.out.println("predecessorNode found: "+predecessorNode.key);
        else
            System.out.println("predecessorNode not found");
    }
}
