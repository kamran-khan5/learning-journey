import java.util.Random;

public class Chap_6_8a {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]= random.nextInt(100);
        }
        System.out.print("The Value Tenth Element in array is: "+ array[array.length-1]);
    }
}
