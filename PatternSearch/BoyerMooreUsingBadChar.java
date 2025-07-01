import java.util.*;
class BoyerMooreUsingBadChar
{
    public static void badChar(String p,int bc[])
    {
        int m=p.length();
        for(int i=m-1;i>=0;i--)
        {
            bc[(int)p.charAt(i)]=i;
        }

    }
    public static ArrayList<Integer> boyerMoore(String t,String p)
    {
        ArrayList<Integer>a=new ArrayList<>();
        int n=t.length(),m=p.length();
        int bc[]=new int[256];
        badChar(p,bc);
        int i=0;
        while(i<=n-m)
        {
            int j=m-1;
            while(j>=0 && t.charAt(i+j)==p.charAt(j))
            j--;
            if(j<0)
            {
                a.add(i);
                if(i<n-m)
                i=i+m-bc[(int)t.charAt(i+m)];
                else
                i+=1;
            }
            else
            i=i+Math.max(1,j-bc[(int)t.charAt(i+j)]);
        }
        return a;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        String p=sc.nextLine();
        ArrayList<Integer>res=boyerMoore(t,p);
        for(Integer i:res)
        System.out.print(i+" ");
    }
}