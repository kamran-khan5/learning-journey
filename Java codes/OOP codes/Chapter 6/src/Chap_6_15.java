public class Chap_6_15 {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double)(min + max) / 2;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average of maximum and minimum: " + average);
    }
}
