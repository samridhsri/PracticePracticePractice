public class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int c){
        cap = c;
        top = -1;
        arr = new int[cap];
    }

    void push(int x){
        top++;
        if(top==cap){
            System.out.println("Overflow");
        } else {
            arr[top] = x;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Underflow Condition");
        }
        else{
            int res = arr[top];
            top--;
            return res;
        }

        return Integer.MAX_VALUE;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return (top==-1);
    }

    int size(){
        return top+1;
    }

}

class Test{
    public static void main(String args[]){
        MyStack s = new MyStack(5);
        s.push(4);
        s.push(6);
        System.out.println(s.peek());
        s.push(7);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    }
}
