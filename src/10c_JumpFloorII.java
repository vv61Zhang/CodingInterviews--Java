//Problem:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 
 
//Solution1: 跟10b一样的思路
public class Solution {
    public int JumpFloorII(int target) {
        if(target <=0) return 0;
        int[] ans = new int[target+1]; //*    Array vs. ArrayList (ArrayList<Type> arrL = new ArrayList<Type>(); arrL.add(number);arrL.get(index))
        ans[0] = 1; // frog can jump from zero to n 
        ans[1] = 1;
        for(int i =2;i<=target;i++){
            ans[i] = 0;
            for(int j =0;j<i;j++){
                ans[i] += ans[j];
            }
        }
        return ans[target];
    }
}         







//Solution2: fn= 2^(n-1)
public class Solution {
    public int JumpFloorII(int target) {
        return 1<<--target;
    }
}

//Solution 3:Recursion
public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 2)
            return target;
        else
            return JumpFloorII(target - 1) * 2;
    }
}
