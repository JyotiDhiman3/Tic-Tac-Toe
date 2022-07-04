//Name : Jyoti Dhiman
//Entry Number : 2020CSB1092
//Lab 2

import java.util.Scanner;

class Board {

    char[][] board = new char[3][3]; //creating a 2D array for making game board

    public void create(char[][] board) {

        //making the board with dashes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    //drawing the board
    public void draw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    //computer's turn
    public void computerturn(char[][] board) {
        char c = 'O';
        int row = 0;
        int col = 0;

        //Computer will try to win the game
        //It will try to win the game by matching along the row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == '-') {
                board[i][2] = c;
                return;
            } else if (board[i][0] == 'O' && board[i][1] == '-' && board[i][2] == 'O') {
                board[i][1] = c;
                return;
            } else if (board[i][0] == '-' && board[i][1] == 'O' && board[i][2] == 'O') {
                board[i][0] = c;
                return;
            }
        }
        //It will try to win the game by matching along the column
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == '-') {
                board[2][i] = c;
                return;
            } else if (board[0][i] == 'O' && board[1][i] == '-' && board[2][i] == 'O') {
                board[1][i] = c;
                return;
            } else if (board[0][i] == '-' && board[1][i] == 'O' && board[2][i] == 'O') {
                board[0][i] = c;
                return;
            }
        }
        //It will try to win the game by matching along the diagonal
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == '-') {
            board[2][2] = c;
            return;
        } else if (board[0][0] == 'O' && board[1][1] == '-' && board[2][2] == 'O') {
            board[1][1] = c;
            return;
        } else if (board[0][0] == '-' && board[1][1] == 'O' && board[2][2] == 'O') {
            board[0][0] = c;
            return;
        } else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == '-') {
            board[0][2] = c;
            return;
        } else if (board[2][0] == 'O' && board[1][1] == '-' && board[0][2] == 'O') {
            board[1][1] = c;
            return;
        } else if (board[2][0] == '-' && board[1][1] == 'O' && board[0][2] == 'O') {
            board[2][0] = c;
            return;
        }
        //Defending the match
        //along the row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == '-') {
                board[i][2] = c;
                return;
            } else if (board[i][0] == 'X' && board[i][1] == '-' && board[i][2] == 'X') {
                board[i][1] = c;
                return;
            } else if (board[i][0] == '-' && board[i][1] == 'X' && board[i][2] == 'X') {
                board[i][0] = c;
                return;
            }
        }
        //along the column
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == '-') {
                board[2][i] = c;
                return;
            } else if (board[0][i] == 'X' && board[1][i] == '-' && board[2][i] == 'X') {
                board[1][i] = c;
                return;
            } else if (board[0][i] == '-' && board[1][i] == 'X' && board[2][i] == 'X') {
                board[0][i] = c;
                return;
            }
        }
        //along the diagonal
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-') {
            board[2][2] = c;
            return;
        } else if (board[0][0] == 'X' && board[1][1] == '-' && board[2][2] == 'X') {
            board[1][1] = c;
            return;
        } else if (board[0][0] == '-' && board[1][1] == 'X' && board[2][2] == 'X') {
            board[0][0] = c;
            return;
        } else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == '-') {
            board[0][2] = c;
            return;
        } else if (board[2][0] == 'X' && board[1][1] == '-' && board[0][2] == 'X') {
            board[1][1] = c;
            return;
        } else if (board[2][0] == '-' && board[1][1] == 'X' && board[0][2] == 'X') {
            board[2][0] = c;
            return;
        }
        //random number generator
        row = (int) ((10 * Math.random()) % 3);
        col = (int) ((10 * Math.random()) % 3);
        if (board[row][col] == '-') {
            board[row][col] = c;
            return;
        }
    }

    public char hasWon(char[][] board) {
        // row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }
        // col
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[2][j] == board[0][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }
        // diagonally
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }
        // nobody has won
        return '-';
    }

    // check if the board is full
    public boolean hasTied(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}

public class TicTacToe {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe game");
        System.out.println("Press 0 if you want to play Player vs Player game");
        System.out.println("Press 1 if you want to play Computer vs Player game");

        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        if (game == 0) {
            Board newboardforPvsP = new Board(); //an object newboardforPvsP of class Board is made
            newboardforPvsP.create(newboardforPvsP.board);
            System.out.println("Player vs Player game has begun!");
            System.out.println("Player1 is X and Player2 is O");

           //keeping track of whose turn it is
            boolean isPlayer1 = true;

            //keep track if the game has ended
            boolean gameEnded = false;

            while (!gameEnded) {
                // drawing the board
                newboardforPvsP.draw(newboardforPvsP.board);

                // keep track of what symbol we are using to play
                char symbol = '-';
                if (isPlayer1) {
                    symbol = 'X';
                } else {
                    symbol = 'O';
                }
                // print out players's turn
                if (isPlayer1) {
                    System.out.println("Player1's turn(X):");
                } else {
                    System.out.println("Player2's turn(O):");
                }
                // row and col variables
                int row = 0;
                int col = 0;

                while (true) {
                    // getting row and column from user
                    System.out.print("Enter a row(0,1 or 2):");
                    row = in.nextInt();
                    System.out.print("Enter a col(0,1 or 2):");
                    col = in.nextInt();
                    System.out.println();
                    // checking if row and columns are valid
                    if (row < 0 || col < 0 || row > 2 || col > 2) {
                        System.out.println("You have entered an invalid row or column!");
                    } else if (newboardforPvsP.board[row][col] != '-') {
                        System.out.println("This place is already taken!");

                    } else {
                        // rows and columns are valid
                        break;
                    }
                }

                // setting the position on the board to the player's symbol
                newboardforPvsP.board[row][col] = symbol;

                // check if a player has won
                if (newboardforPvsP.hasWon(newboardforPvsP.board) == 'X') {
                    // player 1 has won
                    System.out.println("Player1 has won!");
                    gameEnded = true;
                } else if (newboardforPvsP.hasWon(newboardforPvsP.board) == 'O') {
                    // player 2 has won
                    System.out.println("Player2 has won!");
                    gameEnded = true;
                } else {
                    // nobody won
                    if (newboardforPvsP.hasTied(newboardforPvsP.board)) {
                        // tied
                        System.out.println("It's a tie!");
                        gameEnded = true;
                    } else {
                        // continue the game
                        isPlayer1 = !isPlayer1;
                    }
                }
            }
            // print out the final state of the board
            newboardforPvsP.draw(newboardforPvsP.board);
        } else {
            System.out.println("Player vs Computer game has begun!");
            System.out.println("Player is X and Computer is O");
            Board newboardforPvsC = new Board(); //an object newboardforPvsC of class Board is made
            newboardforPvsC.create(newboardforPvsC.board);

            // keeping track of whose turn it is
            boolean isPlayer1 = true;

            // keeping track if the game has ended
            boolean gameEnded = false;

            while (!gameEnded) {
                // drawing the board
                newboardforPvsC.draw(newboardforPvsC.board);

                // keep track of what symbol we are using to play
                char symbol = '-';
                if (isPlayer1) {
                    symbol = 'X';
                } else {
                    symbol = 'O';
                }
                // print out players's turn
                if (isPlayer1) {
                    System.out.println("Player1's turn(X):");

                    // row and col variables
                    int row = 0;
                    int col = 0;

                    while (true) {
                        // getting row and column from user
                        System.out.print("Enter a row(0,1 or 2):");
                        row = in.nextInt();
                        System.out.print("Enter a col(0,1 or 2):");
                        col = in.nextInt();
                        System.out.println();
                        // checking if row and columns are valid
                        if (row < 0 || col < 0 || row > 2 || col > 2) {
                            System.out.println("You have entered an invalid row or column!");
                        } else if (newboardforPvsC.board[row][col] != '-') {
                            System.out.println("This place is already taken!");

                        } else {
                            // rows and columns are valid
                            break;
                        }
                    }

                    // setting the position on the board to the player's symbol
                    newboardforPvsC.board[row][col] = symbol;

                    // check if a player has won
                    if (newboardforPvsC.hasWon(newboardforPvsC.board) == 'X') {
                        // player 1 has won
                        System.out.println("Player1 has won!");
                        gameEnded = true;
                    } else {
                        // nobody won
                        if (newboardforPvsC.hasTied(newboardforPvsC.board)) {
                            // tied
                            System.out.println("It's a tie!");
                            gameEnded = true;
                        } else {
                            // continue the game
                            isPlayer1 = false;
                        }

                    }
                } else {
                    System.out.println("Here is the board after Computer's turn :");
                    newboardforPvsC.computerturn(newboardforPvsC.board);
                    // check if a Computer has won
                    if (newboardforPvsC.hasWon(newboardforPvsC.board) == 'O') {
                        // player 1 has won
                        System.out.println("Computer has won!");
                        gameEnded = true;
                    } else {
                        // nobody won
                        if (newboardforPvsC.hasTied(newboardforPvsC.board)) {
                            // tied
                            System.out.println("It's a tie!");
                            gameEnded = true;
                        } else {
                            // continue the game
                            isPlayer1 = true;
                        }

                    }
                }
            }
        }

    }
}
