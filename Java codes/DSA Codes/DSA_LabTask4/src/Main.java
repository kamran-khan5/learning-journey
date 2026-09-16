import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree=new BinarySearchTree();
        int choice;
        do {
            System.out.println("PRESS 1: For Insert data to tree.");
            System.out.println("PRESS 2: For Traverse tree in InOrder.");
            System.out.println("PRESS 3: For Traverse tree in PreOrder.");
            System.out.println("PRESS 4: For Traverse tree in PostOrder.");
            System.out.println("PRESS 0: For Exit.");
            System.out.print("Choice : ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    int insertingValue;
                    do {
                        System.out.print("Enter the Inserting value / '0' to return main menu : ");
                        insertingValue= sc.nextInt();
                        if (insertingValue!=0)
                        {
                            tree.insert(insertingValue);
                        }
                    }while (insertingValue!=0);
                    System.out.println("\n");
                    break;

                case 2:

                    tree.inOrder();
                    System.out.println("\n");
                    break;

                case 3:

                    tree.preOrder();
                    System.out.println("\n");
                    break;

                case 4:

                    tree.postOrder();
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("Program Ended...");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("ERROR...   Invalid Input.");
                    System.out.println("\n");
            }
        }while (choice!=0);

    }
}