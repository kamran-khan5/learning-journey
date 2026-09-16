public class Chap_5_25 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 1;
        System.out.println("2 ");
        for (int i = 3; i < 10000; i += 2) {
            if (isPrime(i)) {

                System.out.println(i);
                count++;

            }
        }
        System.out.println("\nThere are " + count + " prime numbers less than 10,000.");//1229
    }
}

