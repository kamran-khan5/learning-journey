public class MergeArray {
    public static void main(String[] args) {
        int [] A1={1,3,5,7,9,11,13,15,17,19};
        int [] A2={2,4,6,8,10,12,14,16,18,20};
        int a3=A1.length+A2.length;
        int [] A3=new int[a3];

        int j=0;
        for (int i=0;i<a3;i++)
        {
            if(i%2==1)
            {
                A3[i]=A2[j];
                j++;
            }
            else
            {
                A3[i]=A1[j];
            }
            System.out.println(A3[i]);
        }
    }
}
