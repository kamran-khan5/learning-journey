import java.util.Scanner;

public class DublicateEliminate {

    public static int [] duplicate(int [] a)
    {
        int[] arr=new int[a.length];
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            boolean check =true;
            for (int j=0;j<i;j++)
            {
                if (a[j]==a[i])
                {
                  check=false;
                  break;
                }
            }
            if (check)
            {
                arr[c++]=a[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many numbers do you want to enter: ");
        int[] arr=new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i]= sc.nextInt();
        }

        arr=duplicate(arr);

        System.out.println("\n\nNumbers After removing duplication:");
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=0)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
