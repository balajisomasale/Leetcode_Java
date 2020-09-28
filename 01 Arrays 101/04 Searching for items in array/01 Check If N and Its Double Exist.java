/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
Example 3:

Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.
 

Constraints:

2 <= arr.length <= 500
-10^3 <= arr[i] <= 10^3
   Hide Hint #1  
Loop from i = 0 to arr.length, maintaining in a hashTable the array elements from [0, i - 1].
   Hide Hint #2  
On each step of the loop check if we have seen the element 2 * arr[i] so far or arr[i] / 2 was seen if arr[i] % 2 == 0.

*/

Create a hashmap
Begin looping over input array
Check if values (1) arr[i] * 2 OR (2) arr[i]/2 exist in the map. Note, in the code below, that for the (2) condition we also check for (arr[i] % 2) == 0 to avoid getting false positives from rounding errors.
If one of the conditions is true, return true from function.
Otherwise, add value to hashmap.
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (
                seen.containsKey(arr[i]*2) ||
                seen.containsKey(arr[i]/2) && (arr[i] % 2) == 0
            ){
                return true;
            }
            seen.put(arr[i], i);
        }
        return false;
    }
}
The use of hashmap may be redundant, but I found the solution to be pretty concise and simple.

Addition:
Here's an example using ArrayList, which may be more intuitive to understand. However, Leetcode claims it runs slower than the previous example, at only faster than 54.38% of Java submissions.

public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> seen = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (
                seen.contains(arr[i]*2) ||
                seen.contains(arr[i]/2) && (arr[i] % 2) == 0
            ){
                return true;
            }
            seen.add(arr[i]);
        }
        return false;
    }
	```

