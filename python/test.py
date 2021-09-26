class Node:
   def __init__(self, key, name):
      self.left = None
      self.right = None
      self.key = key
      self.name = name
   def PrintTree(self):
      print(self.data)

class BinaryTree:

    def __init__(self):
        self.root = None

    def inOrder(self, focusNode):
        if focusNode!=None:
            self.inOrder(focusNode.left)
            print(focusNode.name)
            self.inOrder(focusNode.right)

    def addNode(self, key, name):
        if self.root==None:
            self.root=Node(key,name)
        else:
            focusNode = self.root
            parent = None

            while True:
                parent = focusNode
                if key < focusNode.key:
                    focusNode = focusNode.left
                    if focusNode==None:
                        parent.left = Node(key, name)
                        return
                
                else:
                    focusNode = focusNode.right
                    if focusNode==None:
                        parent.right = Node(key, name)
                        return
    def LCA(self, root, a, b):
        if(a < root.key) & (b < root.key):
            return self.LCA(root.left, a, b)
        elif(a > root.key) & (b > root.key):
            return self.LCA(root.right, a, b)
        return root


msg = Node(12, "kevin")
#print(msg.key)

test = BinaryTree()
test.addNode(6, "david")
test.addNode(5, "keira")
test.addNode(7, "michael")
test.addNode(8, "solomon")
test.addNode(2, "sheila")
output = test.LCA(test.root, 2, 8)
print(output.name)