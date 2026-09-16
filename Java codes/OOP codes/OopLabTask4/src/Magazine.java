import java.util.Scanner;

public class Magazine extends LibraryItem implements Borrowable{
    public static Scanner sc=new Scanner(System.in);
    private String month;
    private int issue;

    public Magazine(String title) {
        super(title);
    }

    @Override
    public void borrow() {
        System.out.println("Magazine with title "+title+ " has been borrowed.");
        System.out.println("Enter the issue number of the magazine..");
        issue=sc.nextInt();
        System.out.println("Enter the publication month of the magazine.\n\n");
        month=sc.nextLine();
    }
}
