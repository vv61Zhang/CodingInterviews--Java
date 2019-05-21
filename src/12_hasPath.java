import java.util.*;
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(rows <= 0 || cols <= 0 || matrix.length !=rows*cols || str==null || str.length<=0) return false;
        boolean[][] flag = new boolean[rows][cols];
        for(int i = 0;i<rows ;i++){
            for(int j =0;j<cols;j++){
                if(searchPath(matrix,rows,cols,i,j,str,0,flag)) return true;
            }
        }
        return false;
    }
    public boolean searchPath(char[] matrix, int rows ,int cols ,int i ,int j,char[] str,int s,boolean[][] flag){
        if(i<0||j<0||i>=rows||j>=cols||flag[i][j]||matrix[cols*i+j]!=str[s]) return false;
        if(s == str.length-1) return true;
        flag[i][j] = true;
        if (searchPath(matrix,rows,cols,i-1,j,str,s+1,flag) || 
                   searchPath(matrix,rows,cols,i+1,j,str,s+1,flag)||
                   searchPath(matrix,rows,cols,i,j-1,str,s+1,flag)||
                   searchPath(matrix,rows,cols,i,j+1,str,s+1,flag)) return true;
        flag[i][j] = false;
        return false;
    }
}
