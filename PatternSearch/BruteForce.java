import java.util.Scanner;

class BruteForce
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String pat=sc.nextLine();
        int n=text.length(),m=pat.length();
        System.out.println("Pattern Found at:");
        int j=0;
        for(int i=0;i<=n-m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(pat.charAt(j)!=text.charAt(i+j))
                break;
            }
            if(j==m)
            System.out.print(i+" ");
        }
    }
}