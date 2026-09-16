import java.util.*;
public class GemAhoy {
    private final char[][] board;
    int size;
    private int gemCount;
    private final int bombCount;
    private int moves;

    private int explodedGem;

    public int getGemCount() {
        return gemCount;
    }

    public int getMoves() {
        return moves;
    }

    public int getExplodedGem() {
        return explodedGem;
    }
    public GemAhoy(int size, int gemCount, int bombCount) {
        this.size = size;
        this.gemCount = gemCount;
        this.bombCount = bombCount;
        board = new char[size][size];
        initializeBoard();
        placeGems();
        placeBombs();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void placeGems() {
        Random random = new Random();
        int count = 0;
        while (count < gemCount) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);
            if (board[row][col] == '-') {
                board[row][col] = 'g';
                count++;
            }
        }
    }

    private void placeBombs() {
        Random random = new Random();
        int count = 0;
        while (count < bombCount) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);
            if (board[row][col] == '-') {
                board[row][col] = 'b';
                count++;
            }
        }
    }

    public void uncoverAdjacentCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return;
        }
        if (board[row][col] == 'g') {
            moves++;
            explodedGem++;
            board[row][col] = 'E';
        } else if (board[row][col] == 'b') {
            moves++;
            board[row][col] = 'B';
            explodeAdjacentCells(row, col);
        } else {
            if (board[row][col]=='-')
            {
                moves++;
                board[row][col] = '*';
            }
        }
    }

    public void uncoverCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Invalid Slot Selection! ");
            return;
        }
        if (board[row][col]=='G' || board[row][col]=='B' || board[row][col]=='*' || board[row][col]=='x')
        {
            System.out.println("This Slot Is Already Uncover! ");
            return;
        }
        moves++;
        if (board[row][col] == 'g') {
            board[row][col] = 'G';
            gemCount--;
            System.out.println("Gem collected!");
        } else if (board[row][col] == 'b') {
            board[row][col] = 'B';
            System.out.println("Boom! Bomb exploded!");
            explodeAdjacentCells(row, col);
        } else {
            board[row][col] = 'x';
            System.out.println("Empty Slot! Try Again...");
        }
        displayBoard();
    }

    private void explodeAdjacentCells(int row, int col) {
        uncoverAdjacentCell(row, col - 1);
        uncoverAdjacentCell(row, col + 1);
        uncoverAdjacentCell(row - 1, col);
        uncoverAdjacentCell(row + 1, col);
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( board[i][j]=='g' || board[i][j]=='b')
                {
                    System.out.print("-\t");
                }
                else
                {
                    System.out.print(board[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
