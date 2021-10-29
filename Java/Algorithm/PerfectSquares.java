/*
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
*/

public class PerfectSquares 
{
    public int numSquares(int n)
    {
    	if(n<=3)
    		return n;
    	int[] dp= new int[n+1];
    	dp[0]=0; dp[1]=1; dp[2]=2; dp[3]=3;
    	for(int i=4; i<=n; i++)
    	{
    		dp[i]=i;
    		for(int x=1; x<= Math.ceil(Math.sqrt(i)); x++)
    		{
    			int temp= x*x;
    			if(temp>i) break;
    			else
    				dp[i]= Math.min(dp[i], 1+dp[i-temp]);
    		}
    	}
    	return dp[n];
    }
}
