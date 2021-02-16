This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is
the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

'''text
The easiest approach somebody can think of is, for any array element at index i, take the product of all
the other elements of the array excluding the current index and store the product for current index i.e. 
index i in a product array at it’s index i.
This is a very basic and naive approach and would result in a big time complexity as we have to traverse 
the array n times for filling it, then for each element again traverse n-1 elements to compute product.
 It means a time complexity of order of O(n)+O(n*(n-1)).
We need to think of a better approach that can do the same task in less time. So, what if we use the 
technique of multiplication and division together.
Sounds tricky! We together will make it simple. Let’s do it.

https://medium.com/trick-the-interviwer/uber-and-arrays-84214815c91a

Create two array prefix and suffix of length n, i.e length of the original array, 
initilize prefix[0] = 1 and suffix[n-1] = 1 and also another array to store the product.
Traverse the array from second index to end.
For every index i update prefix[i] as prefix[i] = prefix[i-1] * array[i-1], 
i.e store the product upto i-1 index from the start of array.
Traverse the array from second last index to start.
For every index i update suffix[i] as suffix[i] = suffix[i+1] * array[i+1], 
i.e store the product upto i+1 index from the end of array
Traverse the array from start to end.
For every index i the output will be prefix[i] * suffix[i],
 the product of the array element except that element.
'''