import java.util.*;
class LongestPal
{
    public static int isPal(String s)
    {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        dp[i][i]=1;
        int maxLen=1;
        int st=1;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                if(maxLen<2)
                {
                    st=i;
                    maxLen=2;
                }
            }
        }
        
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {

                int j=i+k-1;
                if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j))
                {
                    dp[i][j]=1;
                    if(maxLen<k)
                    {
                    st=i;
                    maxLen=k;
                    }
                }
            }
        }
        return maxLen;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        System.out.println(isPal(s));
    }
}