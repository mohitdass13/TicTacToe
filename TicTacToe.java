import java.util.*;

public class TicTacToe{
    public static void main(String[] args){
     Scanner In1 = new Scanner(System.in);
     Scanner In2 = new Scanner(System.in);
     Scanner option = new Scanner(System.in);
     
     Board board=new Board();
     board.initialBoard();
     System.out.printf("Press 1 to play between two players or Press 2 to play with computer: ");
     int opt=option.nextInt();
     
    if(opt==1){
        System.out.println("Player X will take the first move.");
        System.out.printf("Enter the position to put X: ");
        int pos1=Integer.parseInt(In1.nextLine());
        board.playerspiece(pos1,"X");
        board.display();
        int Gamestatus=0;
        if(GamePlay.seeState(board.getBoard(),pos1)=="GameOn")
        Gamestatus=0;

        while(Gamestatus==0 && !board.isBoardfull()){
            System.out.printf("Enter the position to put O:");
            int pos2=Integer.parseInt(In2.nextLine());
            board.playerspiece(pos2,"O");
            if(GamePlay.seeState(board.getBoard(),pos2)=="X" || GamePlay.seeState(board.getBoard(),pos2)=="O"){
            Gamestatus=1;break;}
            board.display();
            System.out.printf("Enter the position to put X: ");
            pos1=Integer.parseInt(In1.nextLine());
            board.playerspiece(pos1,"X");
            board.display();
           if(GamePlay.seeState(board.getBoard(),pos1)=="X" || GamePlay.seeState(board.getBoard(),pos1)=="O"){
           Gamestatus=1;break;}

        }
        if(Gamestatus==0 && board.isBoardfull()){
            board.display();
            System.out.printf("Tie.... Game Over!");
        }
        else if(GamePlay.seeState(board.getBoard(),pos1)=="X"){
        board.display();
        System.out.printf("Player X won !");}
        else if(GamePlay.seeState(board.getBoard(),pos1)=="O"){
        board.display();
        System.out.printf("Player O Won!");}
        else board.display();
    }
     
    else if(opt==2){  
    System.out.println("Player X will take first move.");
        System.out.printf("Enter the position to put X: ");
        int pos1=Integer.parseInt(In1.nextLine());
        board.playerspiece(pos1,"X");

        int Gamestatus=0;
        if(GamePlay.seeState(board.getBoard(),pos1)=="GameOn")
        Gamestatus=0;

        while(Gamestatus==0 && !board.isBoardfull()){
            board.compMove();
            
      if(GamePlay.seeState(board.getBoard(),pos1)=="X" || GamePlay.seeState(board.getBoard(),pos1)=="O"){
        Gamestatus=1;break;}
            board.display();
            System.out.printf("Enter the position to put X: ");
            pos1=Integer.parseInt(In1.nextLine());
            board.playerspiece(pos1,"X");
           
           if(GamePlay.seeState(board.getBoard(),pos1)=="X" || GamePlay.seeState(board.getBoard(),pos1)=="O"){
           Gamestatus=1;break;}

        }
        if(Gamestatus==0 && board.isBoardfull()){
            board.display();
            System.out.printf("Tie......Game Over!");
        }
        else if(GamePlay.seeState(board.getBoard(),pos1)=="X"){
        board.display();
        System.out.printf("Player X won !");}
        else if(GamePlay.seeState(board.getBoard(),pos1)=="O"){
        board.display();
        System.out.printf("Playe O won !");}
        else board.display();
    }
     
     else{
          System.out.printf("Incorrect Move....Start the game again !");
          
     }
    }
}
