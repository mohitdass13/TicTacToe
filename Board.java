import java.util.Random;

public class Board{
    
    private int[][] board=new int[3][3];

 public int[][] getBoard(){
 return board;
 }
    public void initialBoard(){
        System.out.printf("|-1-|-2-|-3-|\n");
        System.out.printf("|-----------|\n");
        System.out.printf("|-4-|-5-|-6-|\n");
        System.out.printf("|-----------|\n");
        System.out.printf("|-7-|-8-|-9-|\n");
    }

    public void display(){
        System.out.println(printRow(0));
        System.out.printf("|---|---|---|\n");
        System.out.println(printRow(1));
        System.out.printf("|---|---|---|\n");
        System.out.println(printRow(2));
    }

    private String printRow(int r){
        StringBuilder buildRow=new StringBuilder("| ");
        for(int i=0;i<board[0].length;i++){
            if(board[r][i]==0)
            buildRow.append(" ");
            if(board[r][i]==1)
            buildRow.append("X");
            if(board[r][i]==4)
            buildRow.append("O");

            buildRow.append(" | ");
        }
        buildRow.deleteCharAt(buildRow.lastIndexOf(" "));
        return buildRow.toString();
    }
public boolean playerspiece(int pos,String typeofplayer){
    int row=(pos-1)/3;
    int col=(pos-(row*3))-1;
    if(board[row][col]==0){
        if(typeofplayer=="X")
        board[row][col]=1;
        if(typeofplayer=="O")
        board[row][col]=4;
        return true;
    }
    return false;
}
//code for optimal  computer moves
public boolean compMove(){
int possible=-1;

 if(board[0][0]+board[0][1]+board[0][2]==8 || board[1][0]+board[1][1]+board[1][2]==8 || board[2][0]+board[2][1]+board[2][2]==8 || board[0][0]+board[1][0]+board[2][0]==8 || board[0][1]+board[1][1]+board[2][1]==8 || board[0][2]+board[1][2]+board[2][2]==8 ||board[0][0]+board[1][1]+board[2][2]==8 || board[0][2]+board[1][1]+board[2][0]==8){
          if(board[0][0]+board[0][1]+board[0][2]==8)possible=0; 
          if(board[1][0]+board[1][1]+board[1][2]==8)possible=1;
          if(board[2][0]+board[2][1]+board[2][2]==8)possible=2;
          if(board[0][0]+board[1][0]+board[2][0]==8)possible=3;
          if(board[0][1]+board[1][1]+board[2][1]==8)possible=4;
          if(board[0][2]+board[1][2]+board[2][2]==8)possible=5;
          if(board[0][0]+board[1][1]+board[2][2]==8)possible=6;
          if(board[0][2]+board[1][1]+board[2][0]==8)possible=7;
          
            if(possible==0 || possible==1 || possible==2){
            for(int i=0;i<board[possible].length;i++){
            if(board[possible][i]==0){
            board[possible][i]=4;return true;}
            }  }
            else if(possible==3|| possible==4|| possible==5){
            for(int i=0;i<board[possible-3].length;i++){
            if(board[i][possible-3]==0){
            board[i][possible-3]=4;return true;}   
                     
            }}
            else if(possible==6){
                for(int i=0;i<board[possible-6].length;i++){
                    if(board[i][i]==0){
                        board[i][i]=4;return true;
                    }
                }
            }
            else if(possible==7){
                if(board[0][2]==0){
                board[0][2]=4;return true;}
                else if(board[1][1]==0){
                board[1][1]=4;return true;}
                else if(board[2][0]==0){
                board[2][0]=4;return true;}
            } 
 
 }     
   
   
 else if(board[0][0]+board[0][1]+board[0][2]==2 || board[1][0]+board[1][1]+board[1][2]==2 || board[2][0]+board[2][1]+board[2][2]==2 || board[0][0]+board[1][0]+board[2][0]==2 || board[0][1]+board[1][1]+board[2][1]==2 || board[0][2]+board[1][2]+board[2][2]==2 ||board[0][0]+board[1][1]+board[2][2]==2 || board[0][2]+board[1][1]+board[2][0]==2){
          if(board[0][0]+board[0][1]+board[0][2]==2)possible=0; 
          if(board[1][0]+board[1][1]+board[1][2]==2)possible=1;
          if(board[2][0]+board[2][1]+board[2][2]==2)possible=2;
          if(board[0][0]+board[1][0]+board[2][0]==2)possible=3;
          if(board[0][1]+board[1][1]+board[2][1]==2)possible=4;
          if(board[0][2]+board[1][2]+board[2][2]==2)possible=5;
          if(board[0][0]+board[1][1]+board[2][2]==2)possible=6;
          if(board[0][2]+board[1][1]+board[2][0]==2)possible=7;
          
            if(possible==0 || possible==1 || possible==2){
            for(int i=0;i<board[possible].length;i++){
            if(board[possible][i]==0){
            board[possible][i]=4;return true;}
            }  }
            else if(possible==3|| possible==4|| possible==5){
            for(int i=0;i<board[possible-3].length;i++){
            if(board[i][possible-3]==0){
            board[i][possible-3]=4;return true;}   
                     
            }}
            else if(possible==6){
                    if(board[0][0]==0){
                        board[0][0]=4;return true;
                    }
                 if(board[1][1]==0){
                        board[1][1]=4;return true;
                    }
                  if(board[2][2]==0){
                        board[2][2]=4;return true;
                    }
                
            }
            else if(possible==7){
                if(board[0][2]==0){
                board[0][2]=4;return true;}
                else if(board[1][1]==0){
                board[1][1]=4;return true;}
                else if(board[2][0]==0){
                board[2][0]=4;return true;}
            } 
 
 }       
         
else if(board[0][0]+board[0][1]+board[0][2]==4 || board[1][0]+board[1][1]+board[1][2]==4 || board[2][0]+board[2][1]+board[2][2]==4 || board[0][0]+board[1][0]+board[2][0]==4 || board[0][1]+board[1][1]+board[2][1]==4 || board[0][2]+board[1][2]+board[2][2]==4 ||board[0][0]+board[1][1]+board[2][2]==4 || board[0][2]+board[1][1]+board[2][0]==4){
          if(board[0][0]+board[0][1]+board[0][2]==4)possible=0; 
          if(board[1][0]+board[1][1]+board[1][2]==4)possible=1;
          if(board[2][0]+board[2][1]+board[2][2]==4)possible=2;
          if(board[0][0]+board[1][0]+board[2][0]==4)possible=3;
          if(board[0][1]+board[1][1]+board[2][1]==4)possible=4;
          if(board[0][2]+board[1][2]+board[2][2]==4)possible=5;
          if(board[0][0]+board[1][1]+board[2][2]==4)possible=6;
          if(board[0][2]+board[1][1]+board[2][0]==4)possible=7;
          
            if(possible==0 || possible==1 || possible==2){
            for(int i=0;i<board[possible].length;i++){
            if(board[possible][i]==0){
            board[possible][i]=4;return true;}
            }  }
            else if(possible==3|| possible==4|| possible==5){
            for(int i=0;i<board[possible-3].length;i++){
            if(board[i][possible-3]==0){
            board[i][possible-3]=4;return true;}   
                     
            }}
            else if(possible==6){
                for(int i=0;i<board[possible-6].length;i++){
                    if(board[i][i]==0){
                        board[i][i]=4;return true;
                    }
                }
            }
            else if(possible==7){
                if(board[0][2]==0){
                board[0][2]=4;return true;}
                else if(board[1][1]==0){
                board[1][1]=4;return true;}
                else if(board[2][0]==0){
                board[2][0]=4;return true;}
            } 
 
 }  
     
    
    
else{
int row=new Random().nextInt(3);
int col=new Random().nextInt(3);

while(!isBoardfull()){
    if(board[row][col]==0){
        board[row][col]=4;
        return true;
    }
    else{
        row=new Random().nextInt(3);
        col=new Random().nextInt(3);
    }   
}
}    


return false;
}

public boolean isBoardfull(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           if(board[i][j]==0)
           return false;
        }
        
    }return true;

}
}
