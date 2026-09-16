public class Chap_6_27 {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
