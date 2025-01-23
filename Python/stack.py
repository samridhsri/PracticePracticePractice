class Stack:
    # Push, pop, size, is_empty, peek
    
    def __init__(self):
        self.stack = [None] * 5  # create empty fixed sized stack
        self.top = -1
    
    def push(self, data):
        
        if self.top == len(self.stack) - 1:
            print("Stack is full")
        else:
            self.top = self.top + 1
            self.stack[self.top] = data
    
    def pop(self):
        
        if self.top == -1:
            print("Stack is empty")
        else:
            self.stack[self.top] = None
            self.top -= 1
    
    def size(self):
        
        print(self.top + 1)
    
    def is_empty(self):
        
        res =  True if self.top == -1 else False
        print(res)
        return res
    
    def peek(self):
        if(self.top==-1):
            print("Empty Nothing to peek")
        else:
            print(self.stack[self.top])
    
    def print_stack(self):
        print(self.stack)


stack = Stack()
stack.is_empty()

stack.push(5)
stack.push(6)
stack.push(7)
stack.push(7)
stack.push(7)
stack.push(7)

stack.print_stack()

stack.pop()
stack.pop()
stack.pop()
stack.pop()
stack.pop()
stack.pop()
stack.print_stack()

stack.peek()
stack.is_empty()
    