import java.util.Scanner;

public class TicTacToe {
    private enum Cell {
        X, O, EMPTY
    }

    private Cell[][] board;
    private int currentPlayer;

    public TicTacToe() {
        board = new Cell[3][3];
        currentPlayer = 1;

        // Initialize the board with EMPTY cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
    }

    public void playGame() {
        boolean gameOver = false;
        int movesCount = 0;

        while (!gameOver && movesCount < 9) {
            drawBoard();

            // Get the current player's move
            int row, col;
            do {
                System.out.print("Player " + currentPlayer + ", enter your move (row [0-2] and column [0-2]): ");
                Scanner scanner = new Scanner(System.in);
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!isValidMove(row, col));

            // Place the current player's mark (X or O) on the board
            if (currentPlayer == 1)
                board[row][col] = Cell.X;
            else
                board[row][col] = Cell.O;

            // Check if the current player wins
            if (isWinningMove(row, col)) {
                drawBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } else {
                // Switch to the next player
                currentPlayer = currentPlayer == 1 ? 2 : 1;
                movesCount++;
            }
        }

        if (!gameOver) {
            drawBoard();
            System.out.println("It's a draw!");
        }
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3)
            return false;

        return board[row][col] == Cell.EMPTY;
    }

    private boolean isWinningMove(int row, int col) {
        Cell currentCell = board[row][col];

        // Check row
        if (board[row][0] == currentCell && board[row][1] == currentCell && board[row][2] == currentCell)
            return true;

        // Check column
        if (board[0][col] == currentCell && board[1][col] == currentCell && board[2][col] == currentCell)
            return true;

        // Check diagonal
        if (row == col && board[0][0] == currentCell && board[1][1] == currentCell && board[2][2] == currentCell)
            return true;

        // Check anti-diagonal
        if (row + col == 2 && board[0][2] == currentCell && board[1][1] == currentCell && board[2][0] == currentCell)
            return true;

        return false;
    }

    private void drawBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.X)
                    System.out.print("X");
                else if (board[i][j] == Cell.O)
                    System.out.print("O");
                else
                    System.out.print(" ");

                System.out.print(" | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
