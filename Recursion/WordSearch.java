package Recursion;

public class WordSearch {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCEDA";
        boolean result = w.helper(board,word);
        System.out.println(result);
    }
    public boolean helper(char board[][],String word){
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfs(word,board,0,i,j,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(String word,char board[][],int index,int i,int j,boolean visited[][]){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length||j>=board[0].length){
            return false;
        }
        if(visited[i][j] || word.charAt(index)!=board[i][j]){
            return false;
        }
            
        visited[i][j]=true;
        boolean found =
                dfs(word,board, index + 1, i - 1, j, visited) || // up
                dfs(word,board, index + 1, i + 1, j, visited) || // down
                dfs(word,board, index + 1, i, j - 1, visited) || // left
                dfs(word,board, index + 1, i, j + 1, visited);   // right
        visited[i][j] = false;
        return found;
    }
}
