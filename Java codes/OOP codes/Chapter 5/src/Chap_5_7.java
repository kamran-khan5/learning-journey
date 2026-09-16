public class Chap_5_7 {
    public static void main(String[] args) {
        double x = Math.abs(-7.5);//7.5
        System.out.println("Math.abs(-7.5): " + x);

        x = Math.floor(5 + 2.5);//7.0
        System.out.println("Math.floor(5 + 2.5): " + x);

        x = Math.abs(9) + Math.ceil(2.2);//12.0
        System.out.println("Math.abs(9) + Math.ceil(2.2): " + x);

        x = Math.ceil(-5.2);//-5.0
        System.out.println("Math.ceil(-5.2): " + x);

        x = Math.abs(-5) + Math.abs(4);//9.0
        System.out.println("Math.abs(-5) + Math.abs(4): " + x);

        x = Math.ceil(-6.4) - Math.floor (5.2);//-11
        System.out.println("Math.ceil(-6.4) - Math.floor (5.2): " + x);

        x = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));//-6
        System.out.println("Math.ceil(-Math.abs(-3 + Math.floor(-2.5))): " + x);

    }
}
