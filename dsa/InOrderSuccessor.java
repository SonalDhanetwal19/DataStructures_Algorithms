public class InOrderSuccessor {
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
        BinarySearchTree.Node successorNode = binarySearchTree.getSuccessorNode(binarySearchTree.root,5);
        if(successorNode!=null)
            System.out.println("success found :"+successorNode.key);
        else
            System.out.println("success not found");
    }


}
