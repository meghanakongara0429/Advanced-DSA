import java.util.*;
class PairSum
{
    public static int[] find(int a[],int n,int t)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int l=0,r=0;
        for(int i=0;i<n;i++)
        {
           if(a[i]<min)
           {
            min=a[i];
            l=i;
           }
           else if(a[i]>max)
           {
            max=a[i];
            r=i;
           }
        }
        //System.out.println(l+" "+r);
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