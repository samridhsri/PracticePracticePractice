#include <stdio.h>
#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *ptr;
};

Node* top;

void push(int x){
    Node * temp = new Node();
    if(!temp){
        cout<<"Stack Overflow\n";
        exit(1);
    }

    temp->data = x;
    temp->ptr=top;
}