class Maximal_Square 
{
    public int maximalSquare(char[][] matrix) 
    {
        int longest=0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int m=matrix.length+1,n=matrix[0].length+1;
        int i,j;
        for(i=0;i<m;++i)
        {
            dp[i][0]=0;
        }
        for(i=0;i<n;++i)
        {
            dp[0][i]=0;
        }
        for(i=1;i<m;++i)
        {
            for(j=1;j<n;++j)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                    if(longest<dp[i][j])
                    {
                        longest=dp[i][j];
                    }
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        return (longest*longest);
    }
}
