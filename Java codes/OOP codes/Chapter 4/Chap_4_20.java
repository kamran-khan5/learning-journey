public class Chap_4_20 {
    public static void main(String[] args) {
        double pi = 0.0;
        int sign = 1;
        for (int i = 1; i <= 200000; i += 2) {
            pi += sign * 4.0 / i;
            sign = -1*sign;

            System.out.printf("i= %d\t\t\tvalue of pi= %.8f\n", i, pi);
            // System.out.printf(i+"     "+pi+"\n");

        }
    }
}
