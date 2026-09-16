public class Quiz_3 {
    public static void main(String[] args) {
        //Question 01: Finding duplicate with the help of BST.
        BinarySearchTree tree1=new BinarySearchTree();
        tree1.insertAndRemoveDuplicate(14);
        tree1.insertAndRemoveDuplicate(4);
        tree1.insertAndRemoveDuplicate(15);
        tree1.insertAndRemoveDuplicate(4);
        tree1.insertAndRemoveDuplicate(9);
        tree1.insertAndRemoveDuplicate(7);
        tree1.insertAndRemoveDuplicate(18);
        tree1.insertAndRemoveDuplicate(3);
        tree1.insertAndRemoveDuplicate(5);
        tree1.insertAndRemoveDuplicate(16);
        tree1.insertAndRemoveDuplicate(4);
        tree1.insertAndRemoveDuplicate(20);
        tree1.insertAndRemoveDuplicate(17);
        tree1.insertAndRemoveDuplicate(9);
        tree1.insertAndRemoveDuplicate(14);
        tree1.insertAndRemoveDuplicate(5);
        tree1.inOrder();
        System.out.println("\n");

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

        //Question 02: Traversing tree in Post order & In order.
        System.out.println("\nPost Order:");
        tree.postOrder();
        System.out.println("\nIn Order:");
        tree.inOrder();
        System.out.println();

        //Question 03: Deleting 3 & 10 from BST.
        tree.deleteNode(3);
        tree.deleteNode(10);
    }
}