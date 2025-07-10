import java.util.*;
class MinSteps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<=n;i++)
        {
            int ans1=dp[i-1],ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
            if(i%2==0)
            {
                ans2=dp[i/2];

            }
            if(i%3==0)
            {
                ans3=dp[i/3];

            }
            dp[i]=Math.min(Math.min(ans1,ans2),ans3)+1;
        }
        System.out.println(dp[n]);
    }
}