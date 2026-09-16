public class Main {
    public static void main(String[] args)
    {
        int[][] arr1={{0,1,2},{2,3,4},{4,5,6}};
        int[][] arr2={{1,2,3},{2,2,2},{1,2,3}};
        int[][] arr3={{1,3,5},{4,5,6},{5,7,9}};

        System.out.println("Array1:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array2:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array3:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}