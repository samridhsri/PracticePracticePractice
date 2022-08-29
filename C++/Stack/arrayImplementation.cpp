#include <stdio.h>
#include <iostream>
#define max 100
using namespace std;



class Stack{
    int top;

    public:
    int a[max];
    Stack(){
        top = -1;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
    void displayAll();
};

bool Stack::push(int x){
    if(top>=max-1){
        cout<<"Stack Overflow"<<endl;
        return false;
    }
    else{
        a[++top] = x;
        cout<<"Element is pushed"<<endl;
        return true;
    }
}

int Stack::pop(){
    if(top<0){
        cout<<"Stack Underflow"<<endl;
    }
    else{
        int x = a[top--];
        cout<<"Element popped "<<x<<endl;
        return x;
    }
}

int Stack::peek(){
    if(top<0){
        cout<<"Stack is Empty"<<endl;
    }
    else{
        int x = a[top];
        return x;
    }
}

bool Stack::isEmpty(){
    if(top<0) return true;
    else return false;
}

void Stack::displayAll(){
    int temp = top;
    while(top>=0){
        cout<<a[top]<<endl;
        top--;
    }
    top = temp;
}

int main(){
    class Stack s;
    s.push(2);
    s.push(3);
    s.push(6);
    s.push(5);
    s.displayAll();

    // s.pop();
    // s.peek();
    // s.isEmpty();

    // s.displayAll();
}