import java.util.*;
class PairSum
{
    public static int[] find(int a[],int n,int t)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
          int l=0,r=0,f=0;
        for(f=0;f<n-1;f++)
        {
            if(a[f]>a[f+1])
            break;
        }
        l=(f+1)%n;
        r=f;
        while(l!=r)
        {
            if(a[l]+a[r]==t)
            return new int[]{l,r};
            else if(a[l]+a[r]<t)
            l=(l+1)%n;
            else
            r=(r-1+n)%n;

        }
        return new int[]{-1,-1};
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println("Enter target value:");
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       int res[]=find(a,n,t);
       System.out.println(res[0]+" "+res[1]);
    
    }
}