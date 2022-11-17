package _3_spiralOrderMatrix_$;

/**
 * @author: cgr
 * @date: 2022/9/30 - 23:13
 */

/*  单词搜索
*   注意点：if 与 for循环在递归中执行过程不同
*
* */
public class WordSearch {
    public boolean flag;
    public int rows,columns;
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        columns = board.length;
        for(int i = 0;i<rows;++i){
            for(int j = 0;j<columns;++j){
                if(board[i][j] == word.charAt(0)){
                    helper(board,word,i,j,1);
                    if (!flag) continue;
                    else return true;
                }
            }
        }
        return false;
    }

    public void helper(char[][] board,String word,int i,int j,int cnt){
        if(word.length() == cnt) {
            flag = true;
            return;
        }

        if(i<0 || i>rows || j<0 || j>columns) return;
        if(i>0 && board[i-1][j] == word.charAt(cnt)) helper(board,word,i-1,j,cnt+1);
        if(j>0 && board[i][j-1] == word.charAt(cnt)) helper(board,word,i,j-1,cnt+1);
        if(i<rows-1 && board[i+1][j] == word.charAt(cnt)) helper(board,word,i+1,j,cnt+1);
        if(j<columns-1 && board[i][j+1] == word.charAt(cnt)) helper(board,word,i,j+1,cnt+1);
    }
}
