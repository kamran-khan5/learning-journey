import java.util.Scanner;

class Chap_11_21 {

    public static void Method1()
    {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number :");
            int num= sc.nextInt();
        }catch (NullPointerException e)
        {
            System.err.println("Exception in Method 1");
        }
    }

    public static void main(String[] args) {

        try {
            Method1();
        }catch (Exception e)
        {
            System.err.println("Exception in main Method ");

        }
    }
}
