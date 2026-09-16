public class BinarySearchTree {
    class BinaryNode {
        public int value;
        public int height;
        BinaryNode left;
        BinaryNode right;
    }
    BinaryNode root=new BinaryNode();
    public BinarySearchTree(){}

    private BinaryNode insert(BinaryNode currentNode, int value)
    {
        if (root.value==0)
        {
            root.value=value;
            System.out.println("The Value " + value + " Is Successfully Insert.");
            return root;
        }
        if (currentNode==null)
        {
            BinaryNode newNode=new BinaryNode();
            newNode.value=value;
            System.out.println("The Value " + value + " Is Successfully Insert.");
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
        postOrder(root);
        System.out.println();
    }

    private BinaryNode minimumNode(BinaryNode node)
    {
        if (node.left==null)
        {
            return node;
        }
        else
        {
            return minimumNode(node.left);
        }
    }

    private BinaryNode delete(BinaryNode node, int deletingValue)
    {
        if (node==null)
        {
            System.out.println("Value: " + deletingValue + " Not Founded.");
            return null;
        }
        if (deletingValue < node.value)
        {
            node.left=delete(node.left,deletingValue);
        }
        else if (deletingValue > node.value)
        {
            node.right=delete(node.right,deletingValue);
        }
        else
        {
            if (node.left != null && node.right != null)
            {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value=minNodeForRight.value;
                node.right=delete(node.right,minNodeForRight.value);
            }
            else if (node.left!=null)
            {
                node=node.left;
            }
            else if (node.right!=null)
            {
                node=node.right;
            }
            else
            {
                node=null;
            }
        }
        return node;
    }

    public void deleteNode(int deletingValue)
    {
        delete(root,deletingValue);
        System.out.println("Value: " + deletingValue + " is deleted Successfully.");
    }
}