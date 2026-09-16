public class Chap_4_23 {
    public static void main(String[] args) {
        int x = 3, y = 9, a = 7, b = 5, g = 5, i = 3, j = 8;
        //x = 3, y = 9
        // a = 2, b = 2, g = 5
        // i = 3, j = 8

        // Original expressions
        boolean expr1 = !(x < 5) && !(y >= 7);//false
        boolean expr2 = !(a == b) || !(g != 5);//true
        boolean expr3 = !((x <= 8) && (y > 4));//false
        boolean expr4 = !((i > 4) || (j <= 6));//true

        // Equivalent expressions
        boolean equivExpr1 = !((x < 5) || (y >= 7));//false
        boolean equivExpr2 = (a != b) && (g == 5);//true
        boolean equivExpr3 = (x > 8) || (y <= 4);//false
        boolean equivExpr4 = (i <= 4) && (j > 6);//true


        System.out.println("Original expressions:");
        System.out.println("!(x < 5) && !(y >= 7) = " + expr1);
        System.out.println("!(a == b) || !(g != 5) = " + expr2);
        System.out.println("!((x <= 8) && (y > 4)) = " + expr3);
        System.out.println("!((i > 4) || (j <= 6)) = " + expr4);


        System.out.println("\n\nEquivalent expressions:");
        System.out.println("!((x < 5) || (y >= 7)) = " + equivExpr1);
        System.out.println("(a != b) && (g == 5) = " + equivExpr2);
        System.out.println("(x > 8) || (y <= 4) = " + equivExpr3);
        System.out.println("(i <= 4) && (j > 6) = " + equivExpr4);
    }
}
