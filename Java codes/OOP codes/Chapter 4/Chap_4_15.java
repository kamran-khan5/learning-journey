// 4.15 (Triangle Printing Program)
public class Chap_4_15 {
    public static void main(String[] args)
    {
        System.out.println("Triangle (A)");
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n\nTriangle (B)");
        for (int i=10;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n\nTriangle (C)");
        for (int i=1;i<=10;i++)
        {
            for (int space=2;space<=i;space++)
            {
                System.out.print("   ");
            }
            for (int j=i;j<=10;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n\nTriangle (D)");
        for (int i=10;i>=1;i--)
        {
            for (int space=2;space<=i;space++)
            {
                System.out.print("   ");
            }
            for (int j=i;j<=10;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
