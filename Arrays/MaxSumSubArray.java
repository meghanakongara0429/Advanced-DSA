import java.util.*;
class MaxSumSubArray
{
    public static void find(int a[],int n )
    {
        
       int res=a[0],sum=0,i=0;
       while(i<n)
       {
            if(sum<0)
            sum=0;
            sum+=a[i];
            res=Math.max(res,sum);
            i++;
       }
       System.out.print(res);
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
        find(a,n);
    
    }
}