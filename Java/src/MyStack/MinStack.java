package MyStack;
import java.util.Stack;

class Node{
    int val;
    int min;
    public Node(int val, int min){
        this.val = val;
        this.min = min;
    }
}

public class MinStack {
    Stack<Node> stack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.empty()){
            stack.push(new Node(val, val));
        }
        else{
            Node top = stack.peek();
            if(top.min<val){
                stack.push(new Node(val, top.min));
            }
            else{
                stack.push(new Node(val, val));
            }
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
