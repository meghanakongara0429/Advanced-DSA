import java.util.*;

class AssignCookies {
    public static int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here
          Arrays.sort(Student);
        Arrays.sort(Cookie);
        int c=0;
        for(int i=0;i<Student.length;i++)
        {
           for(int j=0;j<Cookie.length;j++)
           {
               if(Cookie[j]>=Student[i])
               {
                   c++;
                   Cookie[j]=0;
                   break;
               }
           }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s[]=new int[n];
        int c[]=new int[m];
        for(int i=0;i<n;i++)
        s[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        c[i]=sc.nextInt();
        System.out.println(findMaximumCookieStudents(s,c));

    }
}