public class GamePlay{

    public static String checkWinner(int[][] board,int pos){
        int row=(pos-1)/3;

        int col=(pos-(row*3))-1;


        if(row>=0 && row<3 && col>=0 && col<3){

        for(int i=0;i<8;i++){
            int c=0;
        switch(i){
            case 0:c=board[0][0]+board[0][1]+board[0][2];
            break;
            case 1:c=board[1][0]+board[1][1]+board[1][2];
            break;
            case 2:c=board[2][0]+board[2][1]+board[2][2];
            break;
            case 3:c=board[0][0]+board[1][0]+board[2][0];
            break;
            case 4:c=board[0][1]+board[1][1]+board[2][1];
            break;
            case 5:c=board[0][2]+board[1][2]+board[2][2];
            break;
            case 6:c=board[0][0]+board[1][1]+board[2][2];
            break;
            case 7:c=board[0][2]+board[1][1]+board[2][0];
            break;
        }    
        if(c==3){
            return "X";
        }
        else if(c==12){
            return "O";
        }

 
        }}
        return "GameOn"; }


public static String seeState(int[][] board,int pos){
    for(int row=0;row<board.length;row++){
        for(int col=0;col<board.length;col++){

            if(checkWinner(board,pos)!="GameOn"){
                return checkWinner(board,pos);
            }
        }
    }
    return "GameOn";
}    

}
