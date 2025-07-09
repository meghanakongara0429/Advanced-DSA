import java.util.*;
class MaxWater
{
    public static int find(int a[],int n)
    {
        int res=0;
        int i=0,j=n-1;
        while(i<j)
        {
            int width=j-i;
            int minheight=Math.min(a[i],a[j]);
            res=Math.max(res,minheight*width);
            if(a[i]<a[j])
            i++;
            else
            j--;
        }
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