public class Array2D {
    public static void main(String[] args) {
        int[][] array={{0,1,2},{2,3,4},{4,5,6}};
        for(int [] new_arr:array)
        {
            for(int value:new_arr)
            {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}
