import java.util.Random;

public class Chap_6_8d {
    public static Random random= new Random();
    public static void main(String[] args) {
        int[] array=new int[100];
        int[] Rev_array=new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(1000);

        }
        for (int i = 0; i < array.length; i++) {
            Rev_array[i]=array[array.length-1-i];

        }
        System.out.println("Array: ");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]+"\t");

        }
        System.out.println();
        System.out.println("Reverse Array:");
        for (int a = 0; a < array.length; a++) {
            System.out.print(Rev_array[a]+"\t");

        }
    }
}
