class Delete_And_Earn
{
    public int deleteAndEarn(int[] nums) 
    {
         TreeMap<Integer,Integer> count = new TreeMap<>();
        ArrayList<Integer> distinct_number = new ArrayList<>();
        int i=0;
        for (i = 0; i < nums.length; i++) 
        {
            if(count.containsKey(nums[i])==false)
            {
                count.put(nums[i],1);
                distinct_number.add(nums[i]);
            }
            else
            {
                count.put(nums[i], count.get(nums[i])+1);
            }    
        }
        if(distinct_number.size()==1)
        {
            return distinct_number.get(0)*count.get(distinct_number.get(0));
        }
        Collections.sort(distinct_number);
        int[] ans = new int[distinct_number.size()];
        ans[0]=distinct_number.get(0)*count.get(distinct_number.get(0));
        if(distinct_number.get(1)-1!=distinct_number.get(0))
        {
            ans[1]=distinct_number.get(1)*count.get(distinct_number.get(1))+ans[0];
        }
        else
        {
            ans[1]=Math.max(distinct_number.get(1)*count.get(distinct_number.get(1)),ans[0]);
        }
        for(i=2;i<distinct_number.size();++i)
        {
            if(distinct_number.get(i)-1!=distinct_number.get(i-1))
            {
                ans[i]=distinct_number.get(i)*count.get(distinct_number.get(i))+ans[i-1];
            }
            else
            {
                ans[i]=distinct_number.get(i)*count.get(distinct_number.get(i))+ans[i-2];
            }
            ans[i]=Math.max(ans[i],ans[i-1]);
        }
        return ans[ans.length-1];
    }
}
