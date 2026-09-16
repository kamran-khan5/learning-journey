public class Chap_5_34 {
    public static void main(String[] args) {
        System.out.println("Decimal \t\t Binary \t\t Octal \t\t Hexadecimal");

        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);

            System.out.printf("%7d\t\t%6s\t\t%5s\t\t%11s%n", i, binary, octal, hex);
        }
    }
}
