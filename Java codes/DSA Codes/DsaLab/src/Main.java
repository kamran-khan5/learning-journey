public class Main {
    public static void main(String[] args)
    {
        int[] arr={0,2,4,6,8,10};
        int i, element=13, index=3;

        for (i=0; i<arr.length;i++)
        {
            System.out.println("Output is : "+arr[i]);
        }

        for (i=index;i<arr.length-1; i++)
        {
            arr[i] =arr[i+1];
        }
        System.out.println("After.");
        for (i=0; i<arr.length-1;i++)
        {
            System.out.println("Output is : "+arr[i]);
        }







    }
}