Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 
Constraints:
  1 <= nums.length <= 2 * 104
  -1000 <= nums[i] <= 1000
  -10^7 <= k <= 10^7
-------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0; i<nums.length;++i){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }

            if(!hm.containsKey(sum)){
                hm.put(sum, 1);
            }
            else{
                hm.put(sum, hm.get(sum)+1 );
            }
        }
        return count;
    }
}
