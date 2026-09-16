public class Chap_5_24 {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + ": ");
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
