import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.print();
        System.out.println();
        System.out.println(list.indexOf(5));
        System.out.println();
        System.out.println(list.indexOf(11));
        System.out.println();
        System.out.println(list.indexOf(3));
        System.out.println();
        System.out.println(list.size());
        System.out.println();

        list.deleteFirst();
        list.deleteLast();
        System.out.println("list");
        list.print();
        System.out.println();
        System.out.println(list.size());

        int[] arr= list.toArray();
        System.out.println(Arrays.toString(arr));
        list.reverse();
        list.print();

    }
}