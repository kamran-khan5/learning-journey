import java.util.Scanner;

class LibraryManagement{
    private final String[] availableBook=new String[10];
    private int count=0;
    public void addBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Name Do you Want to Add : ");
        availableBook[count++]= sc.nextLine();

    }

    public void issueBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Name Do you Want to issue : ");
        String searchBook=sc.nextLine();
        for (int i=0;i< count;i++)
        {
            if (availableBook[i].equalsIgnoreCase(searchBook))
            {
                for (int j=i;j<count;j++)
                {
                    availableBook[j]=availableBook[j+1];
                }
                System.out.println(searchBook+" Book Is Issued Successfully.");
                count--;
                return;
            }
        }
        System.out.println("Sorry! "+searchBook+" Book Is Not available.");
    }

    public void returnBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Name Do you Want to Return : ");
        availableBook[count]=sc.nextLine();
        System.out.println(availableBook[count] + "returned Successfully!");
        count++;
    }

    public void showAvailableBooks()
    {
        for (int i=0;i<count;i++)
        {
            System.out.println((i+1) + ": " + availableBook[i]);
        }
    }

    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\tWelcome To Library Management!\n");
            System.out.println("Press 1 for Add Book. ");
            System.out.println("Press 2 for Issue Book. ");
            System.out.println("Press 3 for Return Book. ");
            System.out.println("Press 4 for Show Available Book. ");
            System.out.println("Press 0 for exit Library System. ");
            choice= sc.nextInt();
            switch (choice)
            {
                case 0:
                    break;

                case 1:
                    addBook();
                    break;

                case 2:
                    issueBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    showAvailableBooks();
                    break;

                default:
                    System.out.println("Invalid Choice... Tray Again.");
                    break;
            }
        }while(choice!=0);
    }


}
public class Library {
    public static void main(String[] args) {
        LibraryManagement system1=new LibraryManagement();
        system1.menu();

    }
}