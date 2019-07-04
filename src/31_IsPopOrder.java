import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int[] pushA,int[] popA) {
      if(pushA == null && popA == null) return true;
      if(pushA == null || popA == null) return false;
      Stack<Integer> stack = new Stack<>();

      int len_pushA = pushA.length;
      int len_popA = popA.length;
      if (len_pushA != len_popA) return false;
      int j =0;
      for(int i = 0;i<len_pushA;i++){
          
          stack.push(pushA[i]);
          while( !stack.isEmpty() && popA[j] == stack.peek()) {
              stack.pop();
              j++;
          }
      }
     return stack.empty();
    }
}
