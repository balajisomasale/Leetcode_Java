/*

Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
  
Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
   Hide Hint #1  
This is a great introductory problem for understanding and working with the concept of in-place operations. The problem statement clearly states that we are to modify the array in-place. That does not mean we cannot use another array. We just don't have to return anything.
   Hide Hint #2  
A better way to solve this would be without using additional space. The only reason the problem statement allows you to make modifications in place is that it hints at avoiding any additional memory.
   Hide Hint #3  
The main problem with not using additional memory is that we might override elements due to the zero duplication requirement of the problem statement. How do we get around that?
   Hide Hint #4  
If we had enough space available, we would be able to accommodate all the elements properly. The new length would be the original length of the array plus the number of zeros. Can we use this information somehow to solve the problem?
*/
class Solution {
    public void duplicateZeros(int[] arr) {
        //Approach: check for a[i]==0 and create duplicate 0 to the next too
        // so to create this, shift every element to next index
        for (int i = 0; i < arr.length; i++){
        if (arr[i] == 0){
            //checking from the back just to ignore OVERWRITTING
            for (int j = arr.length-1; j > i; j--){
                // shifting index to next index
                arr[j] = arr[j-1];                    
            }
            i++;
        }
    }  
        
        
    }
}




