public class Solution {
    public int movingCount(int threshold, int rows, int cols){
        if(rows<=0||cols<=0||threshold<=0) return 0;
        int[][] flag = new int[rows][cols];

        return mCount(threshold,rows,cols,0,0,flag);
    }
    public int mCount(int threshold, int rows, int cols,int i ,int j,int[][]flag){
        int sumDigit =0;
        int di=i;
        int dj=j;
        while(di>0){
            sumDigit += (di%10);
            di =di/10;
        }
        while(dj>0){
            sumDigit +=(dj%10);
            dj = dj/10;
        }
        if(i<0 || i>=rows || j<0 || j>=cols || sumDigit>threshold || flag[i][j] ==1) return 0; //此处应先判断index大小，再判断flag[i][j],否则会报错
        flag[i][j] =1;
        return 1 +mCount(threshold,rows,cols,i-1,j,flag)+
                mCount(threshold,rows,cols,i+1,j,flag)+
                mCount(threshold,rows,cols,i,j-1,flag)+
                mCount(threshold,rows,cols,i,j+1,flag);
    }
}
