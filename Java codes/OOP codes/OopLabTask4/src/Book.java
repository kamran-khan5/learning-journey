import java.util.Scanner;

public class Book extends LibraryItem implements Borrowable{
    public static Scanner sc=new Scanner(System.in);
    private String author;
    private int year;

    public Book(String title) {
        super(title);
    }

    @Override
    public void borrow() {
        System.out.println("Book with title "+title+ " has been borrowed.");
        System.out.println("Enter the author of the book.");
        author=sc.nextLine();
        System.out.println("Enter the publication year of the book.");
        year=sc.nextInt();
    }
}
