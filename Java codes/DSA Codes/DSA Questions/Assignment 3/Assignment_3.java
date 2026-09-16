import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(7);
        tree.insert(3);
        tree.insert(17);
        tree.insert(2);
        tree.insert(5);
        tree.insert(10);
        tree.insert(19);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(9);
        tree.insert(21);

        //Question 2: Traversing tree in Post order & In order.
        System.out.println("\nPost Order:");
        tree.postOrder();
        System.out.println("\nIn Order:");
        tree.inOrder();
        System.out.println();

        //Question 1: Deleting 3 & 10 from BST.
        tree.deleteNode(3);
        tree.deleteNode(10);
    }
}
