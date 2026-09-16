import java.util.Scanner;

class TicTacToeGame {
    private mark[][] array;
    private int user;

    public TicTacToeGame() {
        array = new mark[3][3];
        initilizedBoard();
        user=1;
    }

    public void initilizedBoard() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = mark.EMPTY;
            }
        }
    }

//        public void move() {
//            Scanner sc = new Scanner(System.in);
//            int row, col;
//            do {
//                do {
//                    System.out.print("enter the no of row: (0-2)");
//                    row = sc.nextInt();
//                    if (row < 0 || row > 3) {
//                        System.out.println("invalid input.");
//                    }
//                } while (row < 0 || row > 3);
//
//                do {
//                    System.out.print("enter the no of col:(0-2) ");
//                    col = sc.nextInt();
//                    if (col < 0 || col > 3) {
//                        System.out.println("invalid input.");
//                    }
//                } while (col < 0 || col > 3);
//            }while (!isSlotEmpty(row,col));
//
//        }
//    public boolean isDiagonalComplete(){
//        return array[0][0]==array[1][1]&&array[1][1]==array[2][2]
//                ||array[0][2]==array[1][1]&&array[1][1]==array[2][0] ;
//    }
//    public boolean isRowComplete(){
//        for(int i=0;i<3;i++){
//            int count=0;
//            for(int j=1;j< array[i].length;j++){
//                if(array[i][0]==array[i][j])
//                {
//                    count++;
//                }
//            }
//            if (count==2)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isColComplete(){
//
//        for(int i=0;i<3;i++){
//            int count=0;
//            for(int j=1;j< array[i].length;j++){
//                if(array[0][i]==array[j][i])
//                {
//                    count++;
//                }
//            }
//            if (count==2)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isGameWin()
//    {
//        return isRowComplete() || isColComplete()|| isDiagonalComplete();
//    }

    private boolean isWinningMove(int row, int col) {
        mark currentCell = array[row][col];

        // Check row
        if (array[row][0] == currentCell && array[row][1] == currentCell && array[row][2] == currentCell)
            return true;

        // Check column
        if (array[0][col] == currentCell && array[1][col] == currentCell && array[2][col] == currentCell)
            return true;

        // Check diagonal
        if (row == col && array[0][0] == currentCell && array[1][1] == currentCell && array[2][2] == currentCell)
            return true;

        // Check anti-diagonal
        if ((row + col == 2) && (array[0][2] == currentCell) && array[1][1] == currentCell && array[2][0] == currentCell)
            return true;

        return false;
    }

    private boolean isSlotEmpty(int row,int col)
    {
        return array[row][col]==mark.EMPTY;
    }

    public void showGrid(){
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[i].length;j++)
            {
                if (array[i][j]==mark.EMPTY)
                {
                    System.out.print("   ");
                }
                else if (array[i][j]==mark.X)
                {
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" O ");
                }

                if (j!=array[i].length-1)
                {
                    System.out.print("|");
                }
            }
            if (i!=array.length-1)
            {
                System.out.println("\n-----------");
            }
        }
        System.out.println();
    }

    public void start()
    {
        int moves=0;
        while (moves<9)
        {
            showGrid();
            System.out.println("Player: "+user);
            Scanner sc = new Scanner(System.in);
            int row, col;
            do {
                do {
                    System.out.print("enter the no of row: (0-2)");
                    row = sc.nextInt();
                    if (row < 0 || row > 3) {
                        System.out.println("invalid input.");
                    }
                } while (row < 0 || row > 3);

                do {
                    System.out.print("enter the no of col:(0-2) ");
                    col = sc.nextInt();
                    if (col < 0 || col > 3) {
                        System.out.println("invalid input.");
                    }
                } while (col < 0 || col > 3);
                if (!isSlotEmpty(row,col))
                {
                    System.out.println("This slot already used");
                }
            }while (!isSlotEmpty(row,col));

            if (user == 1)
                array[row][col] = mark.X;
            else
                array[row][col] = mark.O;

            if (isWinningMove(row,col))
            {
                showGrid();
                System.out.println("Player: "+user+" Win the game...");
                return;
            }
            moves++;
            user=user==1?2:1;
        }
        System.out.println("Game is draw...");
    }

}

class Game {
    public static void main(String[] args) {
        System.out.println("Welcome.");
        TicTacToeGame game=new TicTacToeGame();
        game.start();
    }
}
