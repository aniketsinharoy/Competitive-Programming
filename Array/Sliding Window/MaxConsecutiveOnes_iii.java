Problem Link: https://leetcode.com/problems/max-consecutive-ones-iii/
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
  
Example 2:
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Constraints:
  1 <= nums.length <= 10^5
  nums[i] is either 0 or 1.
  0 <= k <= nums.length
  -----------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, breakIndex = 0;
        int len = 0, max0 = 0, maxLength = 0;
        for(right=0; right<nums.length; ++right){
            if(nums[right]==0){
                ++max0;
                if(max0>k){
                    while(nums[left]!=0){
                        ++left;
                    }
                    ++left;
                    --max0;
                }
            }
            len = right - left + 1;
            maxLength = Math.max(maxLength,len);    
        }
        return maxLength;
    }
}
