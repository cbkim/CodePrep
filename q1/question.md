This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Solution 
O(N)

This question can be easily solved with the help of set in O(N) time and space complexity.
First add all the elements of array into set and then traverse each element of array 
and check whether K-ar[i] is present in set or not.

A HashSet is a collection of items where every item is unique, and it is found in the java.util package

