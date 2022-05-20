# TicTacToe

This includes  .java and .class files. 
in my code

1.Board class deals with the creation of a game board and methods to use it, it includes 
 A.initialBoard() is to display the initial inteface of the game board which contains the integers from 1-9 indicating the position of the move,
 B.display() is to print the inteface of the gameBoard with the player move,
 C.printRow() is to print each row used in display() to print the gameboard
 D.playerspiece() is to assign a slot to player "X" or "O" if available. 
 E.compMove() is to assign a slot to computer with "O" this method assigns a slot to the
   computers move such that it tries to win(1st priority), draw(2nd priority) or lose(last priority) a match
 F.isBoardfull() is to check if the board is full or not. 

2.GamePlay class deals with the status of the game it includes
  A.checkWinner() is to check who is a winner after each move of players
  B.seeState() is to return the String "GameOn" if the game is not over,"X" if player X won and "O" if player O won.
    

3.TicTacToe class is the one which contains the main class.
 This class uses the previous two classes. first it will ask the user to to input his choice whether he wants to 
 play between two players or with the computer. then it takes the position of the move. then if anyone able to put his three symbol in a row or
 in column or in any diagonal then , he is declared as winner.

how to ru the program

1.compile the classes i.e .java file.
2.Run the TictacToe class i.e TicTacToe.java
3.Then it will ask your choice to play b/w two players or with the computer.
4. first the player with X will start. it will type the integer from 1-9 to put X. then if game is in between two players then it will ask for 
the position to put O otherwise if it is in between the user and the computer then  the O will be automatically be put at the position by the computer.
5. in this way game continues untill any player satisfies the winning condition. otherwise it may be ties if no one wion and the game board is filled completely.
6. after one game if we want to play again then we have to run the program again.
