//use of break without using break statement
public class Chap_4_26 {
    public static void main(String[] args) {
        boolean check=true;
        int number=0;
        while(check)
        {
            System.out.println("Number: " + number);
            if (number>=10)
            {
                check=false;
            }
            number++;
        }
    }
}
