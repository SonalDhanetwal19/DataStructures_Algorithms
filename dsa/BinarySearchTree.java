
// Java program to demonstrate
// insert operation in binary
// search tree
public class BinarySearchTree {

    /* Class containing left
       and right child of current node
     * and key value*/
    public class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() { root = null; }

    BinarySearchTree(int value) { root = new Node(value); }

    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() { inorderRec(root); }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // to get inorder predecessor of a node
    // refer to youtube video - https://www.youtube.com/watch?v=me35OMKxHYI
    Node getInorderPredecessor(Node node, int val)
    {
        Node inOrderPredecessor = null;
        if(node == null)
            return null;
        while (node!=null)
        {
            if(val < node.key)
            {
                node = node.left;
            } else if (val > node.key) {
                inOrderPredecessor = node;
                node = node.right;
            }
            else
            { //go to the left and then try to find the rightmost node
                if(node.left!= null)
                {
                    inOrderPredecessor = getPredecessorNode(node);
                }
                break;
            }
        }
        return node!= null ? inOrderPredecessor:null;
    }

    public Node getPredecessorNode(Node node)
    {
        if(node == null) return null;
        Node temp = node.left;
        while (temp.right!= null)
        {
            temp = temp.right;
        }
        return temp;
    }


    // to get inorder successor of a node - refer below video link
    //https://www.google.com/search?q=Get+Inorder+successor+for+a+given+value+in+BST&biw=1309&bih=746&tbm=vid&sxsrf=ALiCzsZUjm6erP6MByxtM-ZnBNrNbfU5Ng%3A1670558625859&ei=obOSY6vZM9ShhwO4q5nIDA&ved=0ahUKEwjrreHr0-v7AhXU0GEKHbhVBskQ4dUDCA0&uact=5&oq=Get+Inorder+successor+for+a+given+value+in+BST&gs_lcp=Cg1nd3Mtd2l6LXZpZGVvEANQAFgAYIsCaABwAHgAgAEAiAEAkgEAmAEAoAEBwAEB&sclient=gws-wiz-video#fpstate=ive&vld=cid:14ad89b7,vid:kzycaQ2YOdw
    Node getSuccessorNode (Node node, int val)
    {
        Node successorNode = null;
        if(node == null) return null;
        while(node!=null) {
            if (val < node.key)
            {
                successorNode = node;
                node = node.left;
            }
            if(val > node.key)
            {
                node = node.right;

            }
            else {

                if(node.right!=null) {
                    successorNode = getSuccessorNode(node);
                }
                break;
            }
        }
        return node!=null?successorNode:null;
    }

    Node getSuccessorNode(Node node)
    {
        if(node==null) return null;
        Node temp = node.right;
        while(temp.left!=null)
        {
            temp = temp.left;
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
