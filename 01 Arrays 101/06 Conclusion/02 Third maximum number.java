/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

*/

class Solution {
    public int thirdMax(int[] nums) {
 Arrays.sort(nums);
  int i,first=nums[nums.length-1],second=0,third=nums[nums.length-1];
    for(i=0;i<nums.length;i++){
     {
         if(nums[i]<first)
              second=nums[i];
      }
    }
    for(i=0;i<nums.length;i++){
            if(nums[i]<second)
              third=nums[i];
    }
    if(nums.length==2)
        return nums[nums.length-1];
    else if(nums.length==1)
        return nums[0];
    else
      return third;
}
}
