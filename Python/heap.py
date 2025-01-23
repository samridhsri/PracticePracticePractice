class Heap:
    def __init__(self):
        self.heap = [0] #keep the first element empty
    
    def print_heap(self):
        print(self.heap) #Print the heap array
    
    def push(self,val):
        
        # Enter at the end then bubble / perforate up
        # parent = i//2
        # leftchild = 2*i
        # rightchild = 2*i+1
        
        self.heap.append(val)
        
        # pointer to the end
        i = len(self.heap) - 1
        
        while self.heap[i//2] > self.heap[i]:
            
            # swap with parent
            
            temp = self.heap[i//2]
            self.heap[i//2] = self.heap[i]
            self.heap[i] = temp
            
            # update the value of i
            
            i = i//2
    
    def pop(self):
        
        if len(self.heap) == 1:
            return -1
        
        if len(self.heap)==2:
            return self.heap.pop()
        
        # exchange node with last element
        
        res = self.heap[1]
        self.heap[1] = self.heap.pop() # Move last to top
        
        i = 1
        
        # Maintain the order property (min at top)
        
        while (2*i < len(self.heap)): # while left child exists
            
            left = 2*i
            right = 2*i+1
            
            
            if ((right < len(self.heap)) and (self.heap[right]<self.heap[left]) and (self.heap[i]>self.heap[right])):
                # Swap right node
                
                temp = self.heap[right]
                self.heap[right] = self.heap[i]
                self.heap[i] = temp
                i = 2*i+1
            
            elif((self.heap[left] < self.heap[i])):
                # Swap left node
                
                temp = self.heap[left]
                self.heap[left] = self.heap[i]
                self.heap[i] = temp
                i = 2*i
            
            else:
                break    
        
        
        return res 
    
    def heapify(self,arr):
        
        # Basic Idea: Start from the middle of the array then move back while perfolating down
        
        # Take the first element to last to maintain the structural order
        arr.append(arr[0])
        cur  = (len(arr)-1)//2
        self.heap = arr
        
        while(cur>0):
            i = cur
            
            while(2*i<len(self.heap)):
                left = 2*i
                right = 2*i+1
                
                if(right<len(self.heap) and (self.heap[right]<self.heap[left]) and (self.heap[i]>self.heap[right])):
                    # Swap right node with parent node
                    
                    temp = self.heap[right]
                    self.heap[right] = self.heap[i]
                    self.heap[i] = temp
                    i = 2*i+1
                
                elif (self.heap[left]<self.heap[i]):
                    # Swap left node with parent node
                    
                    temp = self.heap[left]
                    self.heap[left] = self.heap[i]
                    self.heap[i] = temp
                    i = 2*i
                else:
                    break
            cur = cur - 1
        return self.heap
            
        
        
        
        
            
            
            

arr = Heap()

arr.push(10)
arr.push(5)
arr.push(8)
arr.print_heap()

arr.push(9)
arr.push(10)
arr.push(15)

arr.print_heap()

print(arr.pop())
print(arr.pop())
print(arr.pop())
print(arr.pop())
print(arr.pop())
print(arr.pop())


arr.print_heap()


arra = [2,1,45,10,25,5,76,60]
print(arra)

print(arr.heapify(arra))




        