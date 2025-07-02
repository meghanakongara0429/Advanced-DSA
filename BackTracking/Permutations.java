import java.util.*;
class Permutations
{
    static void swap (StringBuffer sb,int i,int ind)
    {
        
        char temp=sb.charAt(i);
        sb.setCharAt(i, sb.charAt(ind));
        sb.setCharAt(ind, temp);
    }
    static void find(int ind,StringBuffer sb,ArrayList<String>res)
    {
        if(ind==sb.length()-1)
        {
            res.add(sb.toString());
            return ;
        }
        for(int i=ind;i<sb.length();i++)
        {
            swap(sb,i,ind);
            find(ind+1,sb,res);
            swap(sb,i,ind);

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        ArrayList<String>res=new ArrayList<>();
        find(0,sb,res);
        for(String i:res)
        System.out.print(i+" ");
    }
}