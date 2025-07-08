import java.util.*;
class SearchRotatedSortedArray
{
    public static int find(int a[],int n,int x )
    {
       int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==x)
            return mid;
            else if(a[low]<=a[mid])
            {
                if(x>=a[low] && x<a[mid])
                high=mid-1;
                else
                low=mid+1;
            }
            else
            {
                if(x>a[mid] && x<=a[high])
                low=mid+1;
                else
                high=mid-1;

            }
        }
        return -1;
        
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