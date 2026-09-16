import java.util.Random;

public class Chap_6_8e {
    public static void main(String[] args) {
        Random r=new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= r.nextInt(10)+1;

        }

        int product = 1;

        for (int i = 2; i <= 9; i++) {
            System.out.print(array[i]+"\t");
            product *= array[i];
        }

        System.out.println("\nThe product of the third to the tenth elements is: " + product);

    }
}
