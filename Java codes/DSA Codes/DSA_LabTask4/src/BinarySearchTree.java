public class BinarySearchTree {
    class BinaryNode {
        public int value;
        BinaryNode left;
        BinaryNode right;
    }
    BinaryNode root=new BinaryNode();

    private BinaryNode insert(BinaryNode currentNode, int value)
    {
        if (root.value==0)
        {
            root.value=value;
            System.out.println("The Value Is Successfully Insert.");
            return root;
        }
        if (currentNode==null)
        {
            BinaryNode newNode=new BinaryNode();
            newNode.value=value;
            System.out.println("The Value Is Successfully Insert.");
            return newNode;
        }
        else if (value <= currentNode.value)
        {
            currentNode.left= insert(currentNode.left,value);
            return currentNode;
        }
        else
        {
            currentNode.right= insert(currentNode.right,value);
            return currentNode;
        }
    }

    public void insert(int value)
    {
        insert(root,value);
    }

    private void preOrder(BinaryNode node)
    {
        if (node==null)
        {
            return;
        }
        System.out.print(node.value + "  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder()
    {
        if (root.value==0)
        {
            System.out.println("Tree is Empty!");
            return;
        }
        preOrder(root);
        System.out.println();
    }

    private void inOrder(BinaryNode node)
    {
        if (node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + "  ");
        inOrder(node.right);
    }

    public void inOrder()
    {
        if (root.value==0)
        {
            System.out.println("Tree is Empty!");
            return;
        }
        inOrder(root);
        System.out.println();
    }

    private void postOrder(BinaryNode node)
    {
        if (node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + "  ");
    }

    public void postOrder()
    {
        if (root.value==0)
        {
            System.out.println("Tree is Empty!");
            return;
        }
        postOrder(root);
        System.out.println();
    }
}