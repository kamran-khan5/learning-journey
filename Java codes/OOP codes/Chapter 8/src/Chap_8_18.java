import java.util.Scanner;

class Tic_Tac_Toc {
    private mark[][] array;
    private int user;
    int current_user=user;

    public Tic_Tac_Toc() {
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

        public void move() {
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
            }while (!isSlotEmpty(row,col));

            if (current_user==1)
            {
                array[row][col]=mark.X;
            }
            else {
                array[row][col]=mark.O;
            }

        }
    public boolean isDiagonalComplete(){
        return array[0][0]==array[1][1]&&array[1][1]==array[2][2]
                ||array[0][2]==array[1][1]&&array[1][1]==array[2][0] ;
    }
    public boolean isRowComplete(){
        for(int i=0;i<3;i++){
            int count=0;
            for(int j=1;j< array[i].length;j++){
                if(array[i][0]==array[i][j])
                {
                    count++;
                }
            }
            if (count==2)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isColComplete(){

        for(int i=0;i<3;i++){
            int count=0;
            for(int j=1;j< array[i].length;j++){
                if(array[0][i]==array[j][i])
                {
                    count++;
                }
            }
            if (count==2)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isGameWin()
    {
        return isRowComplete() || isColComplete()|| isDiagonalComplete();
    }

    private boolean isSlotEmpty(int row,int col)
    {
        return array[row][col]==mark.EMPTY;
    }
    public void playgame(){
        int moves=0;
        while (moves<10)
        {

        }



    }



}



enum mark{X,O,EMPTY}




class Chap_8_18 {
    public static void main(String[] args) {
        System.out.println("Welcome.");

    }
}
