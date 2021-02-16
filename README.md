# CodePrep
SRE , SE , Devops and programming interview problems and solutions in Java, Python and Go

# Question 1 Easy

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Solution 
O(N)

This question can be easily solved with the help of set in O(N) time and space complexity.
First add all the elements of array into set and then traverse each element of array 
and check whether K-ar[i] is present in set or not.

# Question 2  Hard


Given an array of integers, return a new array such that each element at index i of the new array is
the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

Approach: Create two extra space, i.e. two extra arrays to store the product of all the array elements
from start, up to that index and another array to store the product of all the array elements from the 
end of the array to that index.
To get the product excluding that index, multiply the prefix product up to index i-1 with the suffix 
product up to index i+1.

# Question 3  Medium


This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
 and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class
```Python
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```
The following test should pass:
```Python 
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```
