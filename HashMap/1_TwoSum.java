My Solution:
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] ans = new int[2];
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        TreeMap<Integer,Integer> tm1 = new TreeMap<>();
        for(int i=0;i<nums.length;++i)
        {
            if(!tm.containsKey(nums[i]))
            {
                tm.put(nums[i],i);
            }
            else
            {
                if(!tm1.containsKey(nums[i]))
                {
                    tm1.put(nums[i],i);
                }
            }
        }
        for(Integer key: tm.keySet())
        {
                int temp = target - key;
                if(tm.containsKey(temp))
                {
                    ans[0] = tm.get(key);
                    ans[1] = tm.get(temp);
                    if(ans[0]==ans[1])
                    {
                        if(tm1.containsKey(temp))
                        {
                            ans[1] = tm1.get(temp);
                            break;
                        }
                    }
                }
        }
        return ans;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------
Better Solution:
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
       HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            
            if (map.containsKey(diff))
            {
                return new int[] {map.get(diff), i};
            }
            else
            {
                map.put(nums[i], i);
            }
                
        }
        return new int[]{0,0};
    }
}
