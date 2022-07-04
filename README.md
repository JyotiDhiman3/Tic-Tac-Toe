# Tic-Tac-Toe
Implemented Tic-Tac-Toe game using Java programming language.
In Tic-Tac-Toe game here, I have implemented the code in such a way that the user is firstly welcomed to the game.
Then, the user will be asked to enter 0 or 1.
0 will start player vs player game and 1 will start computer vs player game.
After entering 0, the user will enter the rows and columns according to the place where the user wants to put the
value (O or X). Two players will put O and X in the game board according to their choice.
Now,when the player will enter their choices in such a way that their symbol gets same row-wise,column-wise or 
diagonal-wise, then that particular player will win the game.The player who succeeds in placing three respective
marks in a horizontal, vertical, or diagonal row wins the game.

When the user will choose 1, the computer vs player game will get started. The computer will be assigned O symbol and
the player will be assigned X symbol.The player always moves first.
The computer's turn is made in such a way that it tries to win against the user. It will try to win the match by matching
its symbol row-wise,column-wise or diagonally.If it becomes unable to do so,then it will atleast try to defend the match
by carefully analysing where the user has input its symbols. it will try to make the user lose the match.
Random number generator,using the Math class, has also been used to generate the values for row and column.
The program ends when the game is won by either player or the game is a draw.

A Board class is made in the program which contains functions like draw and create. 
The objects made of Board class are newboardforPvsP and newboardforPvsC.
I have used functions like hasWon and hasTied. hasWon function is written in 
a way that it will help us determining who has won. And hasTied funvtion tells us if both the players did not ein and lose
i.e. the match has tied.
