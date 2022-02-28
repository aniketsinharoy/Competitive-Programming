class Result 
{
    public static int solve(List<Integer> c) 
    {
        TreeMap<Integer,Integer> card_count = new TreeMap<>();
        int i;
        for(i=0;i<c.size();++i)
        {
            if(card_count.containsKey(c.get(i))==false)
            {
                card_count.put(c.get(i), 1);
            }
            else
            {
                card_count.put(c.get(i), card_count.get(c.get(i))+1);
            }
        }
        if(card_count.containsKey(0)==false)
        {
            return 0;
        }
        int last_key=card_count.lastKey();
        int remaining_card=0;
        long temp;
        long ans=1;
        for(i=0;i<=last_key;++i)
        {
            if(card_count.containsKey(i)==true)
            {
                remaining_card=remaining_card+card_count.get(i);
            }
            if(remaining_card==0)
            {
                return 0;
            }
            temp=remaining_card%1000000007;
            ans=(ans*temp)%1000000007;
            --remaining_card;
        }
        for(i=remaining_card;i>0;--i)
        {
            ans=(ans*i)%1000000007;
        }
        ans=ans%1000000007;
        return (int)ans;
    }
}
