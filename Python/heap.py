class Heap:
    def __init__(self):
        self.heap = [0]
    
    def print_heap(self):
        print(self.heap)
    
    def push(self, val):
        
        self.heap.append(val)
        
        # We just need to think about the value we added in the end
        
        i = len(self.heap) - 1
        
        while(self.heap[i] < self.heap[i//2]):
            self.heap[i], self.heap[i//2] = self.heap[i//2], self.heap[i]
            i = i//2
    
    def pop(self):
        if len(self.heap) == 0:
            return -1
        
        if len(self.heap) == 1:
            return -1
        
        if len(self.heap) == 2:
            return self.heap.pop()
        
        res = self.heap[1]
        self.heap[1] = self.heap.pop()
        
        i = 1
        
        while(i < len(self.heap)):
            
            left = 2*i
            right = 2*i + 1
            
            if (right < len(self.heap) and (self.heap[right] < self.heap[left]) and (self.heap[right] < self.heap[i])):
                # Swap with the right child!
                
                self.heap[right], self.heap[i] = self.heap[i], self.heap[right]
                i = right
            
            elif (left < len(self.heap) and self.heap[left] < self.heap[i]):
                # Swap with the left child!
                
                self.heap[left], self.heap[i] = self.heap[i], self.heap[left]
                i = left
            
            else:
                break
        
        return res
    
    def heapify(self, arr):
        
        arr = [0] + arr
        self.heap = arr
        
        curr = (len(self.heap) - 1) // 2
        
        while (curr > 0):
            
            i = curr
            
            while(2*i < len(self.heap)):
                right = 2*i + 1
                left = 2*i
                
                if (right < len(self.heap) and (self.heap[right] < self.heap[left]) and (self.heap[right] < self.heap[i])):
                    # Swap the right child with parent
                    
                    self.heap[right], self.heap[i] = self.heap[i], self.heap[right]
                    i = right
                
                elif (left < len(self.heap) and self.heap[left] < self.heap[i]):
                    # Swap the left child with the parent
                    
                    self.heap[left], self.heap[i] = self.heap[i], self.heap[left]
                    i = left
                
                else:
                    break
            
            curr -= 1
        
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





        