import java.util.*;
class MinMax
{
    public static int[] find(int a[],int low,int high )
    {
        if(low==high)
        {
            return new int[]{a[low],a[high]};
        }
        else if(high==low+1)
        {
            if(a[high]>a[low])
            return new int[]{a[low],a[high]};
            else
            return new int[]{a[high],a[low]};
        }
        int mid=(low+high)/2;
        int le[]=find(a,low,mid-1);
        int r[]=find(a,mid,high);
        int min=0,max=0;
        if(le[0]<r[0])
        {
            min=le[0];
        }
        else min=r[0];
        if(le[1]>r[1])max=le[1];
        else max=r[1];
        return new int[]{min,max};


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
        int res[]=find(a,0,n-1);
        System.out.println(res[0]+" "+res[1]);
    }
}