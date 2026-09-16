public class Chap_6_22 {
    private static final int[][] board = new int[8][8]; // chessboard

    // possible moves for knight
    private static final int[] rowMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        int startX = 0; // starting x position
        int startY = 0; // starting y position

        // find solution starting at each position on board
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                resetBoard(); // reset board for each starting position
                solve(startX, startY);
            }
        }
    }

    private static void solve(int row, int col) {
        board[row][col] = 1; // mark starting position as visited

        if (isFinished()) { // solution found
            printBoard();
            return;
        }

        // try all possible moves
        for (int i = 0; i < 8; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];

            if (isValid(newRow, newCol)) { // check if move is valid
                solve(newRow, newCol); // recursive call with new position
            }
        }

        board[row][col] = 0; // backtrack - unmark position as visited
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8 && board[row][col] == 0;
    }

    private static boolean isFinished() {
        // check if all squares have been visited
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard() {
        // print out the solution
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void resetBoard() {
        // reset board to all zeros
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
    }
}
