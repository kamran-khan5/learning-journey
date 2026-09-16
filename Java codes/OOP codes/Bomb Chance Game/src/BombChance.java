import java.util.Random;
import java.util.Scanner;

public class BombChance {
    boolean [] number=new boolean[10];
    public void placeGoodBomb(int [][] grid)
    {
        Random rand=new Random();
        for (int i=0;i<2;i++)
        {
            grid [rand.nextInt(4)][rand.nextInt(4)]=-1;
        }
    }

    public void placeBadBomb(int [][] grid)
    {
        Random rand=new Random();
        for (int i=0;i<3;i++)
        {
            grid [rand.nextInt(4)][rand.nextInt(4)]=-2;
        }
    }

    public void showAvailableNumber(boolean[] number)
    {
        for (int i=1;i<10;i++)
        {
            if (number[i]==false)
            {
                System.out.print(i+"   ");
            }
        }
        System.out.println();
    }


    public void placeNumber(int [][] grid)
    {
        Scanner sc=new Scanner(System.in);
        int row ,col;
        placeGoodBomb(grid);
        placeBadBomb(grid);
        for (int i=0;i<9;i++) {
            do {
                System.out.print("Enter row number (0-3):");
                row = sc.nextInt();

            } while (row > 3 || row < 0);

            do {
                System.out.print("Enter column number (0-3) :");
                col = sc.nextInt();

            } while (col > 3 || col < 0);

            if (grid[row][col]>0)
            {
                System.out.println("This slot is already is Used.");
                i--;
                continue;
            }


            int user_input;

            do {
                System.out.println("Enter number between 1-9: ");
                showAvailableNumber (number);
                user_input = sc.nextInt();
            } while (user_input < 1 || user_input > 9);

            if (number[user_input] == false) {
                number[user_input] = true;
                if (grid[row][col] == 0) {
                    grid[row][col] = user_input;
                } else if (grid[row][col] == -1) {
                    grid[row][col] = user_input * 2;
                    System.out.println("Great! you got Good Boom.");
                } else if (grid[row][col] == -2){
                    grid[row][col] = 0;
                    System.out.println("Oppss! you got Bad Boom.");
                }
            } else {
                System.out.println("This number is already Exists!");
                do {
                    System.out.println("Enter number between 1-9: ");
                    showAvailableNumber (number);
                    user_input = sc.nextInt();
                } while (user_input < 1 || user_input > 9);
            }
            gridShow(grid);

        }
    }



    public void gridShow(int [][] grid)
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0; j<4; j++)
            {
                if ((grid[i][j]==-1) || (grid[i][j]==-2))
                {
                    System.out.print("0\t");
                }
                else
                {
                    System.out.print(grid [i][j]+"\t");
                }
            }
            System.out.println();
        }
    }

    public void findScore(int [][] grid)
    {
        int score=0;
        for (int i=0;i<4;i++)
        {
            for (int j=0; j<4; j++)
            {
                score+=grid[i][j];
            }
        }
        System.out.println("Your total Score: "+score);
    }
}

