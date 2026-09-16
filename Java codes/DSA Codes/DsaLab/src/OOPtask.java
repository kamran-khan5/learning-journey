import java.util.Scanner;

public class OOPtask {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array (ODD value) : ");
        int size=sc.nextInt();

        double [] arr=new double[size];
        int i;
        double min, max, temp=0, avg=0;

        System.out.println("Enter array Elements.");

        System.out.print("Enter "+1+" Element no :");
        arr[0]=sc.nextDouble();
        min=arr[0];
        max=arr[0];
        for (i=1; i<size;i++)
        {
            System.out.print("Enter "+(i+1)+" Element no :");
            arr[i]=sc.nextDouble();
            if (arr[i]<min)
            {
                min=arr[i];
            }

            if (arr[i]>max)
            {
                max=arr[i];
            }
            temp+=arr[i];
        }
        avg=temp/size;
        temp=0;
        System.out.println("Array after reverse:");
        for (i=0; i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[(size-1)-i];
            arr[(size-1)-i]=temp;
        }

        for (i=0;i<size; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("max no :"+max+ "\nmin no :"+min+ "\nAverage is :"+avg);
    }
}
