import java.util.Scanner;
public class TicTacToe {
    private static char[][] board;
    private static char currentPlayer;
    private static boolean gameEnded;
    public static void main(String[] args) {
        initializeBoard();
        currentPlayer = 'X';
        gameEnded = false;
        System.out.println("Welcome to Tic Tac Toe!");
        while (!gameEnded) {
            displayBoard();
            makeMove();
            checkGameStatus();
            switchPlayer();
        }
        displayBoard();
    }
    private static void initializeBoard() {
        board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }
    private static void displayBoard() {
        System.out.println("Board");
        System.out.println("--------");
        System.out.println("  0 1 2 Columns");
        for (int row = 0; row < 3; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    private static void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Player " + currentPlayer + ", enter the row (0-2):");
            row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", enter the column (0-2):");
            col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move. Try again.");
            } else {
                board[row][col] = currentPlayer;
                break;
            }
        } while (true);
    }
    private static void checkGameStatus() {
        if (checkWin()) {
            System.out.println("Player " + currentPlayer + " wins!");
            gameEnded = true;
        } else if (checkDraw()) {
            System.out.println("It's a draw!");
            gameEnded = true;
        }
    }
    private static boolean checkWin() {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }
    private static boolean checkDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}