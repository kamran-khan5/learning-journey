public class Chap_4_29 {
    public static void main(String[] args) {
        String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
        String[] gifts = { "a partridge in a pear tree", "two turtle doves", "three french hens", "four calling birds", "five golden rings",
                "six geese a-laying", "seven swans a-swimming", "eight maids a-milking", "nine ladies dancing", "ten lords a-leaping",
                "eleven pipers piping", "twelve drummers drumming" };

        for (int i = 0; i < days.length; i++) {
            System.out.printf("On the %s day of Christmas, my true love gave to me:%n", days[i]);

            for (int j = i; j >= 0; j--) {
                switch (j) {
                    case 0 -> System.out.printf("%s.%n%n", gifts[j]);
                    case 1 -> System.out.printf("%s, and %s.%n", gifts[j], gifts[j - 1]);
                    default -> System.out.printf("%s, ", gifts[j]);
                }
            }
        }
    }
}
