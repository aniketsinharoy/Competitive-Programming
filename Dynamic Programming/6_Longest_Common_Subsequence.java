class Longest_Common_Subsequence 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
       int[][] dp = new int[text2.length()+1][text1.length()+1];
       for(int text2_current_index=1;text2_current_index<=text2.length();++text2_current_index)
       {
           for(int text1_current_index=1;text1_current_index<=text1.length();++text1_current_index)
            {
                   if(text1.charAt(text1_current_index-1)==text2.charAt(text2_current_index-1))
                   {
                       dp[text2_current_index][text1_current_index]=1+dp[text2_current_index-1][text1_current_index-1];
                   }
                   else
                   {
                       dp[text2_current_index][text1_current_index]=Math.max(dp[text2_current_index-1][text1_current_index]
                                                                             ,dp[text2_current_index][text1_current_index-1]);
                   }
            }
       }
        return dp[text2.length()][text1.length()];
    }
}
