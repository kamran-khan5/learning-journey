import java.util.Random;
import java.util.Scanner;

public class CubeFace {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] frequency=new int[7];
        Random rand=new Random();
        for (int i=0;i<6000;i++)
        {
            frequency[1 + rand.nextInt(6)]++;
        }

        System.out.println("Face   Frequency");
        for (int i=1;i<7;i++)
        {
            System.out.println(i+"\t\t"+frequency[i]);
        }
    }
}
