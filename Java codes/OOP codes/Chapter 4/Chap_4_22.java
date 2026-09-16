public class Chap_4_22 {
    public static void main(String[] args) {
        int triangle = 1;
        int no_of_lines = 10;
        for (int counter=1; counter<= 10; counter++)
        {


            for (int i=1; i<= 10; i++) {
                if(triangle >= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int i=1; i<= 10; i++) {
                if(no_of_lines >= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int i=1; i<= 10; i++) {
                if(triangle > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            System.out.print("  ");

            for (int i=1; i<= 10; i++) {
                if(no_of_lines > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            no_of_lines--;
            triangle++;

            System.out.println();


        }

    }
}
