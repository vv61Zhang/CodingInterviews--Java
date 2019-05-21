// my solution 
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if(length == 0) return 0;
        if(array[0]<array[length-1]) return array[1];
        if(array[0]==array[length -1] && array[0] == array[(length-1)/2] ){
            int ans = array[0];
            for(int i =0;i<length;i++){
                if (array[i]<ans) ans =array[i];
            }
            return ans;
        }
        return recursion(array,0,array.length -1);
    }
    public int recursion(int[] array ,int p1,int p2){
        int mid = (p2-p1)/2 +p1;
        if(p2!=p1+1){
            if(array[mid]>array[p1]) return recursion(array,mid,p2);
            if(array[mid]<array[p2]) return recursion(array,p1,mid);
        }
        return array[p2];
    }
}

//my solution2
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array==null || array.length == 0) return 0;
        int p1 = 0;
        int p2 =array.length -1;
        int mid = (p2+p1)/2;
        if(array[p1]==array[p2] && array[p1]==array[mid]){
            int ans = array[p1];
            for(int i =p1;i<=p2;i++){
                if(array[i]<ans) ans = array[i];
            }
            return ans;
        }
        if(array[0]<array[p2]) return array[0];
        while(p2 != (p1+1)){
            mid = (p2+p1)/2;
            if(array[p1]<array[mid]) p1=mid;
            else if(array[mid]<array[p2]) p2=mid;
        }
        return array[p2];
    }
}

//solution3
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;   
        while(low < high){
            int mid = low + (high - low) / 2;        
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }   
        }
        return array[low];
    }
}
