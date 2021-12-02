
import java.util.Scanner;

public class Proj6_2_TicTacToe {

    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        String winner;
        String input;
        String[][] gameBoard = new String[3][3];
        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);


        System.out.println("who wants to play first \"X\" or \"O\"?");

        boolean xTurn = false;
        do {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if (input.equals("X"))
                xTurn = true;
            else if (input.equals("O"))
                xTurn = false;
            else
                System.out.println("You have entered wrong player please select \"X\" or \"O\" only");
        } while (!(input.equals("X") || input.equals("O")));


        while (!isBoardFull(gameBoard)) {
            if (xTurn) {
                System.out.println("It is X's turn");
                getUserInput(xTurn, gameBoard);
                printCurrentBoard(gameBoard);
                xTurn = false;
                winner = getWinner(gameBoard);
            } else {
                System.out.println("It is O's turn");
                getUserInput(xTurn, gameBoard);
                printCurrentBoard(gameBoard);
                xTurn = true;
                winner = getWinner(gameBoard);
            }

            if (winner.contains("X") || winner.contains("O") || isBoardFull(gameBoard)) {
                if (winner.isEmpty()) {
                    System.out.println("This game is a tie!");
                    break;
                }

                System.out.println(winner + " has won this game! Congratulations " + winner);
                break;
            }

        }
    }

    public static void initializeGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (int i = 0; i < row.length; i++) {
                row[i] = " ";
            }
        }

    }

    public static void printCurrentBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (i == 1)
                System.out.println("- - - - -");
            for (int j = 0; j < gameBoard.length; j++) {
                if (j == 1) {
//                    System.out.print("|"+gameBoard[i][j]+"|");
                    System.out.print("| " + gameBoard[i][j] + " |");

                    continue;
                }
//                System.out.print(""+gameBoard[i][j]+"");
                if (j == 0)
                    System.out.print(gameBoard[i][j] + " ");
                else
                    System.out.print(" " + gameBoard[i][j]);

            }
            System.out.println();
            if (i == 1)
                System.out.println("- - - - -");


        }
    }

    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the row THEN the column, each from 0, 1 or 2, separated by a space");
        int row;
        int column;

        do {
            row = scanner.nextInt();
            column = scanner.nextInt();
            scanner.nextLine();
            if ((row < 0 || row > 2) && (column < 0 || column > 2)) {
                System.out.println("Please enter valid input for row and column, each should be either 0, 1 or 2");
                continue;
            }
            if (cellAlreadyOccupied(row, column, gameBoard)) {
                System.out.println("The cell is already occupied by " + gameBoard[row][column] + " please choose another cell");
                continue;
            }
        } while (((row < 0 || row > 2) && (column < 0 || column > 2)) || cellAlreadyOccupied(row, column, gameBoard));

        if (xTurn)
            gameBoard[row][column] = "X";
        else
            gameBoard[row][column] = "O";
    }

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].contains(" ");
    }

    public static String getWinner(String[][] gameBoard) {
        String[] players = {"X", "O"};

        for (String player : players) {
            //row checker
            for (int row = 0; row < 3; row++) {
                int col = 0;
                if (gameBoard[row][col].contains(player) && gameBoard[row][col + 1].contains(player) && gameBoard[row][col + 2].contains(player))
                    return player;
            }

            //column checker
            for (int col = 0; col < 3; col++) {
                int row = 0;
                if (gameBoard[row][col].contains(player) && gameBoard[row + 1][col].contains(player) && gameBoard[row + 2][col].contains(player))
                    return player;
            }

            //diagonal checker
            boolean diagonalWin = false;
            for (int row = 0, col_1 = 0, col_3 = 2; row < 3 && col_3 >= 0; row++, col_1++, col_3--) {
                if (gameBoard[row][col_1].contains(player) || gameBoard[row][col_3].contains(player)) {
                    diagonalWin = true;
                    continue;
                }
                diagonalWin = false;
            }
            if (diagonalWin)
                return player;
        }
        return "";
    }

    public static boolean isBoardFull(String[][] gameBoard) {
        for (String[] arr : gameBoard) {
            for (String element : arr) {
                if (element.equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean isBoardEmpty(String[][] gameBoard) {
//        for (String[] arr : gameBoard) {
//            for (String element : arr) {
//                if (!element.equals(" ")) {
//                    return false;
//                }
//
//            }
//        }
//        return true;
//    }
}
