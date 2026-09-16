import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    class BinaryNode {
        public int value;
        public int height;
        BinaryNode left;
        BinaryNode right;
    }
    BinaryNode root=new BinaryNode();
    public BinarySearchTree(){}
    public BinarySearchTree(int rootValue)
    {
        root.value=rootValue;
    }

    private BinaryNode insert(BinaryNode currentNode, int value)
    {
        if (root.value==0)
        {
            root.value=value;
            return root;
        }
        if (currentNode==null)
        {
            BinaryNode newNode=new BinaryNode();
            newNode.value=value;
//            System.out.println("The Value Is Successfully Insert.");
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

    public void levelOrder()
    {
        BinaryNode node=root;
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            BinaryNode presentNode= queue.remove();
            System.out.print(presentNode.value + "  ");
            if (presentNode.left!=null)
            {
                queue.add(presentNode.left);
            }
            if (presentNode.right!=null)
            {
                queue.add(presentNode.right);
            }
        }
        System.out.println();
    }

    private BinaryNode search(BinaryNode node, int searchValue)
    {
        if (node==null)
        {
            System.out.println("Value: " + searchValue + " Not Founded.");
            return null;
        }
        else if (node.value==searchValue)
        {
            System.out.println("Value: " + searchValue + " Is Founded.");
            return node;
        }
        if (searchValue<node.value)
        {
            return search(node.left,searchValue);
        }
        else
        {
            return search(node.right,searchValue);
        }
    }

    public void search(int searchValue)
    {
        search(root,searchValue);
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
    }

    public void deleteBST() {
        root = null;
        System.out.println("\nBST has been deleted successfully");
    }
}