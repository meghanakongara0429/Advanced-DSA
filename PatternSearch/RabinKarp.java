import java.util.*;
class RabinKarp
{
    static void find(String txt,String pat)
    {
        int n=txt.length(),m=pat.length(),p=0,t=0,h=1,q=101,d=256;
        for(int i=0;i<m-1;i++)
        h=(h*d)%q;
        for(int i=0;i<m;i++)
        {
            t=(d*t+txt.charAt(i))%q;
            p=(d*p+pat.charAt(i))%q;
            
        }
        for(int i=0;i<=n-m;i++)
        {
            
            if(p==t)
            {
                int j;
                for(j=0;j<m;j++)
                {
                    if(pat.charAt(j)!=txt.charAt(i+j))
                    break;
                }
                if(j==m)
                System.out.print(i+" ");

            }
            if(i<n-m)
            {
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m)) % q;
                if(t<0)t=t+q;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String txt=sc.nextLine();
        System.out.println("Enter pattern:");
        String pat=sc.nextLine();
        find(txt,pat);
        
    }

}