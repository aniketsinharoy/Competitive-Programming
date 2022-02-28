import java.util.*;
import java.lang.*;
import java.io.*;

class Result
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		int i,n,t1,t2;
		while(test_case>0)
		{
			n=sc.nextInt();
			int[] radiation = new int[n];
			int[] zombie = new int[n];
			int[] cave = new int[n];
			int zom_total=0,cav_rad_total=0;
			for(i=0;i<n;++i)
			{
				radiation[i]=sc.nextInt();
				t1=i-radiation[i];
				t2=i+radiation[i];
				if(t1<0)
				{
					t1=0;
				}
				if(t2<n-1)
				{
					--cave[t2+1];
				}
				++cave[t1];
					
			}
			for(i=0;i<n;++i)
			{
				zombie[i]=sc.nextInt();
				zom_total=zom_total+zombie[i];	
			}
			cav_rad_total=cave[0];
			for(i=1;i<n;++i)
			{
				cave[i]=cave[i]+cave[i-1];
				cav_rad_total=cav_rad_total+cave[i];
			}
			if(cav_rad_total==zom_total)
			{
				Arrays.sort(zombie);
				Arrays.sort(cave);
				
				if(Arrays.equals(zombie,cave))
				{
          System.out.println("YES");
        }
				else
				{
          System.out.println("NO");
        }
				
			}
			else
			{
				System.out.println("NO");
			}
			--test_case;
		}
	}
}
