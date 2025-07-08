import java.util.*;
class ChocolateDistribution
{
    public static int find(int a[],int n,int m )
    {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i<n-m;i++)
        {
            int d=a[i+m-1]-a[i];
            ans=Math.min(d,ans);
        }
        return ans;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(find(a,n,m));
    
    }
}