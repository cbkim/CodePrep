class Node: 
    def __init__(self, val, left=None, right=None): 
        self.val = val 
        self.left = left 
        self.right = right

def serialize(node):
    val = node.val
    if node.left:
        left = serialize(node.left)
    else:
        left = None
    if node.right:
        right = serialize(node.right)
    else:
        right = None
    serialized = [val, left, right]
    return serialized

def deserialize(serialized_node):
        val = serialized_node[0]
        if serialized_node[1]:
            left = deserialize(serialized_node[1])
        else:
            left = None
        if serialized_node[2]:
            right = deserialize(serialized_node[2])
        else:
            right = None
        return Node(val, left, right)

tree = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(tree)).left.left.val=="left.left"