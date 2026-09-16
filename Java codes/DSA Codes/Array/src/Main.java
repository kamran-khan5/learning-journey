public class Main {
    public static void main(String[] args)
    {
        Array number=new Array(10);
        number.insert(20);
        number.insert(30);
        number.insert(0);
        number.insert(50);
        number.insert(60);
        number.print();
        System.out.println("number index: " + number.indexOf(500));

    }
}