import java.util.*;
class ProductArray
{
    public static void find(int a[],int n)
    {
        int l[]=new int[n];
        int r[]=new int[n];
        Arrays.fill(l,1);
        Arrays.fill(r,1);
        for(int i=1;i<n;i++)
        {
            l[i]=a[i-1]*l[i-1];
        }
        for(int i=n-2;i>=0;i--)
        r[i]=r[i+1]*a[i+1];
        for(int i=0;i<n;i++)
        System.out.print(l[i]*r[i]+" ");

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