public class Chap_6_16 {
    public static void main(String[] args) {


        int[] num = new int[args.length];
        int i = 0;
        for (String arg : args) {
            num[i] = Integer.parseInt(arg);
            i++;
        }

        System.out.print("Absolute values of the numbers: ");
        for (int temp_num : num) {
            System.out.print(Math.abs(temp_num) + " ");
        }
    }
}
