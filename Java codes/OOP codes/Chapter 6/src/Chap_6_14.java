public class Chap_6_14 {
//use of command line argument
    public static double average(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println("Average of 5, 7, 9, 3, 6: " + average(5, 7, 9, 3, 6));
        System.out.println("Average of 30, 35, 40: " + average(30, 35, 40));
        System.out.println("Average of 10, 20: " + average(10, 20));
        System.out.println("Average of 0: " + average());
    }
}
