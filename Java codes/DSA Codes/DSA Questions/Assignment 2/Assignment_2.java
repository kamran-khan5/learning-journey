import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int operation;
        do {
            System.out.println("0. Append");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Quit");
            System.out.print("Select an Operation : ");
            operation= sc.nextInt();

            switch (operation)
            {
                case 0:
                    System.out.print("Enter number to be insert : ");
                    int appendValue=sc.nextInt();
                    list.append(appendValue);
                    System.out.println("Value "+appendValue+" is appended successfully.");
                    break;

                case 1:
                    System.out.print("Enter number to be insert : ");
                    int insertValue=sc.nextInt();
                    System.out.print("Enter location to be insert : ");
                    int location=sc.nextInt();
                    list.insertInLinkedList(insertValue,location);
                    System.out.println("Value "+insertValue+" is inserted  successfully.");
                    break;

                case 2:
                    System.out.print("Enter number to be delete : ");
                    int deleteValue=sc.nextInt();
                    int deleteLocation=list.deletionOfNode(deleteValue);
                    if (deleteLocation!=-1)
                    {
                        System.out.println("Value found at node " + deleteLocation);
                        System.out.println("Deleted successfully..!");
                        break;
                    }
                    System.out.println("List is Empty.");
                    break;

                case 3:
                    System.out.print("Enter number to be search : ");
                    int searchValue=sc.nextInt();
                    int valueLocation=list.searchNode(searchValue);
                    if (valueLocation!=-1)
                    {
                        System.out.println("Value found at node "+valueLocation);
                        break;
                    }
                    System.out.println("Value not found.");
                    break;

                case 4:
                    list.traverseSinglyLinkedList();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (operation!=5);
    }
}
