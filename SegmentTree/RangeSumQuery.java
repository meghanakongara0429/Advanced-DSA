import java.util.*;
class RangeSumQuery
{
    public static int n=0;
    public static int seg[];
   public static int querying(int ind, int low, int high, int l, int h) {
    // No overlap
    if (high < l || low > h)
        return 0;

    // Complete overlap
    if (low >= l && high <= h)
        return seg[ind];

    // Partial overlap
    int mid = (low + high) / 2;
    int left = querying(2 * ind + 1, low, mid, l, h);
    int right = querying(2 * ind + 2, mid + 1, high, l, h);
    return left + right;
}

    public static void build(int a[],int ind,int l,int h)
    {
        if(l==h)
        {
            seg[ind]=a[l];
            return;
        }
        int m=(l+h)/2;
        build(a,2*ind+1,l,m);
        build(a,2*ind+2,m+1,h);
        seg[ind]=seg[2*ind+1]+seg[2*ind+2];
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        n=sc.nextInt();
        int a[]=new int[n];
        seg=new int[4*n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        build(a,0,0,n-1);
        System.out.println("Enter no:of queries:");
        int q=sc.nextInt();
        int query[][]=new int[q][2];
        for(int i=0;i<q;i++)
        {
            query[i][0]=sc.nextInt();
            query[i][1]=sc.nextInt();
            System.out.println(querying(0,0,n-1,query[i][0],query[i][1]));
        }
        

        
    
    }
}