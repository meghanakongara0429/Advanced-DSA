import java.util.*;
class SearchMinRotatedSortedArray
{
    public static int find(int a[],int n)
    {
        int low=0,high=n-1;
        if(a[low]<a[high])return a[low];
        while(low<high)
        {
            int mid=(low+high)/2;
            if(a[low]<a[mid])
            low=mid+1;
            else
            high=mid;
        }
        return a[low];
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