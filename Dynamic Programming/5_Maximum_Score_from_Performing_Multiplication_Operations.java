class Maximum_Score_from_Performing_Multiplication_Operations
{
    public int maximumScore(int[] nums, int[] multipliers) 
    {
        int index,left_pointer,right_pointer;
        int[][] max_value = new int[multipliers.length+1][multipliers.length+1];
        for(index=multipliers.length-1;index>=0;--index)
            {
                int multiplying_factor=multipliers[index];
                for(left_pointer=index;left_pointer>=0;--left_pointer)
                    {
                        right_pointer=(nums.length-1)-(index-left_pointer);
                        max_value[index][left_pointer]=Math.max(multiplying_factor*nums[left_pointer]+max_value[index+1][left_pointer+1],
                                                                multiplying_factor*nums[right_pointer]+max_value[index+1][left_pointer]);
                    }
            }
        return max_value[0][0];
    }
}
