public class MyQueue{

    int capacity;
    int[] queue;
    int rear,front;

    MyQueue(int x){
        capacity = x;
        queue = new int[capacity];
        rear = 0;
        front = 0;
    }

    void enque(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        queue[rear] = x;
        rear++;
    }

    void deque(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=0;i<rear-1;i++){
            queue[i] = queue[i+1];
        }
        rear--;
    }

    void printQueue(){
        for(int i = front; i<rear;i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    boolean isEmpty(){
        if(rear==0){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(rear==capacity){
            return true;
        }
        return false;
    }

}


class TestQueue{
    public static void main(String[] args) {
        MyQueue arr = new MyQueue(5);
        arr.enque(1);
        arr.enque(2);
        arr.enque(3);
        arr.enque(4);
        arr.enque(5);
        arr.deque();
        arr.printQueue();

        arr.enque(6);


        arr.printQueue();
    }
}