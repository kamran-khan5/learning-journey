public class MergeArr {
    public static int [] merge(int[] arr1, int[] arr2)
    {
        int size=arr1.length+arr2.length;
        int [] A3=new int[size];
        int i;
        for(i=0; i<arr1.length;i++)
        {
            A3[i]=arr1[i];
        }
        int j=arr1.length;
        for(i=0;i<arr2.length;i++,j++)
        {
            A3[j]=arr2[i];
        }
        return A3;

    }
    public static void main(String[] args) {
        int [] A1={1,3,5,7,9,11,13,15,17,19};
        int [] A2={2,4,6,8,10,12,14,16,18,20};
        int a3=A1.length+A2.length;
        int [] A3=merge(A1,A2);
        for (int i=0;i<A3.length;i++)
        {
            System.out.println(A3[i]);
        }
    }
}
