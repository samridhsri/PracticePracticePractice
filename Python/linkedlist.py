class node:
    def __init__(self, data = None):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def add(self, data):
        new_node = node(data)
        
        # Check if Linked List is empty
        
        if self.head is None:
            self.head = new_node
            return
        
        # If Linked List is not empty
        
        curr = self.head
        while(curr.next != None): # Traverse through list
            curr = curr.next
        curr.next = new_node
        print('Added')
    
    def print_list(self, head=None):
        if head is None:
            head = self.head

        if head is None:
            print("Linked List is Empty")
            return

        curr = head
        result = ""
        while curr:
            result += str(curr.data) + "->"
            curr = curr.next
        result = result.rstrip("->")  # Remove trailing "->"
        print(result)

        
    def length(self):
        if self.head is None:
            print("0")
            return
        
        curr = self.head
        result = 0
        while(curr.next!=None):
            result+=1
            curr = curr.next
        result+=1
        print(result)
        
    def delete(self, key):
        if self.head is None:
            print("Empty List")
            return
        
        if self.head.data is key:
            self.head = self.head.next
            return
        
        curr = self.head
        while curr.next.data!=key:
            curr = curr.next
        
        curr.next = curr.next.next
        print("deleted")
    
    def reverse(self):
        if self.head is None:
            return None

        prev = None
        curr = self.head

        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode

        self.head = prev
        self.print_list(self.head)
        return self.head

            

l1 = LinkedList()
l1.add(5)
l1.add(8)
l1.add(10)
l1.add(12)

l1.print_list()
l1.length()

l1.delete(5)
l1.print_list()
l1.length()

l1.reverse()