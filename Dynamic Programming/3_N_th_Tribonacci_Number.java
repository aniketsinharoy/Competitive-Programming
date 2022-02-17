class N_th_Tribonacci__Number
{
    public int tribonacci(int n) 
    {
        if(n==0)
        {
            return 0;
        }
        if(n<=2)
        {
            return 1;
        }
        int a=0;
        int b=1;
        int c=1;
        int d=a+b+c;
        for(int i=3;i<=n;++i)
        {
            d=c+b+a;
            a=b;
            b=c;
            c=d;
        }
        return d;
    }
}
