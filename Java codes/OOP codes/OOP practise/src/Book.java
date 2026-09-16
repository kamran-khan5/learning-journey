import java.util.Scanner;

public class Book {
    private int bookId;
    private int pages;
    private int price;

    public void setBookId(int id)
    {
        this.bookId=id;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }

    public int getBookId()
    {
        return bookId;
    }
    public int getPages()
    {
        return pages;
    }
    public int getPrice()
    {
        return price;
    }

    public void getInput()
    {
        Scanner sc=new Scanner(System.in);
        Book b=new Book();

        System.out.print("Enter Book Id: ");
        setBookId(sc.nextInt());

        System.out.print("Enter Book pages: ");
        setPages(sc.nextInt());

        System.out.print("Enter Book Price: ");
        setPrice(sc.nextInt());
    }

    public void show()
    {
        System.out.println("Book ID: " + getBookId());
        System.out.println("Book Pages: " + getPages());
        System.out.println("Book Price: " + getPrice());
    }
}

