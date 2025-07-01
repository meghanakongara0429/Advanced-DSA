import java.util.*;
class KMP
{
    public static int[] computeLPS(int lps[],String pat)
    {
        int m=pat.length();
        lps[0]=0;
        int len=0,i=1;
        while(i<m)
        {
            if(pat.charAt(i)==pat.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=len;
                    i++;
                }
            }
        }
        return lps;
    }
   static void kmpSearch(String txt,String pat)
    {
        int n=txt.length(),m=pat.length();
        int lps[]=new int[m];
        lps=computeLPS(lps,pat);
        int i=0,j=0;
        while(i<n)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m)
            {
                System.out.print(i-j+" ");
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j)!=txt.charAt(i))
            {
                if(j!=0)j=lps[j-1];
                else
                {
                    i++;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String pat=sc.nextLine();
        kmpSearch(txt,pat);
    }
}