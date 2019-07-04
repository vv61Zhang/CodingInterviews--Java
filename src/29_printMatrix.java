import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();

        if(row == 0 && col == 0)
            return res;
        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        while(left <= right && top <= bottom){
            //上：从左到右
            for(int i=left; i<=right; i++)
                res.add(matrix[top][i]);
            //右：从上到下
            for(int i=top+1; i<=bottom; i++)
                res.add(matrix[i][right]);
            //下：从右到左
            if(top != bottom){
                //防止单行情况
                for(int i=right-1; i>=left; i--)
                    res.add(matrix[bottom][i]);
            }
            //左：从下到上
            if(left != right){
                //防止单列情况
                for(int i=bottom-1; i>top; i--)
                    res.add(matrix[i][left]);
            }
            left++; right--; top++; bottom--;
        }
        return res;
    }
}
