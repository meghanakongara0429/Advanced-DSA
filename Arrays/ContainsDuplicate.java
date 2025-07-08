import java.util.*;
class ContainsDuplicate
{
    public static boolean find(int a[],int n )
    {
        HashSet<Integer>hs=new HashSet<>();
        for(Integer i:a)
        {
            if(hs.contains(i))
            return true;
            hs.add(i);
        }
        return false;
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