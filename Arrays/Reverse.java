import java.util.*;
class Reverse
{
    public static void find(int a[],int n )
    {
        
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }

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
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}