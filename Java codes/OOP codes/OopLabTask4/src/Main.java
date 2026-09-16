public class Main {
    public static void main(String[] args) {
        Borrowable book=new Book("To Kill a Mockingbird");
        Borrowable dvd=new DVD("The Shawshank Redemption");
        Borrowable magazine=new Magazine("National Geographic");

        book.borrow();
        dvd.borrow();
        magazine.borrow();
    }
}