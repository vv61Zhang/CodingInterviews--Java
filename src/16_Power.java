//题目：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//递归：n为偶数，a^n=a^n/2*a^n/2;n为奇数，a^n=（a^（n-1）/2）*（a^（n-1/2））*a ；时间复杂度O（logn）

public class Solution {
    public double Power(double base, int exponent) {
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        if(exponent ==1) return base;
        int n= exponent;
        if(exponent<0){
            n = -exponent;
        }
        double  result=Power(base,n>>1);
        result*=result;
        if((n&1)==1)
            result*=base; 
        if(exponent<0)
            result=1/result;
        return result;     
  }
}
