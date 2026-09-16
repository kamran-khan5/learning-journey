import java.util.Random;

public class Chap_6_8c {
    public static void main(String[] args) {
        Random random=new Random();
        double[] array = new double[100];


        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextDouble(50);

        }
        for (int i = 1; i < 100; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum of the first one-hundred elements is: " + max);

    }
}
