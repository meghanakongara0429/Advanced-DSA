import java.util.*;
class TrappingRainWater
{
    public static int find(int a[],int n)
    {
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=a[0];
        r[n-1]=a[n-1];
        for(int i=1;i<n;i++)
        {
            l[i]=Math.max(l[i-1],a[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(a[i],r[i+1]);
        }
        int res=0;
        for(int i=0;i<n;i++)
        res+=Math.min(l[i],r[i])-a[i];
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       System.out.println(find(a,n));
    
    }
}