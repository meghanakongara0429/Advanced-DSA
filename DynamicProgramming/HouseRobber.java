import java.util.Scanner;

class HouseRobber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int dp[]=new int[n];
        dp[0]=a[0];
        dp[1]=a[1];
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-2]+a[i],dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
    
}
