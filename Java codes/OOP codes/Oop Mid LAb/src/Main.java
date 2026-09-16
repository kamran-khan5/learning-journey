import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char [][] grid= new char[6][6];
    public static int collectedGem;
    public static int explodeGem;

    public static void placeDashes()
    {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                grid[i][j] = '-';

            }
        }
    }
    public static void placeBomb ()
    {
        Random rand=new Random();
        for (int i=0;i<5;i++)
        {
            int row=rand.nextInt(6);
            int col=rand.nextInt(6);
            if (grid[row][col]!='b')
            {
                grid[row][col]= 'b';
                i++;
            }
        }
    }

    public static void placeGem ()
    {
        Random rand=new Random();
        for (int i=0;i<5;)
        {
            int row=rand.nextInt(6);
            int col=rand.nextInt(6);
            if (grid[row][col]!='b' && grid[row][col]!='g')
            {
                grid[row][col]= 'g';
                i++;
            }
        }
    }

    public static void cellUncovering() {
        int row, col;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter row no between (1-6): ");
                row = sc.nextInt();
            } while (row < 1 || row > 6);

            do {
                System.out.print("Enter column no between (1-6): ");
                col = sc.nextInt();
            } while (col < 1 || col > 6);
            
            if (grid[row-1][col-1]=='U')
            {
                System.out.println("This Slot is Already Uncover... Try Again");
            }
            
        }while (grid[row-1][col-1]=='U');

        if (grid[row - 1][col - 1] == 'g') {
            collectedGem++;
            grid[row - 1][col - 1] = 'G';
            System.out.println("Great you got a Gem... ");
        }
        else if (grid[row-1][col-1]=='b')
        {

        }else
        {
            grid[row][col]='U';
        }
        gridShow();
    }

    private void bombExplode(int row, int col)
    {
        if (row==0 )
        {
            if (col==0)
            {
                grid[row][col+1]=
            }
        }
    }

    

    public static void gridShow()
    {
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                if (grid[i][j]=='b' || grid[i][j]=='g')
                {
                    System.out.print("-\t");
                }
                else
                {
                    System.out.print(grid[i][j]+"\t");
                }
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Game!");
        placeDashes();
        gridShow();
        placeBomb();
        placeGem();
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                cellUncovering();
            }
        }
    }
}