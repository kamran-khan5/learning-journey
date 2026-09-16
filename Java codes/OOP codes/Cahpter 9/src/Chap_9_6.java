 class Book {
    private String title;
    private int year;
    private String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year + ", Author: " + author;
    }
}

 class PrintBook extends Book {
    private String publisher;
    private String ISBN;

    public PrintBook(String title, int year, String author, String publisher, String ISBN) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + ", Publisher: " + publisher + ", ISBN: " + ISBN;
    }
}

 class AudioBook extends Book {
    private int sizeInMB;
    private int playLength;
    private String playbackArtist;

    public AudioBook(String title, int year, String author, int sizeInMB, int playLength, String playbackArtist) {
        super(title, year, author);
        this.sizeInMB = sizeInMB;
        this.playLength = playLength;
        this.playbackArtist = playbackArtist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + sizeInMB + "MB, Play Length: " + playLength + " mins, Playback Artist: " + playbackArtist;
    }
}

public class Chap_9_6 {
    public static void main(String[] args) {
        Book book = new Book("Generic Book", 2022, "Generic Author");
        PrintBook printBook = new PrintBook("Print Book", 2021, "Print Author", "Print Publisher", "1234567890");
        AudioBook audioBook = new AudioBook("Audio Book", 2020, "Audio Author", 100, 180, "Audio Artist");

        System.out.println("Book obj: "+book);
        System.out.println("Print Book obj: "+printBook);
        System.out.println("Audio Book obj: "+audioBook);
    }
}

