/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
   Hide Hint #1  
This is a really easy problem if you decide to use additional memory. For those trying to write an initial solution using additional memory, think counters!
   Hide Hint #2  
However, the trick really is to not use any additional space than what is already available to use. Sometimes, multiple passes over the input array help find the solution. However, there's an interesting piece of information in this problem that makes it easy to re-use the input array itself for the solution.
   Hide Hint #3  
The problem specifies that the numbers in the array will be in the range [1, n] where n is the number of elements in the array. Can we use this information and modify the array in-place somehow to find what we need?

*/

int n = nums.length;
    List<Integer> res = new ArrayList<>();
    int i = 0;
    while(i<n){
        int curr = nums[i];
        while(nums[curr-1] != curr){
            int t = nums[curr-1];
            nums[curr-1] = curr;
            curr = t;
        }
        i++;
    }
    
    for(int j=0; j<n; j++){
        if(nums[j] != j+1)
            res.add(j+1);
    }
    
    return res;
}
