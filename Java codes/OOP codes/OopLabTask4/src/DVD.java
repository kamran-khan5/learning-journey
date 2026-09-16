import java.util.Scanner;

public class DVD extends LibraryItem implements Borrowable{
    public static Scanner sc=new Scanner(System.in);
    private String director;
    private int duration;


    public DVD(String title) {
        super(title);
    }

    @Override
    public void borrow() {
        System.out.println("DVD with title "+title+ " has been borrowed.");
        System.out.println("Enter the director of the DVD.");
        director=sc.nextLine();
        System.out.println(": the duration of the DVD in minutes.\n\n");
        duration=sc.nextInt();
    }
}
