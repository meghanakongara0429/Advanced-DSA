import java.util.*;
class MaxProfit
{
    public static int find(int prices[])
    {
        int min=Integer.MAX_VALUE,maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-min);
        }
        return maxprofit;
        
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
        System.out.println(find(a));
    
    }
}