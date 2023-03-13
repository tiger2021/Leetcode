package Hot100;

/**
 * @ClassName H79单词搜索
 * @Author 小镇做题家
 * @Function:
 */
public class H79单词搜索 {
    public boolean exist(char[][] board, String word) {
        int[][] mark=new int[board.length][board[0].length];
        for (int i = 0; i < mark.length; i++) {
            for(int j=0;j<mark[0].length;++j){
                mark[i][j]=0;
            }
        }
        int index=-1;
        int[] coordinate=new int[]{-1,-1};
        boolean result=false;
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                if(board[i][j]==word.charAt(0)){
                    coordinate[0]=i;
                    coordinate[1]=j;
                    index=0;
                    mark[i][j]=1;
                    result=backTrace(mark, board, word, index, coordinate);
                    if(result==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean backTrace(int[][] mark,char[][] board,String word,int index,int[]coordinate){
        int x=coordinate[0];
        int y=coordinate[1];
        if(word.charAt(index)!=board[x][y]){
            --index;
            return false;
        }else{
            if(index==word.length()-1){
                return true;
            }
            ++index;
            mark[x][y]=1;
            if(x<board.length-1 && mark[x+1][y]==0){
                coordinate[0]=x+1;
                coordinate[1]=y;
                boolean r = backTrace(mark, board, word, index, coordinate);
                if(r==true){
                    return r;
                }
            }
            if(y<board[0].length-1 && mark[x][y+1]==0){
                coordinate[0]=x;
                coordinate[1]=y+1;
                boolean r = backTrace(mark, board, word, index, coordinate);
                if(r==true){
                    return r;
                }
            }
            if(y>0 && mark[x][y-1]==0){
                coordinate[0]=x;
                coordinate[1]=y-1;
                boolean r = backTrace(mark, board, word, index, coordinate);
                if(r==true){
                    return r;
                }
            }
            if(x>0 && mark[x-1][y]==0){
                coordinate[0]=x-1;
                coordinate[1]=y;
                boolean r = backTrace(mark, board, word, index, coordinate);
                if(r==true){
                    return r;
                }
            }
            --index;
            mark[x][y]=0;
            coordinate[0]=x;
            coordinate[1]=y;
            return false;
        }
    }
}
