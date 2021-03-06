/*

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 

Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
   Hide Hint #1  
You can easily solve this problem if you simply think about two elements at a time rather than two arrays. We know that each of the individual arrays is sorted. What we don't know is how they will intertwine. Can we take a local decision and arrive at an optimal solution?
   Hide Hint #2  
If you simply consider one element each at a time from the two arrays and make a decision and proceed accordingly, you will arrive at the optimal solution.

*/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        
        //last indexes and then decrementing each one
        int i=m-1 , j=n-1 , index=m+n-1;
        
        while(index>=0 && i>=0 && j>=0)
        {
            
            //checking for which ijs greater inorder to set in ascending order
            if(nums2[j]>=nums1[i])
            {
                //storing in num1 because qn is framed like that
                // storing all the num2 values in num1
                nums1[index]=nums2[j];
                index--;
                j--;
            }
            else
            {
                //storing all the num1 values in num1 
                nums1[index]=nums1[i];
                index--;
                i--;
            }
        }
        
        while(j>=0)
        {
            nums1[index]=nums2[j];   
            index--;
            j--;
        }
    }
}
