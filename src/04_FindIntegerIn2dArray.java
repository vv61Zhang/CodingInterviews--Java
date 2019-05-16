public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null ||  array.length == 0) return false;
        int row = 0;
        int col = array[0].length -1 ;
        
        while(row < array[0].length && col >=0 ){
            int temp = array[row][col];
            if(temp == target) return true;
            else if (temp  > target) col -- ;
            else row++;
        }
        return false;
    }
}
