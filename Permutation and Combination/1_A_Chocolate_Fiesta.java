class Result 
{
    public static int solve(List<Integer> a) 
    {
        int even_number=0;
        int odd_number=0;
        int i;
        for(i=0;i<a.size();++i)
        {
            if(a.get(i)%2==0)
            {
                ++even_number;
            }
            else
            {
                ++odd_number;
            }
        }
        BigInteger odd_comb;
        BigInteger even_comb = BigInteger.valueOf(2).pow(even_number).subtract(BigInteger.valueOf(1)).mod(BigInteger.valueOf(1000000007));
        if(odd_number>0)
        {
          odd_comb =BigInteger.valueOf(2).pow(odd_number-1).subtract(BigInteger.valueOf(1)).mod(BigInteger.valueOf(1000000007));
        }
        else
        {
          odd_comb=BigInteger.valueOf(0);
        }
        BigInteger total_comb = even_comb.multiply(odd_comb).mod(BigInteger.valueOf(1000000007));
        BigInteger ans = even_comb.add(odd_comb).add(total_comb).mod(BigInteger.valueOf(1000000007));
        return ans.intValue();
    }
}
