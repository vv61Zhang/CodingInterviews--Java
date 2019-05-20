public class Solution {
    public int Fibonacci(int n) {
        if(n<0) return -1;
        else if(n==0) return 0;
        else if(n==1) return 1;
        int f0 = 0;
        int f1 = 1;
        for(int i = 2;i<=n;i++){
            int  temp = f0;
            f0 = f1 ;
            f1 += temp;
        }
        return f1;
    }
}
