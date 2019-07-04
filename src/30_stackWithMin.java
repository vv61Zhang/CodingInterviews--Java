import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> tmp = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        if(tmp.isEmpty() )tmp.push(node);
        /*
        不能通过判断 tmp==null，因为tmp已经初始化过了 不会等于null 了，
        如果不能用isEmpty这个函数，也可以新建一个variable int min == null ,通过判断min == null 来选择push哪个对象 
        并不断更新min
        */
        else if(node< min()) tmp.push(node);
        else tmp.push(min());
    }
    
    public void pop() {
        stack.pop();
        tmp.pop();
    }
    
    public int top() {
        return stack.peek();//peek()也可以用pop push 替代
    }
    public int min() {
        return tmp.peek();
    }
}
