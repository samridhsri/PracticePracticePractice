class TreeNode:
    def __init__(self, val):
         self.val = val
         self.left = None
         self.right = None
    
    def search(self, val):
        """Return True if the value is in Tree"""
        
        if val > self.val and self.right:
            return self.right.search(val)
        
        if val < self.val and self.left:
            return self.left.search(val)
        
        if val == self.val:
            return True
        
        else:
            return False
         
    def insert(self, val):
        """Insert values in a Tree (Does not work for an empty tree)"""
        if val > self.val:
            if self.right is None:
                self.right = TreeNode(val)
            else:
                self.right.insert(val)
        
        elif val < self.val:
            if self.left is None:
                self.left = TreeNode(val)
            else:
                self.left.insert(val)
        
        return self
        
    
    def find_min_val(self):
        current = self
        if current is None:
            return None
        else:
            if current.left:
                current = current.left
        
        return current.val
    
    def remove(self, val):
        """Removes value from a Tree"""
        
        if val < self.val:
            if self.left:
                self.left = self.left.remove(val)
        
        elif val > self.val:
            if self.right:
                self.right = self.right.remove(val)
        
        else:
            # Case 1: No Child
            if self.left is None and self.right is None:
                return None
            # Case 2: One Child
            
            if self.left is None:
                return self.right
            elif self.right is None:
                return self.left
            
            # Case 3: Two Child
            if self.left and self.right:
                minVal = self.right.find_min_val()
                self.val = minVal
                self.right.remove(minVal)
                
        return self
    
    def printTreeInorder(self):
        """Prints the BST in Inorder Traversal (Left → Root → Right)."""
        if self.left:
            self.left.printTreeInorder()
        print(self.val, end=" - ")
        if self.right:
            self.right.printTreeInorder()


# Test Case
def test_tree_operations():
    root = TreeNode(10)

    # Insert elements
    root.insert(5).insert(15).insert(3).insert(7).insert(13).insert(17)

    print("Tree after insertions (Inorder Traversal):")
    root.printTreeInorder()
    print("\n")

    # Search tests (Fixed assertions)
    assert root.search(7) == True, "Search failed for existing value 7"
    assert root.search(20) == False, "Search failed for non-existing value 20"

    # Remove elements
    root = root.remove(5)
    print("Tree after removing 5 (Inorder Traversal):")
    root.printTreeInorder()
    print("\n")

    root = root.remove(10)
    print("Tree after removing root (10) (Inorder Traversal):")
    root.printTreeInorder()
    print("\n")

    # Check tree structure after deletion (Fixed assertions)
    assert root.search(10) == False, "10 should be removed from tree"
    assert root.search(5) == False, "5 should be removed from tree"

    print("All tests passed!")

# Run the test case
test_tree_operations()
