class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int[] prefix_sum = new int[nums.length];
        prefix_sum[0]=nums[0];
        for(int i=1;i<nums.length;++i)
        {
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;++i)
        {
            //prefix_sum[i]-nums[i]=left_sum(excluded i)
            //prefix_sum[nums.length-1]-prefix_sum[i]=rght_sum(excluded i)
          
            if((prefix_sum[i]-nums[i])==(prefix_sum[nums.length-1]-prefix_sum[i]))
            {
                return i;
            }
        }
        return -1;
    }
}
